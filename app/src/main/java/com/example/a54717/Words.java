/*
 * Copyright (c) 2018.
 * 此项目用于期末作业
 *   版权归吴、晏、荆所有
 */

package com.example.a54717;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Words extends AppCompatActivity {

    private ImageButton e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);

     e=(ImageButton)findViewById(R.id.imageButton7);
    }
}
