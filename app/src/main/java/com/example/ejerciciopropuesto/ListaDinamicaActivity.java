package com.example.ejerciciopropuesto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaDinamicaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<Element> cosas;
    ListView listaDinamica;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dinamica);

        et = findViewById(R.id.txtE);
        listaDinamica = findViewById(R.id.listaDinamica);
        cosas = new ArrayList<>();

        cosas.add(new Element("Hola", R.drawable.uno));
        ListAdapter adapter =  new MiAdapter(this, R.layout.custom, cosas);

        listaDinamica.setAdapter(adapter);

        listaDinamica.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(cosas.get(position).img == R.drawable.uno) {
            cosas.get(position).img = R.drawable.tres;
        } else {
            cosas.get(position).img = R.drawable.uno;
        }
        refresAdapter();
    }

    public void addTarea(View view) {
        cosas.add(new Element(et.getText().toString(), R.drawable.uno));
        et.setText("");
        refresAdapter();
    }

    public void refresAdapter() {
        ArrayAdapter adapter = (ArrayAdapter) listaDinamica.getAdapter();
        adapter.notifyDataSetChanged();
    }

}
