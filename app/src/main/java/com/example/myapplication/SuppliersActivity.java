package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuppliersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);
    }

    public void gotoback(View view) {
        Intent intent=new Intent(SuppliersActivity.this,MainActivity.class);
        startActivity(intent);
    }
}