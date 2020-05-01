package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MysteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery);
    }
    public void category(View view) {
        Intent i = new Intent(MysteryActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void before(View view) {
        Intent i = new Intent(MysteryActivity.this, BeforeActivity.class);
        startActivity(i);
    }

    public void shutter(View view) {
        Intent i = new Intent(MysteryActivity.this, ShutterActivity.class);
        startActivity(i);
    }

    public void trance(View view) {
        Intent i = new Intent(MysteryActivity.this, TranceActivity.class);
        startActivity(i);
    }

    public void under(View view) {
        Intent i = new Intent(MysteryActivity.this, UnderActivity.class);
        startActivity(i);
    }

    public void zodiac(View view) {
        Intent i = new Intent(MysteryActivity.this, ZodiacActivity.class);
        startActivity(i);
    }
}
