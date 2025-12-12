package com.juan.myappjuanipia.model;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ConexionBd extends SQLiteOpenHelper {


    private static final String BD = "registro.db";
    private static final int VERSION = 1;


    public ConexionBd(Context context) {
        super(context, BD, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DATOS (" +
                "NOMBRE TEXT, " +
                "APELLIDO TEXT, " +
                "NICKNAME TEXT, " +
                "EDAD TEXT, " +
                "COLEGIO TEXT, " +
                "GENERO TEXT, " +
                "PUNTAJE INTEGER)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    public void actualizarPuntajeUsuario(String nickname, int nuevoPuntaje) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("PUNTAJE", nuevoPuntaje); // el nombre de la columna tal como la creaste

        db.update("DATOS", values, "NICKNAME = ?", new String[]{nickname});
        db.close();
    }

}