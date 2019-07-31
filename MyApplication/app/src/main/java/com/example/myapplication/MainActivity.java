package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button btnTo2nd;

    private String strKey = "str";
    private String intKey = "int";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_top);
        editText2 = findViewById(R.id.et_bottom);
        btnTo2nd = findViewById(R.id.btn_to_second_activity);

        final Intent intent = new Intent(this, SecondActivity.class);

        btnTo2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = String.valueOf(editText1.getText());
                Integer int2 = Integer.valueOf(String.valueOf(editText2.getText()));
                intent.putExtra(strKey,text1);
                intent.putExtra(intKey,int2);

                startActivity(intent);
            }
        });
    }
}
