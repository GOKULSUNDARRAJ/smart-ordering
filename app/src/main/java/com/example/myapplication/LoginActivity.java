package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





    }

    public void goToMainActvity(View view) {

        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);

    }

    public void gotoforgot(View view) {
        Intent intent=new Intent(LoginActivity.this,ForgotPassword.class);
        startActivity(intent);
    }
}