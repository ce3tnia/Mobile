package com.example.movie_klp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class HomeActivity extends TabActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, BerandaActivity.class);
        spec = tabHost.newTabSpec("beranda").setIndicator(null, getResources().getDrawable(R.drawable.ic_home_black_24dp)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, CategoryActivity.class);
        spec = tabHost.newTabSpec("kategori").setIndicator(null, getResources().getDrawable(R.drawable.ic_list_black_24dp)).setContent(intent);
        tabHost.addTab(spec);
    }
}
