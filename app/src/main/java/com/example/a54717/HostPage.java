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

public class HostPage extends AppCompatActivity {
    private EditText bookname;
    private Button search;
    private MySqliteHelper helper;
    private ImageButton BookStackButton;
    private ImageButton MaterialButton;
    private ImageButton UserCenterButton;
    private ImageButton[] ImageButtons=new ImageButton[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hostpage);

        BookStackButton = ( ImageButton )findViewById(R.id.bookstack1);
        BookStackButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent i = new Intent(HostPage.this, BookStack.class);


                startActivity(i);




            }
        });
        MaterialButton = (ImageButton) findViewById(R.id.materialstack1);
        MaterialButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent j = new Intent(HostPage.this, MaterialStack.class);


                startActivity(j);


            }

        });
        UserCenterButton = (ImageButton) findViewById(R.id.usercenter1);
        UserCenterButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v){

                Intent k=new Intent(HostPage.this, UserCenter.class);

                startActivity(k);
            }
        });

        ImageButtons[0] = (ImageButton) findViewById(R.id.php);
        ImageButtons[0].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v){

                Intent a1=new Intent(HostPage.this, BookInfo.class);

                startActivity(a1);
            }
        });
        ImageButtons[1] = (ImageButton) findViewById(R.id.imageButton3);
        ImageButtons[1].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v){

                Intent a2=new Intent(HostPage.this, BookInfor.class);

                startActivity(a2);
            }
        });
        search=(Button)findViewById(R.id.searchhostpage);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookname=(EditText)findViewById(R.id.editText);
                if(bookname.getText().toString().equals("php编程实战")) {
                    bookname.setText("");
                    Intent m = new Intent(HostPage.this, BookInfo.class);
                    startActivity(m);
                }
                else{
                    bookname.setText("");
                    Intent m = new Intent(HostPage.this, BookInfor.class);
                    startActivity(m);
                }
            }
        });
   /*     ImageButtons[2] = (ImageButton) findViewById(R.id.imageButton2);
        ImageButtons[2].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v){

                Intent a3=new Intent(HostPage.this, BookInfo.class);

                startActivity(a3);
            }
        });
        ImageButtons[3] = (ImageButton) findViewById(R.id.imageButton4);
        ImageButtons[3].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v){

                Intent a3=new Intent(HostPage.this, BookInfo.class);

                startActivity(a3);
            }
        });

*/
    }
}
/* helper = new MySqliteHelper(getApplicationContext());
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
                }*/
