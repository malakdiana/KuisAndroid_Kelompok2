package com.example.verenca.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Opini extends AppCompatActivity {
    private Button btBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opini);
        btBack = (Button)findViewById(R.id.back);
        btBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent l = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(l);
            }
        });
    }
}
