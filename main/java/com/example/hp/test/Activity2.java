package com.example.hp.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by HP on 20-04-2018.
 */

public class Activity2 extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txt = (TextView)findViewById(R.id.txt);
        txt.setText("hello this is mine");

    }
}
