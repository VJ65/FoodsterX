package com.example.foodsterx;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sign_in_btn, sign_up_btn;
    TextView title_text, slogan_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_in_btn = (Button) findViewById(R.id.sign_in_btn);
        sign_up_btn = (Button) findViewById(R.id.sign_up_btn);

        title_text = (TextView) findViewById(R.id.title_text);
        //Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Handycheera.otf");
        //title_text.setTypeface(face);

        slogan_text = (TextView) findViewById(R.id.slogan_text);

        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sign_up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
