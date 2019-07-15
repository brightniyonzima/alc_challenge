package com.example.lenovo.brightandelaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutAlc, myPofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutAlc = findViewById(R.id.aboutAlc);
        aboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutAndelaActivity.class);
                startActivity(intent);
            }
        });

        myPofile = findViewById(R.id.myProfile);
        myPofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOpenMyProfile = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intentOpenMyProfile);
            }
        });
    }
}
