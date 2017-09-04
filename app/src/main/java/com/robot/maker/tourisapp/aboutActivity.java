package com.robot.maker.tourisapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class aboutActivity extends AppCompatActivity {

    ImageView img,img2,img3;

    contador cal1 = new contador();
    contador cal2 = new contador();
    contador cal3 = new contador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);




        img = (ImageView) findViewById(R.id.imageView4);
        img2 = (ImageView) findViewById(R.id.imageView5);
        img3 = (ImageView) findViewById(R.id.imageView6);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal1.in();
                Toast.makeText(aboutActivity.this, "1", Toast.LENGTH_SHORT).show();
                img.setVisibility(View.GONE);
                img2.setVisibility(View.VISIBLE);

            }



        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img2.setVisibility(View.GONE);
                img3.setVisibility(View.VISIBLE);
                cal2.in();
                Toast.makeText(aboutActivity.this, "2", Toast.LENGTH_SHORT).show();

            }



        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal3.in();
                Toast.makeText(aboutActivity.this, "3", Toast.LENGTH_SHORT).show();

                img3.setImageResource(R.drawable.logo_deg);
            }



        });



        //Botton  ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);


    }
}
