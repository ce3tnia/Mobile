package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
    }

    public void category(View view) {
        Intent i = new Intent(AdventureActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void alita(View view) {
        Intent i = new Intent(AdventureActivity.this, AlitaActivity.class);
        startActivity(i);
    }

    public void everest(View view) {
        Intent i = new Intent(AdventureActivity.this, EverestActivity.class);
        startActivity(i);
    }

    public void jumanji(View view) {
        Intent i = new Intent(AdventureActivity.this, JumanjiActivity.class);
        startActivity(i);
    }

    public void skywalker(View view) {
        Intent i = new Intent(AdventureActivity.this, SkywalkerActivity.class);
        startActivity(i);
    }

    public void lion(View view) {
        Intent i = new Intent(AdventureActivity.this, LionActivity.class);
        startActivity(i);
    }
}
