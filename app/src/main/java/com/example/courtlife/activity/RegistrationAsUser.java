package com.example.courtlife.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.courtlife.R;

public class RegistrationAsUser extends AppCompatActivity {

    Button butRegAsUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_as_user);

        butRegAsUser = findViewById(R.id.butRegAsUser);
        butRegAsUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrationAsUser.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }
}