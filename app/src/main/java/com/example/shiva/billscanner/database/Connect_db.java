package com.example.shiva.billscanner.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by shiva on 30-12-2017.
 */

/*

    Applied Singleton design pattern in following class so that only single instance is created
    for the database connection.11206835027

 */

public class Connect_db {
    private Connect_db(){}
    private static SQLiteDatabase database=null;
    public static SQLiteDatabase getDatabase(Context context){
        if(database==null)
            database = context.openOrCreateDatabase("cms", MODE_PRIVATE, null);
        return database;
    }
}
