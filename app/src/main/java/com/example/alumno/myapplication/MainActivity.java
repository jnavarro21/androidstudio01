package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alumno.myapplication.models.XPath;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<XPath> mylistita = new ArrayList<>();

        XPath mypath1 = new XPath(-72.2808659,42.9269700);
        mylistita.add(mypath1);
        XPath mypath2 = new XPath(-72.2798359,42.9261215);
        mylistita.add(mypath2);
        XPath mypath3 = new XPath(-72.2794497,42.9268678);
        mylistita.add(mypath3);
        XPath mypath4 = new XPath(-72.2799647,42.9272371);
        mylistita.add(mypath4);
        XPath mypath5 = new XPath(-72.2808981,42.9269542);
        mylistita.add(mypath5);

        String url = "https://www.keene.edu/campus/maps/tool/?coordinates=";

        String ruta = "";

        //message
        Toast.makeText(this,
                String.format("Hay %s elementos | %s",
                        mylistita.size(), "Todo va bien"),
                Toast.LENGTH_LONG).show();

        int i=1;

        for (XPath current_object : mylistita){

            ruta += current_object.longitud + "%2C%20" + current_object.latitud;

            if (i<mylistita.size()){
                ruta+="%0A";
            }
            i++;

        }

        Log.v("bichito", url+ruta);

        setContentView(R.layout.activity_main);
    }
}
