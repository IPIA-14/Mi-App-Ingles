package com.juan.myappjuanipia.controller;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.juan.myappjuanipia.R;


public class Menu2_preg1 extends AppCompatActivity {

    private boolean respondida = false;

    MediaPlayer sonido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_preg1);
    }


    public void sonarCorrecto(View view) {
        if (!respondida) {
            MostrasDatosUsers.sumarCorrecto();
            respondida = true;
        }
        sonido = MediaPlayer.create(this, R.raw.correcto);
        sonido.start();
        sonido.setOnCompletionListener(mp -> startActivity(new Intent(this, Menu2_preg2.class)));
    }


    public void sonarInorrecto(View view) {
        if (respondida) return; // <---- no permitir volver a responder
        respondida = true;
        sonido = MediaPlayer.create(this, R.raw.incorrecto);
        sonido.start();
        sonido.setOnCompletionListener(mp -> startActivity(new Intent(this, Menu2_preg2.class)));
    }
}