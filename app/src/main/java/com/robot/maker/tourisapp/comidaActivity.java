package com.robot.maker.tourisapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class comidaActivity extends AppCompatActivity {


    Button btn1,bnt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);

        btn1 = (Button) findViewById(R.id.btn_restaurant_cam);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:19.849558, -90.529867"));
                Intent chooser = Intent.createChooser(i,"Launch Maps");
                startActivity(chooser);
            }
        });

        bnt2 = (Button) findViewById(R.id.btn_restaurant1_cam);
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:19.849558, -90.529867"));
                Intent chooser = Intent.createChooser(i,"Launch Maps");
                startActivity(chooser);
            }
        });

        //hola
        //Botton  ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);


    }
}
