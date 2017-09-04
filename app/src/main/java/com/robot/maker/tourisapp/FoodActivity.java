package com.robot.maker.tourisapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        btn1 = (Button) findViewById(R.id.button_go);
        btn1 = (Button) findViewById(R.id.button_go1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:19.849664, -90.529650"));
                Intent chooser = Intent.createChooser(i,"Launch Maps");
                startActivity(chooser);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:19.845863, -90.538052"));
                Intent chooser = Intent.createChooser(i,"Launch Maps");
                startActivity(chooser);
            }
        });

    }
}
