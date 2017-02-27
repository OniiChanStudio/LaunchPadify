package com.oniichansblog.launchpadify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer clap1;
    private MediaPlayer clap2;
    private MediaPlayer clap3;
    private MediaPlayer clap4;
    private MediaPlayer clap5;
    private MediaPlayer clap6;
    private MediaPlayer clap7;
    private MediaPlayer clap8;
    private MediaPlayer clap9;
    private MediaPlayer clap10;
    private MediaPlayer clap11;
    private MediaPlayer clap12;
    private MediaPlayer clap13;
    private MediaPlayer clap14;
    private MediaPlayer clap15;
    private MediaPlayer clap16;
    private MediaPlayer clap17;
    private MediaPlayer clap18;
    private MediaPlayer clap19;
    private MediaPlayer clap20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clap1 = MediaPlayer.create(this, R.raw.clap1);
        clap2 = MediaPlayer.create(this, R.raw.clap2);
        clap3 = MediaPlayer.create(this, R.raw.clap1);
        clap4 = MediaPlayer.create(this, R.raw.clap1);
        clap5 = MediaPlayer.create(this, R.raw.clap1);
        clap6 = MediaPlayer.create(this, R.raw.clap1);
        clap7 = MediaPlayer.create(this, R.raw.clap1);
        clap8 = MediaPlayer.create(this, R.raw.clap1);
        clap9 = MediaPlayer.create(this, R.raw.clap1);
        clap10 = MediaPlayer.create(this, R.raw.clap1);
        clap11 = MediaPlayer.create(this, R.raw.clap1);
        clap12 = MediaPlayer.create(this, R.raw.clap1);
        clap13 = MediaPlayer.create(this, R.raw.clap1);
        clap14 = MediaPlayer.create(this, R.raw.clap1);
        clap15 = MediaPlayer.create(this, R.raw.clap1);
        clap16 = MediaPlayer.create(this, R.raw.clap1);
        clap17 = MediaPlayer.create(this, R.raw.clap1);
        clap18 = MediaPlayer.create(this, R.raw.clap1);
        clap19 = MediaPlayer.create(this, R.raw.clap1);
        clap20 = MediaPlayer.create(this, R.raw.clap1);
    }



    public void clap1(View v){
        clap1.start();
    }

    public void clap2(View v){
        clap2.start();
    }
}
