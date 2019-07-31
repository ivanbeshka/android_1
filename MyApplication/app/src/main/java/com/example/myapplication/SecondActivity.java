package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;

    private String strKey = "str";
    private String intKey = "int";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.tv1);
        textView2 = findViewById(R.id.tv2);

        Bundle arguments = getIntent().getExtras();

        textView1.setText(arguments.get(strKey).toString());
        textView2.setText(arguments.get(intKey).toString());
    }
}
