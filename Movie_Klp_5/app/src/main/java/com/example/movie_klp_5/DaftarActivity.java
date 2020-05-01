package com.example.movie_klp_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class DaftarActivity extends AppCompatActivity {

    EditText emailid,pass;
    Button daftar;
    TextView masuk;
    private CheckBox show;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailid = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        daftar = findViewById(R.id.button);
        masuk = findViewById(R.id.login);
        show = findViewById(R.id.showPassword);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show.isChecked()){
                    pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailid.getText().toString();
                String pwd = pass.getText().toString();
                if(email.isEmpty()){
                    emailid.setText("Please Enter the Email");
                    emailid.requestFocus();
                }
                else if(pwd.isEmpty()){
                    pass.setText("Please Enter the Password");
                    pass.requestFocus();
                }
                else if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(DaftarActivity.this, "Fill In The Blank", Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(DaftarActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(DaftarActivity.this, "Registration is Failed, Try Again..", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(DaftarActivity.this,HomeActivity.class));
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(DaftarActivity.this, "Something Error", Toast.LENGTH_SHORT).show();

                }
            }
        });
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DaftarActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
