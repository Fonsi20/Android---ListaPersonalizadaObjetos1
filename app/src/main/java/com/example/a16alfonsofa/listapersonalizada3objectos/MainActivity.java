package com.example.a16alfonsofa.listapersonalizada3objectos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv_animales);

        String[] arrayAnimales = getResources().getStringArray(R.array.animales);
        String[] arrayDescrip = getResources().getStringArray(R.array.DescripAnimales);
        Integer[] idFotos = new Integer[]{R.drawable.aguila, R.drawable.ballena, R.drawable.caballo, R.drawable.canario, R.drawable.delfin, R.drawable.gato, R.drawable.libro, R.drawable.perro, R.drawable.vaca};

        AdaptadorPersonalizado adaptador = new AdaptadorPersonalizado(this, arrayAnimales, idFotos,arrayDescrip);
        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Elección: " + parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
            }
        });

    }
}