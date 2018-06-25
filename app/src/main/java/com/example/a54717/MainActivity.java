package com.example.a54717;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    private Button login;
 /*   private Button search;
    private ImageButton BookStackButton;
    private ImageButton MaterialButton;
    private ImageButton UserCenterButton;
    private ImageButton[] ImageButtons = new ImageButton[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hostpage);

        BookStackButton = (ImageButton) findViewById(R.id.bookstack1);
        BookStackButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this, BookStack.class);


                startActivity(i);


            }
        });
        MaterialButton = (ImageButton) findViewById(R.id.materialstack1);
        MaterialButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent j = new Intent(MainActivity.this, MaterialStack.class);


                startActivity(j);


            }

        });
        UserCenterButton = (ImageButton) findViewById(R.id.usercenter1);
        UserCenterButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent k = new Intent(MainActivity.this, UserCenter.class);

                startActivity(k);
            }
        });

        ImageButtons[0] = (ImageButton) findViewById(R.id.php);
        ImageButtons[0].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a1 = new Intent(MainActivity.this, BookInfo.class);

                startActivity(a1);
            }
        });
        ImageButtons[1] = (ImageButton) findViewById(R.id.imageButton2);
        ImageButtons[1].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a2 = new Intent(MainActivity.this, BookInfo.class);

                startActivity(a2);
            }
        });
        ImageButtons[2] = (ImageButton) findViewById(R.id.imageButton3);
        ImageButtons[2].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a3 = new Intent(MainActivity.this, BookInfo.class);

                startActivity(a3);
            }
        });
        ImageButtons[3] = (ImageButton) findViewById(R.id.imageButton4);
        ImageButtons[3].setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent a3 = new Intent(MainActivity.this, BookInfo.class);

                startActivity(a3);
            }
        });

        search=(Button)findViewById(R.id.searchhostpage);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent m=new Intent(MainActivity.this,BookInfo.class);
                startActivity(m);
            }
        });

    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,HostPage.class);
                startActivity(i);
            }
        });

    }
}



