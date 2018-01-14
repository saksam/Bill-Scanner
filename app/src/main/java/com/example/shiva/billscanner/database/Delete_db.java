package com.example.shiva.billscanner.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by shiva on 30-12-2017.
 */

public class Delete_db {

    Context context;
    public Delete_db(Context context) {
        this.context = context;
    }

    SQLiteDatabase database = Connect_db.getDatabase(context);
    public void DeleteData(String table,String query){
        database.execSQL(table);
        database.execSQL(query);
    }

}
