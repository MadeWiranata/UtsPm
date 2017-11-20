package com.example.madewira.utspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        ImageView imgview;
        int linkGambar = 0;

        imgview=(ImageView)findViewById(R.id.Home);

        Intent intent=getIntent();
        String Tit = intent.getStringExtra("Tit");
        setTitle(Tit);
        linkGambar =intent.getIntExtra("simbol", linkGambar);
        imgview.setImageResource(linkGambar);
    }
}