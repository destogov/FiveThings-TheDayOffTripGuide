package com.example.android.thedayofftripguide;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    private static Button goHike;
    private static Button goBicycle;
    private static Button goCamp;
    private static Button goSnb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener() {
        goSnb = (Button) findViewById(R.id.snbButton);
        goSnb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, snb_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );

        goHike = (Button) findViewById(R.id.hikeButton);
        goHike.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, hike_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );

        goBicycle = (Button) findViewById(R.id.bikeButton);
        goBicycle.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, bike_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );

        goCamp = (Button) findViewById(R.id.campButton);
        goCamp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentSnbActivity = new Intent(MainActivity.this, camp_activity.class);
                        startActivity(intentSnbActivity);
                    }
                }
        );



    }
}
