package com.example.shiva.billscanner.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by shiva on 30-12-2017.
 */

public class Insert_db {
    SQLiteDatabase database;
    Context context;
    public Insert_db(Context context) {

        this.context = context;
        database = Connect_db.getDatabase(context);
    }


    public void InsertData(String table,String query){
        database.execSQL(table);
        database.execSQL(query);
    }

}
