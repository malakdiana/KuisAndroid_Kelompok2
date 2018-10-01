package com.example.verenca.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Fasilitas extends AppCompatActivity {
    private Button btBack;
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet,dataKeterangan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        btBack = (Button)findViewById(R.id.back);
        btBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent l = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(l);
            }
        });
        dataSet = new ArrayList<>();
        dataKeterangan = new ArrayList<>();
        initDataset();
        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);
        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(dataSet,dataKeterangan);
        rvView.setAdapter(adapter);
    }
    private void initDataset(){
        /**
         * Tambahkan item ke dataset
         * dalam prakteknya bisa bermacam2
         * tidak hanya String seperti di kasus ini
         */
        dataSet.add("Lokasi Halaman Depan");
        dataSet.add("Ruang 1");
        dataSet.add("Ruang 2");
        dataSet.add("Musholla");
        dataSet.add("Parkir");
        dataSet.add("Toilet");

//        dataSet.add("Hanifa");

        dataKeterangan.add("Ruang pameran terbuka yang memamerkan benda-benda bersejarah");
        dataKeterangan.add("Di ruangan ini terdapat meja dan kursi yang digunakan oleh Bung Karno");
        dataKeterangan.add("Di ruangan ini terdapat benda bersejarah");
        dataKeterangan.add("Fasilitas Musholla");
        dataKeterangan.add("Fasilitas Parkir yang luas");
        dataKeterangan.add("Fasilitas Toilet");


//        dataKeterangan.add("blabla");

    }
}
