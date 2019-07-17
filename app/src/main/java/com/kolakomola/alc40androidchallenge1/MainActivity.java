package com.kolakomola.alc40androidchallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutUS();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyprofile();
            }
        });
    }

    public void openAboutUS() {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void openMyprofile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}