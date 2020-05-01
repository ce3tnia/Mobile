package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama);
    }
    public void category(View view) {
        Intent i = new Intent(DramaActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void doc(View view) {
        Intent i = new Intent(DramaActivity.this, DocActivity.class);
        startActivity(i);
    }

    public void dr(View view) {
        Intent i = new Intent(DramaActivity.this, DrActivity.class);
        startActivity(i);
    }

    public void hotel(View view) {
        Intent i = new Intent(DramaActivity.this, HotelActivity.class);
        startActivity(i);
    }

    public void love(View view) {
        Intent i = new Intent(DramaActivity.this, LoveActivity.class);
        startActivity(i);
    }

    public void lovew(View view) {
        Intent i = new Intent(DramaActivity.this, LovewActivity.class);
        startActivity(i);
    }
}
