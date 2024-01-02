package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private Spinner mySpinner;

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = findViewById(R.id.spinner);



        sharedPreferences = getPreferences(MODE_PRIVATE);

        List<String> itemList = Arrays.asList("", "All", "Costcutter London", "Costcutter Birmingham", "Costcutter Manchester", "Costcutter Bristol", "Costcutter Wolverhampton", "Costcutter Coventry", "Costcutter Glasgow", "Costcutter Edinburgh","");

        CustomAdapter adapter = new CustomAdapter(this, R.layout.spinner_item_layout, itemList,sharedPreferences, mySpinner);




        mySpinner.setAdapter(adapter);


        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }

    public void goback(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    
    public void gotoscan(View view) {
        Intent intent=new Intent(MainActivity.this, ScanActivity.class);
        startActivity(intent);
    }

    public void gotoInventory(View view) {
        Intent intent=new Intent(MainActivity.this,InventoryActivity.class);
        startActivity(intent);
    }

    public void gotoSuppliers(View view) {
        Intent intent=new Intent(MainActivity.this,SuppliersActivity.class);
        startActivity(intent);
    }

    public void gotowallet(View view) {
        Intent intent=new Intent(MainActivity.this,walletActivity.class);
        startActivity(intent);
    }

    public void gotoCash(View view) {
        Intent intent=new Intent(MainActivity.this,CashActivity.class);
        startActivity(intent);
    }

    public void gotopicking(View view) {
        Intent intent=new Intent(MainActivity.this, pickingActivity.class);
        startActivity(intent);
        Log.d(TAG, "This is a debug message");

    }
}
