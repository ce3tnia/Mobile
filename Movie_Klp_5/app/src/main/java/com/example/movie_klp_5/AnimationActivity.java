package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }
    public void category(View view) {
        Intent i = new Intent(AnimationActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void minion(View view) {
        Intent i = new Intent(AnimationActivity.this, MinionsActivity.class);
        startActivity(i);
    }

    public void naruto(View view) {
        Intent i = new Intent(AnimationActivity.this, NarutoActivity.class);
        startActivity(i);
    }

    public void shaun(View view) {
        Intent i = new Intent(AnimationActivity.this, ShaunActivity.class);
        startActivity(i);
    }

    public void spongebob(View view) {
        Intent i = new Intent(AnimationActivity.this, SpongebobActivity.class);
        startActivity(i);
    }

    public void tomnjerry(View view) {
        Intent i = new Intent(AnimationActivity.this, TomnjerryActivity.class);
        startActivity(i);
    }
}
