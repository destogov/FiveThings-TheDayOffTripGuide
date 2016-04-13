package com.example.android.thedayofftripguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.thedayofftripguide.R;

public class snb_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snb_activity);
    }

    /**
     * The method to see the directions on maps, when the button is clicked
     */
    public void location1map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/place/%D0%94%D1%80%D0%B0%D0%B3%D0%BE%D0%B1%D1%80%D0%B0%D1%82/@48.2234012,24.0831575,21985m/data=!3m1!1e3!4m2!3m1!1s0x473710108d87b75f:0x3063801f47f942cc?hl=uk"));
        startActivity(intent);

    }

    public void location2map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/place/%D0%93%D0%B5%D0%BC%D0%B1%D0%B0/@48.6312221,23.2409963,9117m/data=!3m1!1e3!4m2!3m1!1s0x4739954eb3081ca1:0x3053bf2d01eed502?hl=uk"));
        startActivity(intent);

    }

    public void location3map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/place/%D0%B3%D0%BE%D1%80%D0%B0+%D0%94%D0%BE%D0%B2%D0%B3%D0%B0/@48.3680233,24.3505739,3456m/data=!3m2!1e3!4b1!4m2!3m1!1s0x473717f87d0fbe59:0x7242143e196c0ef6?hl=uk"));
        startActivity(intent);

    }

    /**
     * The method to see the detail of the route, when the button is clicked
     */
    public void location1detail(View view) {
        /**
         * This intent opens website .
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://dragobrat.tv/uk/"));
        startActivity(intent);
    }

    public void location2detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://www.pylypets.com.ua/"));
        startActivity(intent);
    }

    public void location3detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://bukovel.com/"));
        startActivity(intent);
    }


    /**
     * The method to the linked website, when the button is clicked
     */
    public void goLink1(View view) {
        /**
         * This intent opens website.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://snig.info/uk/"));
        startActivity(intent);
    }

    public void goLink2(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://snowboarding.com.ua/forum/"));
        startActivity(intent);
    }
}
