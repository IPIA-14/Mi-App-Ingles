package com.juan.myappjuanipia.controller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

public class Frutas extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);}

    public void sonarCherry(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.cherry);
        sonido.start();
    }
    public void sonarOrange_futa(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.orange_fruta);
        sonido.start();
    }
    public void sonarStrawberry(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.strawberry);
        sonido.start();
    }
    public void sonarWstermelon(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.wstermelon);
        sonido.start();
    }
    public void sonarMango(View view){
        sonido = MediaPlayer.create(Frutas.this,R.raw.mang0);
        sonido.start();
    }



}