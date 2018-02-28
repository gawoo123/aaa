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
        String sql = "CREATE TABLE ignore_list(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)"; // 로컬에서 저장하는 맛집 리스트 table
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE ignore_list";
        db.execSQL(sql);
        onCreate(db);

    }


}
