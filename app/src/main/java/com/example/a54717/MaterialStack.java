package com.example.a54717;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by 54717 on 2018/5/14.
 */

public class MaterialStack extends AppCompatActivity {
    private Button b;
    private Button shou;
    private Button uploading;
    //private MySqliteHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meterialstack);

        b=(Button)findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MaterialStack.this,Words.class);
                startActivity(i);
            }
        });
/*
        shou=(Button)findViewById(R.id.button12);
        shou.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v){

                Intent a3=new Intent(MaterialStack.this, InfoPage.class);

                startActivity(a3);
            }
        });*//*
        b[0]=(Button)findViewById(R.id.button4);

        b[2]=(Button)findViewById(R.id.button6);
        b[3]=(Button)findViewById(R.id.button7);
        b[4]=(Button)findViewById(R.id.button8);
        b[5]=(Button)findViewById(R.id.button9);

        helper = new MySqliteHelper(getApplicationContext());
        SQLiteDatabase db=helper.getReadableDatabase();
        uploading=(Button)findViewById(R.id.button11);
        uploading.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SQLiteDatabase db=helper.getWritableDatabase();
                ContentValues values=new ContentValues();
                //用value接收数据过渡
                for(int i=0;i<6;i++)
                values.put("name",b[i].getText().toString());

                //上传数据库
                db.insert("bookdialog",null,values);
            }
        });
*/
    }

}
