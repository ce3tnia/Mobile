package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HorrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);
    }
    public void category(View view) {
        Intent i = new Intent(HorrorActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void annabelle(View view) {
        Intent i = new Intent(HorrorActivity.this, AnnabelleActivity.class);
        startActivity(i);
    }

    public void insidious(View view) {
        Intent i = new Intent(HorrorActivity.this, InsidiousActivity.class);
        startActivity(i);
    }

    public void it(View view) {
        Intent i = new Intent(HorrorActivity.this, ItActivity.class);
        startActivity(i);
    }

    public void conjuring(View view) {
        Intent i = new Intent(HorrorActivity.this, ConjuringActivity.class);
        startActivity(i);
    }

    public void nun(View view) {
        Intent i = new Intent(HorrorActivity.this, NunActivity.class);
        startActivity(i);
    }
}
