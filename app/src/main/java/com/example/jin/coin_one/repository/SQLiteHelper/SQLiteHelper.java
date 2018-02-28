package com.example.jin.coin_one.repository.SQLiteHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jin on 2018-02-28.
 */

public class SQLiteHelper extends SQLiteOpenHelper {
    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE local_list(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, price INTEGER, theme TEXT, location TEXT, memo TEXT, photo TEXT, latitude REAL, longitude REAL)"; // 로컬에서 저장하는 맛집 리스트 table
        db.execSQL(sql);
        String sql2 = "CREATE TABLE local_course(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, photo TEXT, memo TEXT,tag TEXT)";
        db.execSQL(sql2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE local_list";
        db.execSQL(sql);
        String sql2 = "DROP TABLE local_course";
        db.execSQL(sql2);
        onCreate(db);

    }


}
