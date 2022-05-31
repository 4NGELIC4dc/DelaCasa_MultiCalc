package com.example.delacasa_turnbasedgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.start_sfx);

        button = (Button) findViewById(R.id.startBtn);
        button.setOnClickListener(view -> {
            openSecondPage();
            mediaPlayer.start();
        });
    }

    public void openSecondPage() {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }
}