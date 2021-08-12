   package com.example.courtlife.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.courtlife.R;

   public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button butLogin, butReg, butCauseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------------------------------- Find view by id -----------------------------//
        butLogin = findViewById(R.id.butLogin);
        butReg = findViewById(R.id.butRegistration);
        butCauseList = findViewById(R.id.butCauseList);

        //----------------------------------- Set OnClick Listener -----------------------//


        butLogin.setOnClickListener(this);
        butReg.setOnClickListener(this);
        butCauseList.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int x = v.getId();
        switch (x){
            case R.id.butLogin:
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                break;
            case R.id.butRegistration:
                Intent iregistarion = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(iregistarion);
                break;
            case R.id.butCauseList:
                Intent icauseList = new Intent(MainActivity.this, CauseListActivity.class);
                startActivity(icauseList);
                break;
        }
    }
}