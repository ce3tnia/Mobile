package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class RomanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);
    }
    public void category(View view) {
        Intent i = new Intent(RomanceActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void five(View view) {
        Intent i = new Intent(RomanceActivity.this, FiveActivity.class);
        startActivity(i);
    }

    public void london(View view) {
        Intent i = new Intent(RomanceActivity.this, LondonActivity.class);
        startActivity(i);
    }

    public void me(View view) {
        Intent i = new Intent(RomanceActivity.this, MeActivity.class);
        startActivity(i);
    }

    public void fault(View view) {
        Intent i = new Intent(RomanceActivity.this, FaultActivity.class);
        startActivity(i);
    }

    public void titanic(View view) {
        Intent i = new Intent(RomanceActivity.this, TitanicActivity.class);
        startActivity(i);
    }
}
