package com.robot.maker.tourisapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CampecheActivity extends AppCompatActivity {

    Button btn_instructions,btn_gastro,btn_hotel,btn_weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeche);

        //como llegar
        btn_instructions = (Button) findViewById(R.id.btn_cam_como_llegar);


        //gastronomia
        btn_gastro = (Button) findViewById(R.id.btn_campeche_gastronomia);

        //Hoteles
        btn_hotel = (Button) findViewById(R.id.btn_cam_hoteles);


        //Clima
        btn_weather =(Button)findViewById(R.id.btn_wather_cam);
        //se asigana el listener
        btn_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clima();
            }
        });

    }
    private void clima(){
        Intent i = new Intent(this,ClimaActivity.class);
        i.putExtra("web","https://www.accuweather.com/en/mx/campeche/231865/weather-forecast/231865");
        startActivity(i);
    }
}
