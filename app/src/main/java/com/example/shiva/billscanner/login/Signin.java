package com.example.shiva.billscanner.login;

import android.content.Context;
import android.widget.Toast;

import com.example.shiva.billscanner.database.Fetch_db;

/**
 * Created by shiva on 30-12-2017.
 */

public class Signin {

    Context context;
    String query="",table="";

     public Signin(Context context)
    {
        this.context=context;
    }
    public boolean login(String user,String pass)
    {
        query="SELECT * FROM login WHERE username='"+user+"' and password='"+pass+"'";
        table="CREATE TABLE IF NOT EXISTS login(username varchar primary key,password varchar)";

        Fetch_db fetch_db=new Fetch_db(context);
        if(fetch_db.IsValid(table,query))
               return true;
        return false;
    }
}
