package com.example.jokesshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView textViewJok = (TextView) findViewById(R.id.joke);
        String joke = getIntent().getStringExtra("JOKE");
        if(joke !=null) {
            textViewJok.setText(joke);
        }else {
          textViewJok.setText("404: joke not found");
        }
    }
}
