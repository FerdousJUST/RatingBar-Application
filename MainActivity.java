package com.example.skferdousrahman.ratingbarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar bar;
    private TextView view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar=(RatingBar)findViewById(R.id.ratingbar);
        view1=(TextView)findViewById(R.id.view);
        view1.setText("value is: "+bar.getProgress());

        bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar bar, float v, boolean b) {

                view1.setText("Value is: "+ v );
            }
        });





    }
}
