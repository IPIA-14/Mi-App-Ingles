package com.juan.myappjuanipia.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Manager {

    private ConexionBd conexionBd;
    private SQLiteDatabase db;

    public Manager(Context context) {
        conexionBd = new ConexionBd(context);
    }

    public void openBdWr() {
        db = conexionBd.getWritableDatabase();
    }

    public void openBdRd() {
        db = conexionBd.getReadableDatabase();
    }

    public long insertData(Datos datos) {
        openBdWr();
        ContentValues values = new ContentValues();
        values.put("NOMBRE", datos.getNombre());
        values.put("APELLIDO", datos.getApellido());
        values.put("NICKNAME", datos.getNickname());
        values.put("EDAD", datos.getEdad());
        values.put("COLEGIO", datos.getColegio());
        values.put("GENERO", datos.getGenero());
        values.put("PUNTAJE", datos.getPuntaje());
        return db.insert("DATOS", null, values);
    }

    public void actualizarPuntaje(String nickname, int puntaje) {
        openBdWr();
        ContentValues values = new ContentValues();
        values.put("PUNTAJE", puntaje);
        db.update("DATOS", values, "NICKNAME = ?", new String[]{nickname});
    }

    public ArrayList<Datos> listarData() {
        openBdRd();
        ArrayList<Datos> lista = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM DATOS", null);

        if (cursor.moveToFirst()) {
            do {
                Datos d = new Datos();
                d.setNombre(cursor.getString(0));
                d.setApellido(cursor.getString(1));
                d.setNickname(cursor.getString(2));
                d.setEdad(cursor.getString(3));
                d.setColegio(cursor.getString(4));
                d.setGenero(cursor.getString(5));
                d.setPuntaje(cursor.getInt(6));
                lista.add(d);
            } while (cursor.moveToNext());
        }

        cursor.close();
        return lista;
    }
}
