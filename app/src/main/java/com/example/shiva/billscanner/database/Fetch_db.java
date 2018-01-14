package com.example.shiva.billscanner.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.shiva.billscanner.Main.Item;

import java.util.ArrayList;

/**
 * Created by shiva on 30-12-2017.
 */

public class Fetch_db {

    Context context;
    SQLiteDatabase database;

    public Fetch_db(Context context) {
        this.context = context;
        database= Connect_db.getDatabase(context);
    }



    public ArrayList<Item> FetchData(String table, String query) {
        database.execSQL(table);
        Cursor resultSet = database.rawQuery(query,null);
        int count=resultSet.getCount();
        resultSet.moveToFirst();
        ArrayList<Item>items = null;
        for(int i=0;i<count;i++) {
            int id = resultSet.getInt(0);
            String name = resultSet.getString(1);
            int completed = resultSet.getInt(2);
            double price = resultSet.getDouble(3);
            String date = resultSet.getString(4);
            String purchase = resultSet.getString(5);
            Item item = new Item(id,name, completed, price, date,purchase);
            items.add(item);
        }
        resultSet.close();
        return items;
    }

    public boolean IsValid(String table, String query) {
        database.execSQL(table);
        Cursor cursor = database.rawQuery(query, null);
        if (cursor.getCount() > 0) {
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }


}
