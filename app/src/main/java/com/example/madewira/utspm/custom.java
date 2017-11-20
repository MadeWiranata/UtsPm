package com.example.madewira.utspm;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nama;
    private final Integer[] menuGambar;

    public custom (Activity context, String[] nama, Integer[] menuGambar) {
        super(context, R.layout.activity_custom, nama);
        this.context = context;
        this.nama = nama;
        this.menuGambar = menuGambar;

    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_custom, null, true);

        TextView textMenu = (TextView) rowView.findViewById(R.id.nama);
        ImageView imgMenu = (ImageView) rowView.findViewById(R.id.imageView);

        textMenu.setText(nama[position]);
        imgMenu.setImageResource(menuGambar[position]);

        return rowView;

    }
}

