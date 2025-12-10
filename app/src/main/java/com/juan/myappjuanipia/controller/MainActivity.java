package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.ConexionBd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void iniciar(View view){
        Intent  siguiente = new Intent(MainActivity.this, MenuApp.class );
        startActivity(siguiente);
    }
    public void jugar(View view){
        Intent  siguiente = new Intent(MainActivity.this, Menu2_preg1.class );
        startActivity(siguiente);
    }
    public void dialogos(View view){
        Intent  siguiente = new Intent(MainActivity.this, Alerta_Dialogos.class );
        startActivity(siguiente);
    }
    public  void libreria(View view){
        Intent siguiente = new Intent(MainActivity.this, Libreria.class);
        startActivity(siguiente);
    }
    public  void preguntas(View view){
        Intent siguiente = new Intent(MainActivity.this, Preguntas.class);
        startActivity(siguiente);
    }
    public  void datos(View view){
        Intent siguiente = new Intent(MainActivity.this, MostrasDatosUsers.class);
        startActivity(siguiente);
    }
}

