package com.example.jin.coin_one;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import com.example.jin.coin_one.repository.SQLiteHelper.SQLiteHelper;
import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by jin on 2018-02-27.
 */

public class App extends Application{

    SQLiteHelper sqliteHelper;
    String dbName = "st_file.db";
    int dbVersion = 1; // 데이터베이스 버전
    public static SQLiteDatabase db;
    String tag = "SQLite"; // Log 에 사용할 tag


    @Override
    public void onCreate() {
        super.onCreate();

        //SQLite
        sqliteHelper = new SQLiteHelper(this, dbName, null, dbVersion);

        try {
//         // 데이터베이스 객체를 얻어오는 다른 간단한 방법
//         db = openOrCreateDatabase(dbName,  // 데이터베이스파일 이름
//                          Context.MODE_PRIVATE, // 파일 모드
//                          null);    // 커서 팩토리
//
//         String sql = "create table mytable(id integer primary key autoincrement, name text);";
//        db.execSQL(sql);

            db = sqliteHelper.getWritableDatabase(); // 읽고 쓸수 있는 DB
            //db = helper.getReadableDatabase(); // 읽기 전용 DB select문
        } catch (SQLiteException e) {
            e.printStackTrace();
            Log.e(tag, "데이터베이스를 얻어올 수 없음");
//            finish(); // 액티비티 종료
        }

        String token = FirebaseInstanceId.getInstance().getToken();


        /////////////////////////////////////


    }
}
