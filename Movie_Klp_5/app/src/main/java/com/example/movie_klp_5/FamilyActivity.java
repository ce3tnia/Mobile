package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }
    public void category(View view) {
        Intent i = new Intent(FamilyActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void in(View view) {
        Intent i = new Intent(FamilyActivity.this, InActivity.class);
        startActivity(i);
    }

    public void panda(View view) {
        Intent i = new Intent(FamilyActivity.this, PandaActivity.class);
        startActivity(i);
    }

    public void my(View view) {
        Intent i = new Intent(FamilyActivity.this, MyActivity.class);
        startActivity(i);
    }

    public void oz(View view) {
        Intent i = new Intent(FamilyActivity.this, OzActivity.class);
        startActivity(i);
    }

    public void playing(View view) {
        Intent i = new Intent(FamilyActivity.this, PlayingActivity.class);
        startActivity(i);
    }
}
