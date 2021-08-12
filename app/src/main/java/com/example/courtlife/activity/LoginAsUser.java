package com.example.courtlife.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.courtlife.R;

public class LoginAsUser extends AppCompatActivity {

    Button butLoginAsUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as_user);

        butLoginAsUser = findViewById(R.id.butLoginAsUser);
        butLoginAsUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginAsUser.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }
}