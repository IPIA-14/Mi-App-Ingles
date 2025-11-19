package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.ConexionBd;

public class Loguin extends AppCompatActivity {

    ConexionBd conexionBd;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);

        conexionBd = new ConexionBd(Loguin.this);
        db = conexionBd. getWritableDatabase();
        Toast.makeText(this, "Base de datos creada", Toast.LENGTH_SHORT).show();

    }

    public void loguinNext(View view){
        Intent siguiente = new Intent(Loguin.this, MainActivity.class );
        startActivity(siguiente);
    }

}