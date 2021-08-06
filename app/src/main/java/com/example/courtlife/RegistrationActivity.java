package com.example.courtlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    Button butRegAsAdvocate, butRegAsUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        //------------------------------------ Find view by id --------------------------------//
        butRegAsAdvocate = findViewById(R.id.butRegAsAdvocate);
        butRegAsUser = findViewById(R.id.butRegAsUser);



        //------------------------------------- Set on click listener -------------------------//
        butRegAsAdvocate.setOnClickListener(this);
        butRegAsUser.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int a = v.getId();

        switch (a){
            case R.id.butRegAsAdvocate :
                Intent iadvocate = new Intent(RegistrationActivity.this, RegistrationAsAdvocate.class);
                startActivity(iadvocate);
                break;
            case R.id.butRegAsUser :
                Intent iuser = new Intent(RegistrationActivity.this, RegistrationAsUser.class);
                startActivity(iuser);
                break;

        }

    }
}