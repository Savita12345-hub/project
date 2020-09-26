package com.example.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView head;
    TextView to;
    TextView mesa;
    TextView from;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        head=(TextView) findViewById(R.id.textView2);
        to = (TextView) findViewById(R.id.textView3);
        mesa = (TextView) findViewById(R.id.textView9);
        from=(TextView) findViewById(R.id.textView10);
        head.setText(getIntent().getStringExtra("h"));
        to.setText("To "+getIntent().getStringExtra("t"));
        mesa.setText(getIntent().getStringExtra("m"));
        from.setText("From "+getIntent().getStringExtra("f"));
    }
}