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

public class UserCenter extends AppCompatActivity {
    private Button Compile;
    private ImageButton Return;
    private Button InfoButton;
    private EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usercenter);

        name=(EditText)findViewById(R.id.editText2);

        Compile = ( Button ) findViewById(R.id.button3);
        Compile.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


               name.setText(name.getText().toString());

            }
        });
        Return=(ImageButton) findViewById(R.id.imageButton5);
        Return.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent j = new Intent(UserCenter.this, HostPage.class);

                startActivity(j);

            }
        });



    }
}