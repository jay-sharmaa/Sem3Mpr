package com.example.shoppinapp;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    private static final String login_dbname="login";
    private static final String login_table="logintable";
    private static final String username="username";
    private static final String password="password";
    private static final String email="email";
    private static final int version=1;
    private static final String id="id";
    String u="";
    String p="";
    String e="";
    public database( Context context) {
        super(context, login_dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase dbb) {
  dbb.execSQL(" Create table "+ login_table +"("+ id +" INTEGER PRIMARY KEY AUTOINCREMENT, "+ username +" TEXT, "+ password +" TEXT, "+ email +" TEXT "+")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase dbb, int i, int i1) {
    dbb.execSQL("DROP TABLE IF EXISTS "+login_dbname);
    onCreate(dbb);

    }

    public void add(String name,String pass,String em){
    SQLiteDatabase dbb=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put(username,name);
        c.put(password,pass);
        c.put(email,em);
        long result=dbb.insert(login_table,null,c);
    }

    public boolean searchusername(String username){
        SQLiteDatabase dbb=this.getReadableDatabase();
        Cursor cur=dbb.rawQuery("Select * from logintable where username = ?",new String[]{username});
        if(cur.getCount()>0)
            return true;
        else
            return false;
    }
    public boolean serachusernamepassword(String username,String password,String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cur = db.rawQuery("Select * from logintable where username = ? and password = ? ", new String[]{username, password});
        if (cur.getCount() > 0) {
            u = username;
            p = password;
            e = email;
            return true;
        }
        else
            return false;
    }

    public String[] give(){
    String []str=new String[3];
    str[0]=u;
    str[1]=p;
    str[2]=e;
    return str;

    }

}
