package com.example.vibhu.myfcmdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello world");

        /* I have to commit in branch directory*/
        System.out.println("Hello Branch");
    }
}
