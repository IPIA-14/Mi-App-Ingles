package com.juan.myappjuanipia.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Manager{

    private ConexionBd conexionBd;
    private SQLiteDatabase db;

    public  Manager (Context context){
        //llamamos la conexion
        conexionBd = new ConexionBd(context);
    }
    //base de datos en modo escritura
    public void openBdWr(){
        db = conexionBd.getWritableDatabase();
    }
    public void openBdRd(){
        db = conexionBd.getWritableDatabase();
    }
    public void closeBd(){
        db.close();
    }
    public long insertData(Datos datos){
        openBdWr();
        ContentValues values = new ContentValues();
        values.put("NOMBRE", datos.getNombre());
        values.put("APELLIDO", datos.getApeliido());
        values.put("NICKNAME", datos.getNickname());
        values.put("EDAD", datos.getEdad());
        values.put("COLEGIO", datos.getColegio());
        values.put("GENERO", datos.getGenero());
        long id = db.insert("DATOS", null, values);
        // closeBd();
        return id;
    }
}
