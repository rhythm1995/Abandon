package com.csu.telecom;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class SettingsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //   ( (TextView)findViewById(R.id.text)).setText(savedInstanceState.getString("json"));
        init();
    }

    private void init() {


    }
}
