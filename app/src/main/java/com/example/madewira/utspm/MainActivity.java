package com.example.madewira.utspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    ListView listView;
    Intent intent;
    String[] nama = {"Persegi", "Lingkaran", "Segitiga","Persegi Panjang","Trapesiun"};
    Integer[] gambar ={R.drawable.persegi,R.drawable.lingkaran,R.drawable.segitiga,R.drawable.persegi_panjang,R.drawable.trapesiun};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        custom adapter= new custom(this, nama,gambar);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nama);
        listView.setAdapter(arrayAdapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                Intent intent = new Intent(this, PersegiActivity.class);
                intent.putExtra("Tit", "Persegi");
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, LingkaranActivity.class);
                intent1.putExtra("Tit", "Lingkaran");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, SegiTigaActivity.class);
                intent2.putExtra("Tit", "Segitiga");
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, DuaActivity.class);
                intent3.putExtra("Tit", "Persegi Panjang");
                intent3.putExtra("simbol", R.drawable.persegi_panjang);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, DuaActivity.class);
                intent4.putExtra("Tit", "Trapesiun");
                intent4.putExtra("simbol", R.drawable.trapesiun);
                startActivity(intent4);
                break;

        }
    }
}
