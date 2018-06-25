package com.example.a54717;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by 54717 on 2018/5/14.
 */

public class BookStack extends AppCompatActivity {
    private ImageButton[] ImageButtons=new ImageButton[3];
    private EditText bookname;
    private Button search;
    private Button upload;
    private MySqliteHelper helper;

    //Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookstack);

        ImageButtons[0] = (ImageButton) findViewById(R.id.imageButton19);
        ImageButtons[0].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a1 = new Intent(BookStack.this, BookInfo.class);

                startActivity(a1);
            }
        });
        search=(Button)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookname=(EditText)findViewById(R.id.editText);
                if(bookname.getText().toString().equals("php编程实战")) {
                    bookname.setText("");
                    Intent m = new Intent(BookStack.this, BookInfo.class);
                    startActivity(m);
                }
                else{
                    bookname.setText("");
                    Intent m = new Intent(BookStack.this, BookInfor.class);
                    startActivity(m);
                }
            }
        });
     ImageButtons[1] = (ImageButton) findViewById(R.id.imageButton);
        ImageButtons[1].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a2 = new Intent(BookStack.this, BookInfor.class);

                startActivity(a2);
            }
        });
   /*        ImageButtons[2] = (ImageButton) findViewById(R.id.imageButton19);
        ImageButtons[2].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a3 = new Intent(BookStack.this, BookInfo.class);

                startActivity(a3);
            }
        });
           ImageButtons[3] = (ImageButton) findViewById(R.id.imageButton17);
        ImageButtons[3].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a3 = new Intent(BookStack.this, BookInfo.class);

                startActivity(a3);
            }
        });
     upload=(Button)findViewById(R.id.uploadbooks);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BookStack.this,BookUp.class);
                startActivity(i);
            }
        });


                //database=new Database();
                //bookname=(EditText)findViewById(R.id.editText);
                /*helper = new MySqliteHelper(getApplicationContext());
                SQLiteDatabase db=helper.getReadableDatabase();
                //对数据库全面搜索
                Cursor cursor=db.query("bookdialog",null,null,null,null,null,null);
                if(cursor.moveToFirst()){
                    do{
                        //得到一组书籍信息
                        String name=cursor.getString(cursor.getColumnIndex("name"));
                        String degree=cursor.getString(cursor.getColumnIndex("degree"));
                        String owner=cursor.getString(cursor.getColumnIndex("owner"));
                        double price=cursor.getDouble(cursor.getColumnIndex("price"));
                        if(bookname.getText().toString().equals(name)){
                            //界面跳转

                            //传递信息
                            //BookInfo bookInfo=new BookInfo(name,degree,owner,price);
                            break;
                        }

                    }while(cursor.moveToNext());
                }
                //database.search(bookname.getText().toString());

        */


    }
}
