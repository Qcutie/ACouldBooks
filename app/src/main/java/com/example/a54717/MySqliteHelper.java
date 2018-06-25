package com.example.a54717;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MySqliteHelper extends SQLiteOpenHelper {


    public MySqliteHelper(Context context) {
        super(context, "Bookmaterial.db", null, 1);

        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub

        //db.execSQL("create table users(id integer primary key ,name text,pwd text)");
        db.execSQL("create table bookdialog(_id integer primary key autoincrement,name text,degree text,price real) ");
        //db.execSQL("create table materialdialog(id integer primary key,name ) ");
        /*String sql = "insert into users values (0,0,0)"; //id 自增加
        db.execSQL(sql);*/

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
       db.execSQL("drop table if exists Bookmaterial");
       onCreate(db);
    }

}