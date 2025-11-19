package com.juan.myappjuanipia.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.juan.myappjuanipia.R;

public class Alerta_Dialogos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerta_dialogos);
    }

    public void alerta1(View view) {
        Toast.makeText(this, "Este es un mensaje Toast", Toast.LENGTH_SHORT).show();
    }
    public void alerta2(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Alerta simple")
                .setMessage("Este es un mensaje de alerta simple")
                .setPositiveButton("OK", null)
                .show();
    }
    public void alerta3(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirmación")
                .setMessage("¿Deseas continuar con esta acción?")
                .setPositiveButton("Sí", (dialog, which) ->
                        Toast.makeText(this, "Elegiste Sí", Toast.LENGTH_SHORT).show())
                .setNegativeButton("No", (dialog, which) ->
                        Toast.makeText(this, "Elegiste No", Toast.LENGTH_SHORT).show())
                .setNeutralButton("Cancelar", (dialog, which) ->
                        Toast.makeText(this, "Cancelaste la acción", Toast.LENGTH_SHORT).show())
                .show();
    }
    public void alerta4(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alerta personalizada");
        builder.setMessage("Este es un mensaje personalizado para el usuario.");
        builder.setPositiveButton("Aceptar", (dialog, which) ->
                Toast.makeText(this, "Has aceptado", Toast.LENGTH_SHORT).show());
        builder.setNegativeButton("Cerrar", (dialog, which) -> dialog.dismiss());
        builder.show();
    }
}
