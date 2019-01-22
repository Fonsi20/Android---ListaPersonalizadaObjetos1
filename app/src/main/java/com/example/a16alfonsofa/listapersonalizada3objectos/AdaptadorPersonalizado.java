package com.example.a16alfonsofa.listapersonalizada3objectos;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by a16alfonsofa on 15/01/2019.
 */

public class AdaptadorPersonalizado extends ArrayAdapter {

    private Activity context;
    private String[] animales;
    private String[] Descipciones;
    private Integer[] fotosIds;

    public AdaptadorPersonalizado(Activity context, String[] animales, Integer[] fotosIds, String[] descipciones) {
        super(context, R.layout.fila_layout, animales);
        this.context = context;
        this.animales = animales;
        this.fotosIds = fotosIds;
        this.Descipciones = descipciones;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View fila = layoutInflater.inflate(R.layout.fila_layout, null);

        TextView txAnimal = (TextView) fila.findViewById(R.id.txAnimal);
        ImageView imagen = (ImageView) fila.findViewById(R.id.imgIcon);
        TextView txDescrop = (TextView) fila.findViewById(R.id.txDescripcionAnimal);

        txAnimal.setText(animales[position]);
        txDescrop.setText(Descipciones[position]);
        imagen.setImageResource(fotosIds[position]);

        return fila;
    }
}

