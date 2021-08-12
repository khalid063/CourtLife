package com.example.courtlife.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.courtlife.R;

public class LoginAsAdvocate extends AppCompatActivity {

    private Button butLoginAsAdvocate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as_advocate);

        butLoginAsAdvocate = findViewById(R.id.butLoginAsAdvocate);

        butLoginAsAdvocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginAsAdvocate.this, "Login as Advocate but is clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(LoginAsAdvocate.this, HomeActivity.class);
                startActivity(i);
            }
        });


    }
}