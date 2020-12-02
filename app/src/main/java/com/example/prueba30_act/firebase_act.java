package com.example.prueba30_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firebase_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_act);
    }
    public void listado(View v){
        Intent i = new Intent(this, listadodeclientes.class);
        startActivity(i);

    }
}