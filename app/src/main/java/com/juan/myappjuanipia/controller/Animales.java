package com.juan.myappjuanipia.controller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

public class Animales extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }

    public void sonarPig(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.pig);
        sonido.start();
    }
    public void sonarHen(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.hen);
        sonido.start();
    }
    public void sonarDuck(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.duck);
        sonido.start();
    }
    public void sonarSheep(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.sheep);
        sonido.start();
    }
    public void sonarDog(View view){
        sonido = MediaPlayer.create(Animales.this,R.raw.dog);
        sonido.start();
    }


}