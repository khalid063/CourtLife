package com.example.courtlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationAsAdvocate extends AppCompatActivity {

    Button butRegAsAdvocate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_as_advocate);

        butRegAsAdvocate = findViewById(R.id.butRegAsAdvocate);
        butRegAsAdvocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrationAsAdvocate.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }
}