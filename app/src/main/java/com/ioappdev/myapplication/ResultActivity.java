package com.ioappdev.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mPhoneNum");
        TextView textView = (TextView) findViewById(R.id.txtMPhoneNum);
        textView.setText(message);
        Toast.makeText(this, "Name : " + message, Toast.LENGTH_SHORT).show();

    }
}
