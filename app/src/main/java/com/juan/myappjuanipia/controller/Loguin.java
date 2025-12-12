package com.juan.myappjuanipia.controller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.Datos;
import com.juan.myappjuanipia.model.Manager;


public class Loguin extends AppCompatActivity {


    Manager manager;
    EditText txtNombre, txtApellido, txtNickname, txtEdad, txtColegio;
    RadioGroup rgGenero;
    Button btenviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);


        manager = new Manager(this);


        txtNombre = findViewById(R.id.edNombre);
        txtApellido = findViewById(R.id.edApellido);
        txtNickname = findViewById(R.id.edNickname);
        txtEdad = findViewById(R.id.edEdad);
        txtColegio = findViewById(R.id.edColegio);
        rgGenero = findViewById(R.id.rgGenero);
        btenviar = findViewById(R.id.btnLoguin);


        btenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                String apellido = txtApellido.getText().toString();
                String nickname = txtNickname.getText().toString();
                String edad = txtEdad.getText().toString();
                String colegio = txtColegio.getText().toString();


                if (nombre.isEmpty() || apellido.isEmpty() || nickname.isEmpty() || edad.isEmpty() || colegio.isEmpty()) {
                    Toast.makeText(Loguin.this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
                    return;
                }


                int selectedId = rgGenero.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(Loguin.this, "Debe seleccionar un género", Toast.LENGTH_SHORT).show();
                    return;
                }


                RadioButton selectedRadioButton = findViewById(selectedId);
                String genero = selectedRadioButton.getText().toString();


                Datos datos = new Datos(nombre, apellido, nickname, edad, colegio, genero, "0");
                long resul = manager.insertData(datos);


                if (resul != -1) {
                    MostrasDatosUsers.setNicknameActual(nickname);
                    Toast.makeText(Loguin.this, "Datos insertados", Toast.LENGTH_SHORT).show();
                    Intent ir = new Intent(Loguin.this, MainActivity.class);
                    startActivity(ir);
                    finish();
                } else {
                    Toast.makeText(Loguin.this, "Error al insertar los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}