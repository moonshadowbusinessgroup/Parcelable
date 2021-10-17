package com.hadimusthafa.parcelable;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Test test = getIntent().getParcelableExtra("test");

        Snackbar.make(getWindow().getDecorView().getRootView(), test.name, Snackbar.LENGTH_SHORT).show();
    }
}