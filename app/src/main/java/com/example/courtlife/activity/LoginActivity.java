package com.example.courtlife.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.courtlife.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button butLoginAsAdvocate, butLoginAsUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //------------------------------------ find view by id ----------------------------------//
        butLoginAsAdvocate = findViewById(R.id.butLoginAsAdvocate);
        butLoginAsUser = findViewById(R.id.butLoginAsUser);


        //------------------------------------ set OnClick Listener -----------------------------//
        butLoginAsAdvocate.setOnClickListener(this);
        butLoginAsUser.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int x = v.getId();
        switch (x) {
            case R.id.butLoginAsAdvocate:
                Intent i = new Intent(LoginActivity.this, LoginAsAdvocate.class);
                startActivity(i);
                break;
            case R.id.butLoginAsUser:
                Intent iregistarion = new Intent(LoginActivity.this, LoginAsUser.class);
                startActivity(iregistarion);
                break;
        }
    }
}