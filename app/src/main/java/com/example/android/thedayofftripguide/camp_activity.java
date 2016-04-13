package com.example.android.thedayofftripguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class camp_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_activity);
    }

    /**
     * The method to see the directions on maps, when the button is clicked
     */
    public void location1map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/@50.7239542,30.3830228,211m/data=!3m1!1e3"));
        startActivity(intent);

    }

    public void location2map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/place/%D0%91%D0%B0%D0%BA%D0%BE%D1%82%D0%B0/@48.5859455,26.9932012,940m/data=!3m1!1e3!4m2!3m1!1s0x0000000000000000:0xfe11fe066e0f28a4"));
        startActivity(intent);

    }

    public void location3map(View view) {
        /**
         * This intent opens map.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ua/maps/place/50%C2%B018'53.9%22N+29%C2%B005'36.7%22E/@50.3149854,29.0913413,415m/data=!3m2!1e3!4b1!4m2!3m1!1s0x0:0x0"));
        startActivity(intent);

    }

    /**
     * The method to see the detail of the route, when the button is clicked
     */
    public void location1detail(View view) {
        /**
         * This intent opens article.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://general-kosmosa.livejournal.com/47095.html"));
        startActivity(intent);
    }

    public void location2detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://uk.wikipedia.org/wiki/%D0%91%D0%B0%D0%BA%D0%BE%D1%82%D0%B0"));
        startActivity(intent);
    }

    public void location3detail(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://travel-diary.com.ua/rubriki/interesnye-mesta/kuda-poehat-na-vyhodnye-korostysevskie-karery/"));
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
                Uri.parse("http://moveyourass.com.ua/top-10-maloizvestnih-mest-v-ykraine-kyda-stoit-poehat-otdohnyt"));
        startActivity(intent);
    }

    public void goLink2(View view) {
        /**
         * This intent opens website.
         */
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://general-kosmosa.livejournal.com/tag/%D1%82%D1%83%D1%80%20%D0%B2%D1%8B%D1%85%D0%BE%D0%B4%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B4%D0%BD%D1%8F"));
        startActivity(intent);
    }
}
