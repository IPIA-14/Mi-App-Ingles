package com.juan.myappjuanipia.controller;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.Datos;
import com.juan.myappjuanipia.model.Manager;

import java.util.ArrayList;

public class MostrasDatosUsers extends AppCompatActivity {

    private static int puntajeTotal = 0;
    private static String nicknameActual;

    // Manejo puntaje
    public static void sumarCorrecto() { puntajeTotal += 5; }
    public static int getPuntajeTotal() { return puntajeTotal; }
    public static void reiniciar() { puntajeTotal = 0; }

    // Manejo nickname
    public static void setNicknameActual(String nick) { nicknameActual = nick; }
    public static String getNicknameActual() { return nicknameActual; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostras_datos_users);

        ListView listView = findViewById(R.id.listDatos);
        Manager manager = new Manager(this);
        ArrayList<Datos> lista = manager.listarData();

        ArrayList<String> mostrar = new ArrayList<>();
        for (Datos d : lista) {
            mostrar.add(
                    "Nombre: " + d.getNombre() +
                            "\nApellido: " + d.getApellido() +
                            "\nNickname: " + d.getNickname() +
                            "\nEdad: " + d.getEdad() +
                            "\nColegio: " + d.getColegio() +
                            "\nGénero: " + d.getGenero() +
                            "\nPuntaje: " + d.getPuntaje()
            );
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mostrar);
        listView.setAdapter(adapter);
    }
}
