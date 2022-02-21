package com.example.abubaker_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    MediaPlayer mediaPlayer1;
    int playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mediaPlayer1 = new MediaPlayer();
        mediaPlayer1 = MediaPlayer.create(this,R.raw.track1);
        playing=0;
        Button mbttn = (Button) findViewById(R.id.button);
        Button a3bttn = (Button) findViewById(R.id.button2);
        Button a4bttn = (Button) findViewById(R.id.button3);
        ImageView img1 = (ImageView) findViewById(R.id.imageView4);
        img1.setOnClickListener(img1L);
        mbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to go to the other activity
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
        a3bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to go to the other activity
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });
        a4bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to go to the other activity
                startActivity(new Intent(MainActivity2.this, MainActivity4.class));
            }
        });

    }
    View.OnClickListener img1L = new Button.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(playing) {
                case 0:
                    mediaPlayer1.start();
                    playing = 1;
                    break;
                case 1:
                    mediaPlayer1.pause();
                    playing = 0;
                    break;
            }
        }
    };
}