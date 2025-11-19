package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

public class MenuApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);
    }
    public void numeros(View view){
        Intent numeros = new Intent(MenuApp.this, Numeros.class );
        startActivity(numeros);
    }
    public void colores(View view){
        Intent colores = new Intent(MenuApp.this, Colores.class );
        startActivity(colores);
    }
    public void animales(View view){
        Intent animales = new Intent(MenuApp.this, Animales.class );
        startActivity(animales);
    }
    public void frutas(View view){
        Intent frutas = new Intent(MenuApp.this, Frutas.class );
        startActivity(frutas);
    }
}