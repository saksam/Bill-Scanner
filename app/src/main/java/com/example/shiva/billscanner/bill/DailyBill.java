package com.example.shiva.billscanner.bill;

import android.content.Context;

import com.example.shiva.billscanner.Main.Item;
import com.example.shiva.billscanner.database.Fetch_db;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shiva on 30-12-2017.
 */

public class DailyBill implements Bill{
    Context context;
    DailyBill(Context context){
        this.context = context;
    }
    @Override
    public ArrayList<Item> show(Date start, Date end) {
        Fetch_db fetch_db = new Fetch_db(context);
        String table = "";
        String query = "";
        ArrayList<Item>item;
        item = fetch_db.FetchData(table,query);
        return item;
    }
}
