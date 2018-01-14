package com.example.shiva.billscanner.bill;

import com.example.shiva.billscanner.Main.Item;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shiva on 30-12-2017.
 */

interface Bill{

    ArrayList<Item> show(Date start, Date end);

}
