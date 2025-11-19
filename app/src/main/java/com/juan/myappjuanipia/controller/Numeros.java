package com.juan.myappjuanipia.controller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

public class Numeros extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);}

    public void sonar0(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.zero);
        sonido.start();
    }
    public void sonar1(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.one);
        sonido.start();
    }
    public void sonar2(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.two);
        sonido.start();
    }
    public void sonar3(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.trheee);
        sonido.start();
    }
    public void sonar4(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.four);
        sonido.start();
    }
    public void sonar5(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.five);
        sonido.start();
    }
    public void sonar6(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.six);
        sonido.start();
    }
    public void sonar7(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.seven);
        sonido.start();
    }
    public void sonar8(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.eight);
        sonido.start();
    }
    public void sonar9(View view){
        sonido = MediaPlayer.create(Numeros.this,R.raw.nine);
        sonido.start();
    }

}