
package com.juan.myappjuanipia.controller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;


import com.juan.myappjuanipia.R;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void iniciar(View view) {
        Intent siguiente = new Intent(MainActivity.this, MenuApp.class);
        startActivity(siguiente);
    }


    public void jugar(View view) {
        MostrasDatosUsers.reiniciar();
        Intent siguiente = new Intent(MainActivity.this, Menu2_preg1.class);
        startActivity(siguiente);
    }


    public void datos(View view) {
        Intent siguiente = new Intent(MainActivity.this, MostrasDatosUsers.class);
        startActivity(siguiente);
    }
}