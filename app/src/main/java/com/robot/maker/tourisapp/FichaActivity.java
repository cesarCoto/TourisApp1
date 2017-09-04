package com.robot.maker.tourisapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FichaActivity extends AppCompatActivity {

    WebView webViewinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha);

        webViewinfo = (WebView) findViewById(R.id.info_web);

        //Botton  ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        String w = bundle.getString("info");

        webViewinfo.loadUrl(w);

    }
}
