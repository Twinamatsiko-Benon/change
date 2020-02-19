package com.example.travels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity1 extends AppCompatActivity {
    MediaPlayer mplayer;

    Button buttonplay;
    Button buttonstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
       buttonplay=(Button) findViewById(R.id.button1);
       buttonplay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mplayer=MediaPlayer.create(getApplicationContext(),R.raw.akameeme);
               mplayer.start();

           }
       });
       buttonstop=(Button) findViewById(R.id.button2);
       buttonstop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(mplayer!=null && mplayer.isPlaying()){

                   mplayer.stop();//stop the song from playing
               }
           }
       });
    }

}
