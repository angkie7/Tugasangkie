package com.example.tugasangkie;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tugasangkie extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugasangkie_activity);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("test");
    }
}
