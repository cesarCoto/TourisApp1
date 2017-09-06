package com.robot.maker.tourisapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class aboutActivity extends AppCompatActivity {

    ImageView img,img2,img3,img4,img5;
    TextView tv;

    contador cal1 = new contador();
    contador cal2 = new contador();
    contador cal3 = new contador();
    contador cal4 = new contador();
    contador cal5 = new contador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        tv = (TextView) findViewById(R.id.textView7);

        img = (ImageView) findViewById(R.id.imageView4);
        img2 = (ImageView) findViewById(R.id.imageView5);
        img3 = (ImageView) findViewById(R.id.imageView6);
        img4 = (ImageView) findViewById(R.id.imageView7);
        img5 = (ImageView) findViewById(R.id.imageView8);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal1.in();
               // Toast.makeText(aboutActivity.this, "1", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(aboutActivity.this, "1", Toast.LENGTH_SHORT).show();

            }



        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img3.setVisibility(View.GONE);
                img4.setVisibility(View.VISIBLE);
                cal3.in();
                Toast.makeText(aboutActivity.this, "2", Toast.LENGTH_SHORT).show();

                //img3.setImageResource(R.drawable.logo_deg);
            }



        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img4.setVisibility(View.GONE);
                img5.setVisibility(View.VISIBLE);
                cal4.in();
                Toast.makeText(aboutActivity.this, "3", Toast.LENGTH_SHORT).show();

                //img3.setImageResource(R.drawable.logo_deg);
            }



        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal5.in();
                Toast.makeText(aboutActivity.this, ";)", Toast.LENGTH_SHORT).show();

                img5.setImageResource(R.drawable.hola);
                tv.setText(getText(R.string.makerobot));
            }



        });


        //Botton  ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);


    }
}
