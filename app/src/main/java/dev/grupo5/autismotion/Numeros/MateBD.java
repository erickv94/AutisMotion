package dev.grupo5.autismotion.Numeros;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MateBD extends SQLiteOpenHelper {
    private static MateBD singletonDBHelper;
    public static final String DATABASE="numeros.db";
    private static final int VERSION=1;

    public static MateBD getSingleton(Context context) {
        if (singletonDBHelper == null){
            singletonDBHelper = new MateBD(context.getApplicationContext());
        }

        return singletonDBHelper;
    }

    private MateBD(Context context){
        super(context,DATABASE,null,VERSION);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table imagenesnumeros ( id inetger not null, valor integer, nombre_imagen varchar(30), primary key (id) );");

    }

}
