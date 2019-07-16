package com.lebelleami.alc4challengeone;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /* Main activity buttons.*/
    Button about, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Main activity toolbar*/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ALC 4 PHASE 1");


        /* Main activity buttons view ids.*/
        about = findViewById(R.id.about_button);
        profile = findViewById(R.id.profile_button);


        /* Main activity about button intent listener.*/
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutAlcActivity.class);
                startActivity(aboutIntent);
            }
        });


        /* Main activity profile button intent listener.*/
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(aboutIntent);
            }
        });
    }
}
