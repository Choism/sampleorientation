package com.example.tacademy.sampleorientation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String message = getIntent().getStringExtra("message");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, MessageFragment.newInstance(message))
                    .commit();
        }
    }
}
