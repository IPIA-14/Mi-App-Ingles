package com.juan.myappjuanipia.controller;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.juan.myappjuanipia.R;
import com.juan.myappjuanipia.model.Datos;
import com.juan.myappjuanipia.model.Manager;

public class MostrasDatosUsers extends AppCompatActivity {


    ListView listView;

    ArrayAdapter<Datos> adapter;

    Manager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostras_datos_users);

        listView = findViewById(R.id.listDatos);
        manager = new Manager(MostrasDatosUsers.this);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,manager.listarData());
        listView.setAdapter(adapter);


    }
}