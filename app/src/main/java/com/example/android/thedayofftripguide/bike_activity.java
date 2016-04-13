package com.example.android.thedayofftripguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bike_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_activity);
    }

    /**
     * The method to see the directions on maps, when the button is clicked
     */
    public void location1map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/d/viewer?mid=zBJlBzuMiPtk.kYNZEQD_9kHQ&hl=ru"));
        startActivity(intent);

    }

    public void location2map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/d/viewer?mid=zBJlBzuMiPtk.kIYUny29Vvos&hl=ru"));
        startActivity(intent);

    }

    public void location3map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/d/viewer?mid=zBJlBzuMiPtk.kXTnEX6d_VnE&hl=ru"));
        startActivity(intent);

    }

    /**
     * The method to see the detail of the route, when the button is clicked
     */
    public void location1detail(View view) {
        /**
         * This intent opens "veloroute" website article.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://velorout.com.ua/article/294-velomarshruty-veloroute-fastov-teterev-hudozhestvennaya-chast-chast.html"));
        startActivity(intent);
    }

    public void location2detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://velorout.com.ua/article/582-velomarshruty-velorout-kievschina-mironovka-medvin-totoha-buki-opisanie-marshruta.html"));
        startActivity(intent);
    }

    public void location3detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://velorout.com.ua/article/329-velomarshruty-veloroute-chernigovschina-sokirinc-trostyanec-kachanovka.html"));
        startActivity(intent);
    }


    /**
     * The method to the linked website, when the button is clicked
     */
    public void goLink1(View view) {
        /**
         * This intent opens "veloroute" website.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://velorout.com.ua/o-sayte.html"));
        startActivity(intent);
    }

    public void goLink2(View view) {
        /**
         * This intent opens "veloroute" website.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://velokyiv.com/"));
        startActivity(intent);
    }

}





