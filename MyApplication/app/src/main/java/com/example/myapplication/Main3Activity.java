package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class Main3Activity extends AppCompatActivity {

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        frameLayout = findViewById(R.id.fl_WOW);
    }

    public void onClickButton(View view) {
        Fragment fragmentWOW = new Fragment3();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_WOW,fragmentWOW).commit();
    }
}
