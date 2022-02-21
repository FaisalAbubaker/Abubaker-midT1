package com.example.abubaker_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button mbttn2 = (Button) findViewById(R.id.button4);
        Button a2bttn = (Button) findViewById(R.id.button5);
        Button a4bttn2 = (Button) findViewById(R.id.button6);
        mbttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to go to the other activity
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            }
        });
        a2bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to go to the other activity
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        });
        a4bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to go to the other activity
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));
            }
        });
    }
}