package com.example.android.thedayofftripguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hike_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hike_activity);
    }

    /**
     * The method to see the directions on maps, when the button is clicked
     */
    public void location1map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/@48.046944,24.627222,15z"));
        startActivity(intent);

    }

    public void location2map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/preview/@48.6196335,23.93071169999996,15z"));
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
         * This intent opens website article.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://guide.karpaty.ua/uk/places/pip-ivan-dzembronia"));
        startActivity(intent);
    }

    public void location2detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://guide.karpaty.ua/uk/places/grofa-marshrut"));
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
         * This intent opens  website.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://guide.karpaty.ua/uk"));
        startActivity(intent);
    }

    public void goLink2(View view) {
        /**
         * This intent opens website.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://beskid.com.ua/content/remont-i-poshiv"));
        startActivity(intent);
    }
}
