package com.juan.myappjuanipia.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.ConexionBd;
import com.juan.myappjuanipia.model.Datos;
import com.juan.myappjuanipia.model.Manager;

public class Loguin extends AppCompatActivity {


    Manager manager;
    EditText txtNombre, txtApellido, txtNickname,txtEdad, txtColegio, txtpuntaje;
    RadioGroup rgGenero;
    Button btenviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);

        txtNombre = findViewById(R.id.edNombre);
        txtApellido = findViewById(R.id.edApellido);
        txtNickname= findViewById(R.id.edNickname);
        txtEdad = findViewById(R.id.edEdad);
        txtColegio = findViewById(R.id.edColegio);
        rgGenero = findViewById(R.id.rgGenero);
        btenviar = findViewById(R.id.btnLoguin);
        txtpuntaje = findViewById(R.id.edpuntaje);

        btenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = new Manager(Loguin.this);

                String nombre = txtNombre.getText().toString();
                String apellido = txtApellido.getText().toString();
                String nickname  = txtNickname.getText().toString();
                String edad = txtEdad.getText().toString();
                String colegio = txtColegio.getText().toString();
                String puntaje = txtpuntaje.getText().toString();

                int selectedId = rgGenero.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(Loguin.this, "Debe seleccionar un género", Toast.LENGTH_SHORT).show();
                    return;   // DETIENE EL ENVÍO Y EVITA EL CRASH
                }

                RadioButton selectedRadioButton = findViewById(selectedId);
                String genero = selectedRadioButton.getText().toString();

                //PASAMOS LOS DATOS AL POJO
                Datos datos = new Datos(nombre, apellido, nickname, edad, colegio, genero, puntaje);
                //LLAMAMOS AL METODO INSEETAR LOS VALORES
                long resul = manager.insertData(datos);

                if (resul != -1){
                    Toast.makeText(Loguin.this, "Datos insertados ✅", Toast.LENGTH_SHORT).show();
                    // Enviar a MainActivity
                    Intent ir = new Intent(Loguin.this, MainActivity.class);
                    startActivity(ir);
                    finish();

                }
                else{
                    Toast.makeText(Loguin.this, "Error al insertar los datos ❎✖️", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}