package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;
    int tt = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = new Timer();
        ImageView imageView =  findViewById(R.id.LoGo);
        imageView.setImageResource(R.drawable.logo);
        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tt--;
                        if(tt == 0){
                            Intent intent = new Intent(MainActivity.this, loginpage.class);
                            startActivity(intent);
                        }
                    }
                });
            }
        };
        timer.schedule(task,1000,1000);
    }
}