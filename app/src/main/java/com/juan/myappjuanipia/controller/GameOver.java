package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.Manager;

public class GameOver extends AppCompatActivity {

    TextView tv_puntaje;
    Manager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        tv_puntaje = findViewById(R.id.tv_puntaje);
        manager = new Manager(this);

        int puntajeFinal = MostrasDatosUsers.getPuntajeTotal();
        tv_puntaje.setText("Puntaje final: " + puntajeFinal);

        String nickname = MostrasDatosUsers.getNicknameActual();
        if (nickname != null) {
            manager.actualizarPuntaje(nickname, puntajeFinal);
        }
    }

    public void inicio(View view){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
