package com.example.duanxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private MyopenHelper myOpenHelper;
    SQLiteDatabase sqLiteDatabase;
    Cursor cursor;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity3.this,MainActivity4.class);
                Bundle bundle=new Bundle();
                bundle.putString("name","zrs");
                intent1.putExtras(bundle);
                startActivityForResult(intent1,1);
            }
        });

    }
}

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);

//        myDao=new MyDao(this);
//        myDao.MyIdsert("zrs",41);
//        myDao.MyQuery();
//        myDao.Myupdate(45);
//
//
//

//        MyopenHelper myopenHelper=new MyopenHelper(this,"test.db",null,1);
//
//        SQLiteDatabase database=myopenHelper.getWritableDatabase();
//        database.execSQL("drop table if exists person");
//        database.execSQL("create table person (id integer primary key autoincrement,"+"name varchar,age integer) ");
//
//        ContentValues contentValues=new ContentValues();
//        contentValues.put("name","zrs");
//        contentValues.put("age","20");
//        database.insert("person",null,contentValues);
//
//        Cursor cursor=database.rawQuery("SELECT * FROM person where age >?",new String[]{"18"});
//        int get1=cursor.getColumnIndex("name");
//        while (cursor.moveToNext()){
//            if(get1>=0){
//                String res=cursor.getString(get1);
//                Log.d("sqlite",res);
//            }
//
//        }
//        cursor.close();
////
//   }
//}