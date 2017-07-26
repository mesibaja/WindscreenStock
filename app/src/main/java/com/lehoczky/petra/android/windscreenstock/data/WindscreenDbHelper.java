package com.lehoczky.petra.android.windscreenstock.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WindscreenDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "windscreen.db";
    private static final int DATABASE_VERSION = 1;

    public WindscreenDbHelper(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSION); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PRODUCTS_TABLE = "CREATE TABLE " + WindscreenEntry.PRODUCTS_TABLE_NAME + "("
                + WindscreenEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WindscreenEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, "
                + WindscreenEntry.COLUMN_PRODUCT_PRICE + " INTEGER NOT NULL DEFAULT 0, "
                + WindscreenEntry.COLUMN_PRODUCT_QUANTITY + " INTEGER NOT NULL DEFAULT 0, "
                + WindscreenEntry.COLUMN_PRODUCT_SUPPLIER_EMAIL + " TEXT NOT NULL, "
                + WindscreenEntry.COLUMN_PRODUCT_IMAGE + " BLOB NOT NULL);";

        db.execSQL(SQL_CREATE_PRODUCTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // It is safe now as we only have one database version
        db.execSQL(" DROP TABLE IF EXISTS " + WindscreenEntry.PRODUCTS_TABLE_NAME);
        onCreate(db);
    }
}