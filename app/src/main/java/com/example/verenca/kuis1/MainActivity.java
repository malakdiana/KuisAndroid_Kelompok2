package com.example.verenca.kuis1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btMaps;
private Button btGambar;
    private Button btFasilitas;
    private Button btOpini;
    private Button btDes;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGambar = (Button)findViewById(R.id.gambar);
        btGambar.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent i = new Intent(getApplicationContext(), Gambar.class);
            startActivity(i);
           }
        });
        btFasilitas= (Button)findViewById(R.id.fasilitas);
        btFasilitas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent j = new Intent(getApplicationContext(), Fasilitas.class);
                startActivity(j);
            }
        });
        btDes = (Button)findViewById(R.id.deskripsi);
        btDes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent k = new Intent(getApplicationContext(), Deskripsi.class);
                startActivity(k);
            }
        });
        btOpini = (Button)findViewById(R.id.opini);
        btOpini.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent l = new Intent(getApplicationContext(), Opini.class);
                startActivity(l);
            }
        });

        btMaps = (Button)findViewById(R.id.maps);
        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/-7.9472174,112.6138938/alamat+museum+brawijaya/@-7.9608826,112.6109771,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2dd628291cc584d5:0x44947ed5ec722b02!2m2!1d112.6212241!2d-7.9720882"));
                startActivity(m);
            }
        });


    }
}
