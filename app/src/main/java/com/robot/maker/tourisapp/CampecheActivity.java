package com.robot.maker.tourisapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class CampecheActivity extends AppCompatActivity {

    //more_his
    TextView tv_his1_cam,tv_his2_cam;
    ImageView Img_his_cam;
    //more_info
    TextView tv_inf_cam1,tv_inf_cam2;
    ImageView img_info_cam;


    Button btn_instructions,btn_gastro,btn_hotel,btn_weather,btn_historia,btn_piratas,btn_all_cam,btn_como_llegar;
    ToggleButton tgbtn_more_history,tgbtn_more_info;

    //partes del Activity
    CardView card_historia_campeche, card_introduccion_campeche;

    //Historia ver


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campeche);



        //maps
        btn_como_llegar = (Button) findViewById(R.id.btn_cam_como_llegar);
        btn_como_llegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:19.834110, -90.534843"));
                Intent chooser = Intent.createChooser(i,"Launch Maps");
                startActivity(chooser);
            }
        });

        //cards
        card_historia_campeche = (CardView) findViewById(R.id.card_historia_campeche);
        card_introduccion_campeche = (CardView) findViewById(R.id.card_introduccion_campeche);

        //como llegar
        btn_instructions = (Button) findViewById(R.id.btn_cam_como_llegar);


        //gastronomia
        btn_gastro = (Button) findViewById(R.id.btn_campeche_gastronomia);

        //Hoteles
        btn_hotel = (Button) findViewById(R.id.btn_cam_hoteles);

        //historia
        btn_historia = (Button) findViewById(R.id.btn_historia_cam);
        btn_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar_historia();
            }
        });

        //all
        btn_all_cam = (Button)findViewById(R.id.btn_all_campeche);
        btn_all_cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar_todo();
            }
        });

        //piratas
        btn_piratas = (Button) findViewById(R.id.btn_cam_piratas);


        //Clima
        btn_weather =(Button)findViewById(R.id.btn_wather_cam);
        //se asigana el listener
        btn_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clima();
            }
        });

        //more_history
        tgbtn_more_history = (ToggleButton) findViewById(R.id.tg_btn_more_historia_cam);
        tv_his1_cam = (TextView) findViewById(R.id.txt_historia_campeche3);
        tv_his2_cam = (TextView) findViewById(R.id.txt_historia_campeche4);
        Img_his_cam = (ImageView) findViewById(R.id.image_historia_campeche2);

        //more_inf
        tgbtn_more_info = (ToggleButton) findViewById(R.id.tg_btn_more_info_cam);
        tv_inf_cam1 = (TextView) findViewById(R.id.txt_historia2_cam);
        tv_inf_cam2 = (TextView) findViewById(R.id.txt_historia3_cam);
        img_info_cam = (ImageView) findViewById(R.id.img_info_cam2);




    }
    private void clima(){
        Intent i = new Intent(this,ClimaActivity.class);
        i.putExtra("web","https://www.accuweather.com/en/mx/campeche/231865/weather-forecast/231865");
        startActivity(i);
    }
    public void OnToggleClick_histora(View v){
        if(tgbtn_more_history.isChecked()){
            tv_his1_cam.setVisibility(View.VISIBLE);
            tv_his2_cam.setVisibility(View.VISIBLE);
            Img_his_cam.setVisibility(View.VISIBLE);


        }else{
            tv_his1_cam.setVisibility(View.GONE);
            tv_his2_cam.setVisibility(View.GONE);
            Img_his_cam.setVisibility(View.GONE);
        }
    }
    public  void OnToggleClick_info(View view){
       if(tgbtn_more_info.isChecked()) {
           tv_inf_cam1.setVisibility(View.VISIBLE);
           tv_inf_cam2.setVisibility(View.VISIBLE);
           img_info_cam.setVisibility(View.VISIBLE);
       }else{
           tv_inf_cam1.setVisibility(View.GONE);
           tv_inf_cam2.setVisibility(View.GONE);
           img_info_cam.setVisibility(View.GONE);
       }
    }

    private void mostrar_historia(){
        card_historia_campeche.setVisibility(View.VISIBLE);
        card_introduccion_campeche.setVisibility(View.GONE);
    }
    private void mostrar_todo(){
        card_historia_campeche.setVisibility(View.VISIBLE);
        card_introduccion_campeche.setVisibility(View.VISIBLE);
    }

}
