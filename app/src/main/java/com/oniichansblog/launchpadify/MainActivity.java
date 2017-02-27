package com.oniichansblog.launchpadify;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer clap1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clap1 = MediaPlayer.create(this, R.raw.clap1);
    }

    public void clap1(View v){
        clap1.start();
    }

}
