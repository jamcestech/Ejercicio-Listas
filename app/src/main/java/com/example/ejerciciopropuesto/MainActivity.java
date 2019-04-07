package com.example.ejerciciopropuesto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Element[] cosas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

        cosas = new Element[3];
        cosas[0] = new Element("Uno", R.drawable.uno);
        cosas[1] = new Element("Dos", R.drawable.dos);
        cosas[2] = new Element("Tres", R.drawable.tres);

      //  MiAdapter adapter = new MiAdapter(this, R.layout.custom, cosas);

        //lv.setAdapter(adapter);
    }
}
