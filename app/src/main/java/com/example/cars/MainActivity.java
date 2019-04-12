package com.example.cars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText txt_carname, txt_year, txt_color, txt_price, txt_engine_size;
    TextView result;
    Button btn_add_car;
    ModelCar car = new ModelCar();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_carname = findViewById(R.id.txt_carname);
        txt_year = findViewById(R.id.txt_year);
        txt_color = findViewById(R.id.txt_color);
        txt_price = findViewById(R.id.txt_price);
        txt_engine_size = findViewById(R.id.txt_engine_size);

        result=findViewById(R.id.result);

        btn_add_car=findViewById(R.id.btn_add_car);

        btn_add_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Setting the value for car model*/
                car.setCar_name(txt_carname.getText().toString());
                car.setYear(txt_year.getText().toString());
                car.setColor(txt_color.getText().toString());
                car.setPrice(txt_price.getText().toString());
                car.setEngine_size(txt_engine_size.getText().toString());

                /*getting values form car model and storing it in variables*/

                String carname, year, color, price, engine_size;

                carname = car.getCar_name().toString();
                year = car.getYear().toString();
                color = car.getColor().toString();
                price = car.getPrice().toString();
                engine_size = car.getEngine_size().toString();

                /*textview to display values in scroll views */

                Log.d("car name", "Car name: "+txt_carname.getText().toString());


                String load_data = result.getText().toString() +
                        "\r\n" +
                        "\r\n" + "Car name : " + carname +
                        "\r\n" + "Year : " + year +
                        "\r\n" + "Color : " + color +
                        "\r\n" + "Price : " + price +
                        "\r\n" + "Engine Size : " + engine_size;

                result.setText(load_data);
            }
        });

    }
}
