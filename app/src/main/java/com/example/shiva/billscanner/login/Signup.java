package com.example.shiva.billscanner.login;

import android.content.Context;

import com.example.shiva.billscanner.database.Fetch_db;
import com.example.shiva.billscanner.database.Insert_db;

/**
 * Created by shiva on 30-12-2017.
 */

public class Signup {

    Context context;
    String table,query;

    public Signup(Context context)
    {
        this.context=context;
    }
    public boolean logup(String user,String pass)
    {
        query="SELECT * FROM login WHERE username='"+user+"' and password='"+pass+"'";
        table="Create table if not exists login (username varchar primary key,password varchar)";

        Fetch_db fetch_db=new Fetch_db(context);
        if(fetch_db.IsValid(table,query))
        {
            return false;
        }
        else
        {
            query="INSERT INTO login values( '"+user+"' , '"+pass+"' )";
            Insert_db insert_db=new Insert_db(context);
            insert_db.InsertData(table,query);
            return true;
        }
    }
}
