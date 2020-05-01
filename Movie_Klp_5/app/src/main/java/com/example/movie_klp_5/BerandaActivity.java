package com.example.movie_klp_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class BerandaActivity extends Activity {

    Button btnlogout;
    FirebaseAuth mFirebaseAuth;
    FlipperLayout flipperLayout;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    TextView rtx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        btnlogout = findViewById(R.id.btnlogout);
        flipperLayout = findViewById(R.id.flipper);
        rtx = (TextView) findViewById(R.id.rtx);
        rtx.setSelected(true);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myAlert = new AlertDialog.Builder(BerandaActivity.this);
                myAlert.setTitle("Exit");
                myAlert.setMessage("Are You Sure?");
                myAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        FirebaseAuth.getInstance().signOut();
                        Intent intoMain = new Intent(BerandaActivity.this, LoginActivity.class);
                        startActivity(intoMain);
                        finish();
                    }
                });
                myAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                myAlert.setCancelable(false);
                myAlert.show();
            }
        });
        int imagesDrawable[]={R.drawable.ipman,R.drawable.minions,R.drawable.everest,R.drawable.borat,R.drawable.loveintrouble,R.drawable.playing,R.drawable.insidious,R.drawable.zodiac,R.drawable.thefaultinourstars,R.drawable.joker};
        for (int i=0; i<imagesDrawable.length; i++){
            FlipperView flipperView = new FlipperView(getBaseContext());
            flipperView.setImageDrawable(imagesDrawable[i]);
            flipperLayout.addFlipperView(flipperView);
        }
    }

    public void ipman(View view) {
        Intent i = new Intent(BerandaActivity.this, IpmanActivity.class);
        startActivity(i);
    }

    public void minion(View view) {
        Intent i = new Intent(BerandaActivity.this, MinionsActivity.class);
        startActivity(i);
    }

    public void jumanji(View view) {
        Intent i = new Intent(BerandaActivity.this, JumanjiActivity.class);
        startActivity(i);
    }

    public void neighbors(View view) {
        Intent i = new Intent(BerandaActivity.this, NeighborsActivity.class);
        startActivity(i);
    }

    public void dr(View view) {
        Intent i = new Intent(BerandaActivity.this, DrActivity.class);
        startActivity(i);
    }

    public void playing(View view) {
        Intent i = new Intent(BerandaActivity.this, PlayingActivity.class);
        startActivity(i);
    }

    public void nun(View view) {
        Intent i = new Intent(BerandaActivity.this, NunActivity.class);
        startActivity(i);
    }

    public void zodiac(View view) {
        Intent i = new Intent(BerandaActivity.this, ZodiacActivity.class);
        startActivity(i);
    }

    public void london(View view) {
        Intent i = new Intent(BerandaActivity.this, LondonActivity.class);
        startActivity(i);
    }

    public void ready(View view) {
        Intent i = new Intent(BerandaActivity.this, ReadyActivity.class);
        startActivity(i);
    }
}
