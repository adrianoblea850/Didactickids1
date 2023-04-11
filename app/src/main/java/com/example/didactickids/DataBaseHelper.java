package com.example.didactickids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String databaseName  = "DidacticKids.db";

    public DataBaseHelper(@Nullable Context context) {

        super(context, "DidacticKids.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create Table usuario(id INTEGER primary key autoincrement,nombre TEXT, apellido TEXT,email TEXT,nombreUsuario TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int i, int i1) {
        MyDatabase.execSQL("drop Table if exists usuarios");
    }
    public Boolean insertData(String nombre, String apellido, String email, String nombreUsuario, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nombre", nombre);
        contentValues.put("apellido",apellido);
        contentValues.put("email",email);
        contentValues.put("nomnreUsuario",nombreUsuario);
        contentValues.put("password",password);
        long resultado = MyDatabase.insert("usuarios",null,contentValues);

        if (resultado == -1){
            return false;
        }else {
            return true;
        }
    }
    public Boolean revisarNombreUsuario(String nombreUsuario, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from usuarios where nombreUsuario = ? and password = ?", new String[]{nombreUsuario, password});

        if (cursor.getCount()>0){
            return true;
        }else {
            return false;
        }
    }
    public Boolean revisarDatos(String nombreUsuario, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from usuarios where nombreUsuario = ?", new String[]{nombreUsuario});
        if (cursor.getCount()>0){
            return true;
        }else {
            return false;
        }
    }
}
