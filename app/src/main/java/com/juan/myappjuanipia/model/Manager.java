package com.juan.myappjuanipia.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

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
        values.put("APELLIDO", datos.getApellido());
        values.put("NICKNAME", datos.getNickname());
        values.put("EDAD", datos.getEdad());
        values.put("COLEGIO", datos.getColegio());
        values.put("GENERO", datos.getGenero());
        values.put("PUNTAJE", datos.getPuntaje());
        long id = db.insert("DATOS", null, values);
        // closeBd();
        return id;
    }

    public ArrayList<Datos> listarData(){
        openBdRd();
        ArrayList<Datos> lista = new ArrayList<>();

        String sql = "SELECT * FROM DATOS";
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()){
            do{
                Datos datos = new Datos();
                datos.setNombre(cursor.getString(0));
                datos.setApeliido(cursor.getString(1));
                datos.setNickname(cursor.getString(2));
                datos.setEdad(cursor.getString(3));
                datos.setColegio(cursor.getString(4));
                datos.setGenero(cursor.getString(5));
                datos.setPuntaje(cursor.getString(6));
                lista.add(datos);


            } while(cursor.moveToNext());

        }
        return lista;
    }


}
