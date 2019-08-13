package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private EditText editText;
    private TextView textView;
    private RadioButton radioButton_zima;
    private RadioButton radioButton_leto;
    private ProgressBar progressBar_zima_leto;
    private SeekBar seekBar;
    private ProgressBar progressBarWithSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        radioButton_zima = findViewById(R.id.rb_zima);
        radioButton_leto = findViewById(R.id.rb_leto);
        progressBar_zima_leto = findViewById(R.id.pb_zima_leto);
        progressBarWithSeekBar = findViewById(R.id.progressBarWithSeekBar);

        final SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
    }


    public void onClickET(View view) {
        textView.setText(editText.getText().toString());
    }

    public void onClickRBLeto(View view) {

        progressBar_zima_leto.setVisibility(View.INVISIBLE);
    }

    public void onClickRBZima(View view) {
        progressBar_zima_leto.setVisibility(View.VISIBLE);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        progressBarWithSeekBar.setProgress(seekBar.getProgress());
    }
}
