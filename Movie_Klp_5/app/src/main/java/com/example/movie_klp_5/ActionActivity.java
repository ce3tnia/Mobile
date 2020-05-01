package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
    }

    public void category(View view) {
        Intent i = new Intent(ActionActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void ipman(View view) {
        Intent i = new Intent(ActionActivity.this, IpmanActivity.class);
        startActivity(i);
    }

    public void dunkirk(View view) {
        Intent i = new Intent(ActionActivity.this, DunkirkActivity.class);
        startActivity(i);
    }

    public void fastfurious(View view) {
        Intent i = new Intent(ActionActivity.this, FastFuriousActivity.class);
        startActivity(i);
    }

    public void jhonwick3(View view) {
        Intent i = new Intent(ActionActivity.this, JhonWick3Activity.class);
        startActivity(i);
    }

    public void missionimpossible(View view) {
        Intent i = new Intent(ActionActivity.this, MissionImpossibleActivity.class);
        startActivity(i);
    }
}
