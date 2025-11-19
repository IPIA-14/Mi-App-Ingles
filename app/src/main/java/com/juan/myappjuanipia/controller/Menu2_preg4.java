package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

public class Menu2_preg4 extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_preg4);
    }

    public void sonarCorrecto(View view) {
        sonido = MediaPlayer.create(Menu2_preg4.this, R.raw.correcto);
        sonido.start();

        sonido.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent intent = new Intent(Menu2_preg4.this, Menu2_preg5.class);
                startActivity(intent);
            }
        });
    }

    public void sonarInorrecto(View view) {
        sonido = MediaPlayer.create(Menu2_preg4.this, R.raw.incorrecto);
        sonido.start();
    }
}
