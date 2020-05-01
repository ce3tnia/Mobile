package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void action(View view) {
        Intent g = new Intent(CategoryActivity.this, ActionActivity.class);
        startActivity(g);
    }

    public void animation(View view) {
        Intent a = new Intent(CategoryActivity.this, AnimationActivity.class);
        startActivity(a);
    }

    public void drama(View view) {
        Intent s = new Intent(CategoryActivity.this, DramaActivity.class);
        startActivity(s);
    }

    public void adventure(View view) {
        Intent d = new Intent(CategoryActivity.this, AdventureActivity.class);
        startActivity(d);
    }

    public void comedy(View view) {
        Intent f = new Intent(CategoryActivity.this, ComedyActivity.class);
        startActivity(f);
    }

    public void romance(View view) {
        Intent h = new Intent(CategoryActivity.this, RomanceActivity.class);
        startActivity(h);
    }

    public void horror(View view) {
        Intent j = new Intent(CategoryActivity.this, HorrorActivity.class);
        startActivity(j);
    }

    public void thriller(View view) {
        Intent k = new Intent(CategoryActivity.this, ThrillerActivity.class);
        startActivity(k);
    }

    public void mystery(View view) {
        Intent l = new Intent(CategoryActivity.this, MysteryActivity.class);
        startActivity(l);
    }

    public void family(View view) {
        Intent q = new Intent(CategoryActivity.this, FamilyActivity.class);
        startActivity(q);
    }
}
