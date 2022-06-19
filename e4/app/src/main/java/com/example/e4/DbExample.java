package com.example.e4;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbExample extends SQLiteOpenHelper {
    public DbExample(Context context) {
        super(context, "details.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table students(name text, message text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void sav(String name, String message){
        SQLiteDatabase db  = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("message",message);
        db.insert("students",null,cv);
    }

    public String retrv(String name){
        SQLiteDatabase db  = this.getWritableDatabase();
        Cursor c = db.query("students",null,"name=?",new String[]{name},null,null,null);
        c.moveToFirst();
        if(c.getCount()<1){
            return "Not Exists";
        }
        else{
            @SuppressLint("Range") String s = c.getString(c.getColumnIndex("message"));
            return  s;
        }

    }
}