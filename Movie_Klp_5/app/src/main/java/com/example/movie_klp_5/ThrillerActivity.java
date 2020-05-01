package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThrillerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thriller);
    }
    public void category(View view) {
        Intent i = new Intent(ThrillerActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void aquite(View view) {
        Intent i = new Intent(ThrillerActivity.this, AquiteActivity.class);
        startActivity(i);
    }

    public void halloween(View view) {
        Intent i = new Intent(ThrillerActivity.this, HalloweenActivity.class);
        startActivity(i);
    }

    public void joker(View view) {
        Intent i = new Intent(ThrillerActivity.this, JokerActivity.class);
        startActivity(i);
    }

    public void parasite(View view) {
        Intent i = new Intent(ThrillerActivity.this, ParasiteActivity.class);
        startActivity(i);
    }

    public void ready(View view) {
        Intent i = new Intent(ThrillerActivity.this, ReadyActivity.class);
        startActivity(i);
    }
}
