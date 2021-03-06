package com.example.dima.gymapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dima on 04.03.2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "visitorsGym";
    public static final String TABLE_VISITORS = "visitors";

    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_SURNAME = "surname";
    public static final String KEY_AGE = "age";
    public static final String KEY_MAIL = "mail";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_VISITORS + "(" + KEY_ID
        + " integer primary key autoincrement," + KEY_NAME + " text," + KEY_SURNAME
        + " text," + KEY_AGE + " integer," + KEY_MAIL + " text" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_VISITORS);

        onCreate(db);
    }
}
