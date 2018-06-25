package com.example.a54717;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BookInfor extends AppCompatActivity {
    private ImageButton bookstack;
    private ImageButton materialstack;
    private ImageButton usercenter;
    private TextView owner;
    private TextView bookname;
    private TextView noDegree;
    private TextView price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookinfor);

        bookstack= ( ImageButton )findViewById(R.id.imageButton6);
        bookstack.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i1 = new Intent(BookInfor.this, BookStack.class);

                startActivity(i1);

            }
        });
        materialstack= ( ImageButton )findViewById(R.id.material);
        materialstack.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i2 = new Intent(BookInfor.this, MaterialStack.class);

                startActivity(i2);

            }
        });
        usercenter = ( ImageButton )findViewById(R.id.imageButton8);
        usercenter.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i3 = new Intent(BookInfor.this, UserCenter.class);

                startActivity(i3);

            }
        });

    }
    /*
    public BookInfo(String inName,String inDegree,String inOwner,Double inPrice){
        //显示书籍信息
        owner=(TextView)findViewById(R.id.textView10);
        owner.setText("用户名："+inOwner);
        bookname=(TextView)findViewById(R.id.textView9);
        bookname.setText("书名："+inName);
        noDegree=(TextView)findViewById(R.id.textView12);
        noDegree.setText("新旧程度："+inDegree);
        price=(TextView)findViewById(R.id.textView11);
        price.setText("价格："+inPrice);
    }
    */
}
