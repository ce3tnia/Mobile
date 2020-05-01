package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComedyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy);
    }
    public void category(View view) {
        Intent i = new Intent(ComedyActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void anchorman(View view) {
        Intent i = new Intent(ComedyActivity.this, AnchormanActivity.class);
        startActivity(i);
    }

    public void borat(View view) {
        Intent i = new Intent(ComedyActivity.this, BoratActivity.class);
        startActivity(i);
    }

    public void neighbors(View view) {
        Intent i = new Intent(ComedyActivity.this, NeighborsActivity.class);
        startActivity(i);
    }

    public void shaunof(View view) {
        Intent i = new Intent(ComedyActivity.this, ShaunofActivity.class);
        startActivity(i);
    }

    public void superbad(View view) {
        Intent i = new Intent(ComedyActivity.this, SuperbadActivity.class);
        startActivity(i);
    }
}
