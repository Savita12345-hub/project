package com.example.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText from;
    EditText to;
    EditText heading;
    EditText msg;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView GretingView = (TextView)findViewById(R.id.textView4);
        TextView FromView = (TextView)findViewById(R.id.textView5);
        TextView ToView = (TextView)findViewById(R.id.textView6);
        TextView HeadingView = (TextView)findViewById(R.id.textView7);
        TextView MessageView = (TextView)findViewById(R.id.textView8);
        from = (EditText) findViewById(R.id.editTextTextPersonName);
        to = (EditText) findViewById(R.id.editTextTextPersonName2);
        heading = (EditText) findViewById(R.id.editTextTextPersonName3);
        msg=(EditText) findViewById(R.id.editTextTextPersonName4);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f=from.getText().toString();
                String t=to.getText().toString();
                String h=heading.getText().toString();
                String m = msg.getText().toString();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("f",f);
                intent.putExtra("t",t);
                intent.putExtra("h",h);
                intent.putExtra("m",m);
                startActivity(intent);
            }
        });
    }
}