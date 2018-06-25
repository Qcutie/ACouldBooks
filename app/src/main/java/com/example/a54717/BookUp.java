package com.example.a54717;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.KeyEvent;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView.OnEditorActionListener;


public class BookUp extends AppCompatActivity{
    private EditText bookname;
    private EditText degree;
    private EditText price;
    private float price2;
    private Button upload;
    private MySqliteHelper helper;

    //Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookup);

        /*bookname=(EditText) findViewById(R.id.editText3);
        bookname.setText("战争与和平");
        degree=(EditText)findViewById(R.id.editText5);
        degree.setText("新书");
        price=(EditText)findViewById(R.id.editText7);
        price.setText("11.2");
        */
        upload=(Button)findViewById(R.id.button16);
        upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SQLiteDatabase db=helper.getWritableDatabase();
                ContentValues values=new ContentValues();

                //price2=Float.parseFloat(price.getText().toString());
                //用value接收数据过渡
                values.put("name","战争与和平");
                values.put("degree","新书");
                values.put("price",11.2);
                //上传数据库
                db.insert("bookdialog",null,values);
                Toast.makeText(BookUp.this, "上传成功", Toast.LENGTH_SHORT).show();
                db.close();
            }
        });
       /*
       //显示输入内容
       bookname.setOnEditorActionListener(new OnEditorActionListener() {
           @Override
           public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               //Toast.makeText(BookUp.this, String.valueOf(actionId), Toast.LENGTH_SHORT).show();
               return false;
           }
       });
       */
        /*degree=(EditText)findViewById(R.id.editText5);
       price=(EditText)findViewById(R.id.editText7);

       degree.setOnEditorActionListener(new OnEditorActionListener() {
           @Override
           public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               //Toast.makeText(BookUp.this, String.valueOf(actionId), Toast.LENGTH_SHORT).show();
               return false;
           }
       });


       price.setOnEditorActionListener(new OnEditorActionListener() {
           @Override
           public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               //Toast.makeText(BookUp.this, String.valueOf(actionId), Toast.LENGTH_SHORT).show();
               return false;
           }
       });
       */
       //uploading();
    }
    //上传书籍信息
    /*
    public void uploading(){
        helper=new MySqliteHelper(getApplicationContext());
        final double price2=Double.parseDouble(price.getText().toString());
        upload=(Button)findViewById(R.id.button16);
        upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SQLiteDatabase db=helper.getWritableDatabase();
                ContentValues values=new ContentValues();
                //用value接收数据过渡
                values.put("name",bookname.getText().toString());
                values.put("degree",degree.getText().toString());
                values.put("price",price2);
                //上传数据库
                db.insert("bookdialog",null,values);
                Toast.makeText(BookUp.this, "上传成功", Toast.LENGTH_SHORT).show();
                db.close();
            }
        });

    }
    */
}
