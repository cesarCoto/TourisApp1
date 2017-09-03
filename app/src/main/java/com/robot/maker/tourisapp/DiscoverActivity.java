package com.robot.maker.tourisapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DiscoverActivity extends AppCompatActivity{

    Spinner spinner_ciudades;
    Button btn_buscar,ver_mas_campeche;
    CardView cardView_Campeche,cardView_Carmen,cardView_Calakmul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        spinner_ciudades = (Spinner) findViewById(R.id.spinner_discover_ciudades);
        btn_buscar = (Button) findViewById(R.id.bnt_discover_buscar);
        cardView_Campeche = (CardView) findViewById(R.id.card_campeche);
        cardView_Carmen = (CardView) findViewById(R.id.card_carmen);
        cardView_Calakmul = (CardView) findViewById(R.id.card_calakmul);
        ver_mas_campeche = (Button) findViewById(R.id.btn_more_cam);

        //se crea el array para las ciudades

        final String [] ciudades = {getString(R.string.todo),getString(R.string.discover_campeche),getString(R.string.discover_ciudad_del_carmen),getString(R.string.discover_calackmul),getString(R.string.zona_arqueologica_Edzna)
                ,getString(R.string.discover_los_petenes),getString(R.string.discover_zona_arqueologica_becan),getString(R.string.discover_pueblo_magico),
                getString(R.string.discover_cenote)};

        //se crea el adapter spinner
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ciudades);

        //se conecta array y adaptador
        spinner_ciudades.setAdapter(adapter);

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buscar();
            }
        });


        //Botton  ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);


        //ver mas campeche
        ver_mas_campeche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiscoverActivity.this,CampecheActivity.class);
                startActivity(i);
            }
        });
    }
    private void buscar(){

        String selectedItem = spinner_ciudades.getSelectedItem().toString();
        if(getString(R.string.todo).equals(selectedItem)){
            cardView_Campeche.setVisibility(View.VISIBLE);
            cardView_Carmen.setVisibility(View.VISIBLE);
            cardView_Calakmul.setVisibility(View.VISIBLE);
        }

        if(getString(R.string.discover_campeche).equals(selectedItem)){
            cardView_Campeche.setVisibility(View.VISIBLE);
            cardView_Carmen.setVisibility(View.GONE);
            cardView_Calakmul.setVisibility(View.GONE);
        }
        if(getString(R.string.discover_ciudad_del_carmen).equals(selectedItem)){
            cardView_Carmen.setVisibility(View.VISIBLE);
            cardView_Campeche.setVisibility(View.GONE);
            cardView_Calakmul.setVisibility(View.GONE);
        }
        if(getString(R.string.discover_calackmul).equals(selectedItem)){
            cardView_Calakmul.setVisibility(View.VISIBLE);
            cardView_Campeche.setVisibility(View.GONE);
            cardView_Carmen.setVisibility(View.GONE);
        }
    }
}
