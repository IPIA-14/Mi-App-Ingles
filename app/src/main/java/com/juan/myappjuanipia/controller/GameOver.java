package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }

    public void inicio(View view) {
        Intent siguiente = new Intent(GameOver.this, MainActivity.class);
        startActivity(siguiente);
    }
}
