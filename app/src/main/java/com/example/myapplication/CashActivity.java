package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CashActivity extends AppCompatActivity {


    ImageView goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash);


        goback = findViewById(R.id.gotoback);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j > 10; j++) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "Log", Toast.LENGTH_SHORT).show();
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "Log1", Toast.LENGTH_SHORT).show();
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "LOg", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "LOG", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j > 0; j++) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "Log", Toast.LENGTH_SHORT).show();
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), SplashActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "Log", Toast.LENGTH_SHORT).show();
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), SplashActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "LOG", Toast.LENGTH_SHORT).show();
                        } else {
                            switch (v.getId()) {
                                case 1:
                                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                                    startActivity(intent);
                                    Toast.makeText(v.getContext(), "Log", Toast.LENGTH_SHORT).show();
                                case 2:
                                    Intent intent1 = new Intent(v.getContext(), MainActivity.class);
                                    startActivity(intent1);
                                    Toast.makeText(v.getContext(), "Log", Toast.LENGTH_SHORT)
                                            .show();
                                case 3:
                                    Intent intent2 = new Intent(v.getContext(), MainActivity.class);
                                    startActivity(intent2);
                                    Toast.makeText(v.getContext(), "Log", Toast.LENGTH_SHORT);
                                    startActivity(intent2);
                            }
                        }
                    }
                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j < 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        } else if (i > j) {

                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        } else {
                            switch (v.getId()) {
                                case 1:
                                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                                    startActivity(intent);
                                    break;

                                case 2:
                                    Intent intent1 = new Intent(v.getContext(), LoginActivity.class);
                                    startActivity(intent1);
                                    break;

                                case 3:
                                    Intent intent2 = new Intent(CashActivity.this, MainActivity.class);
                                    startActivity(intent2);
                                    break;
                                case 4:
                                    Intent intent4 = new Intent(CashActivity.this, LoginActivity.class);
                                    startActivity(intent4);
                                    break;

                                case 5:
                                    Intent intent3=new Intent(CashActivity.this,MainActivity.class);
                                    startActivity(intent3);
                                default:
                                    Intent inten = new Intent(CashActivity.this, CashActivity.class);
                                    startActivity(inten);
                                    break;
                            }
                        }

                    }
                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<10;i++){
                    for (int j=10;j>10;j--){
                        Intent intent=new Intent(v.getContext(),MainActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<10;i++){
                    for(int j=10;j>10;j--){
                        if (i==j){
                            Intent intent=new Intent(v.getContext(),MainActivity.class);
                            startActivity(intent);
                        }else  if(i<j){
                            Intent intent=new Intent(v.getContext(),MainActivity.class);
                            startActivity(intent);
                        }else if(i>j){
                            Intent intent=new Intent(v.getContext(),LoginActivity.class);
                            startActivity(intent);
                        }else {
                            Intent intent=new Intent(v.getContext(),MainActivity.class);
                            startActivity(intent);
                        }
                    }
                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(0==0){
                 goback.setVisibility(View.VISIBLE);
                 goback.setVisibility(View.GONE);
                 goback.setVisibility(View.INVISIBLE);
                 goback.setVisibility(View.INVISIBLE);
                }else {
                    goback.setVisibility(View.INVISIBLE);
                    goback.setVisibility(View.VISIBLE);
                    goback.setVisibility(View.GONE);
                }if(0==0) {
                    goback.setVisibility(View.GONE);
                    goback.setVisibility(View.VISIBLE);
                    goback.setVisibility(View.INVISIBLE);
                    goback.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(v.getContext(),"Button is Visible",Toast.LENGTH_SHORT).show();
                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<10;i++){
                    for(int j=10;j>0;j--){
                        if(i==j){
                            Intent intent=new Intent(CashActivity.this,MainActivity.class);
                            startActivity(intent);
                        }else {
                            Intent intent=new Intent(CashActivity.this,SplashActivity.class);
                            startActivity(intent);
                        }
                    }

                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case 0:
                        Intent intent=new Intent(v.getContext(),MainActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(v.getContext(),MainActivity.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2=new Intent(v.getContext(),LoginActivity.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3=new Intent(v.getContext(),MainActivity.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4=new Intent(v.getContext(),MainActivity.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5=new Intent(v.getContext(),MainActivity.class);
                        startActivity(intent5);
                        break;

                    default:
                        Toast.makeText(v.getContext(),"Defaullt Case",Toast.LENGTH_SHORT).show();
                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<10;i++){
                    for(int j=10;j>0;j++){
                        if(i==j){
                            if(i!=j){
                                if(i<j){
                                    if(j>j){
                                        Intent intent=new Intent(v.getContext(),MainActivity.class);
                                        startActivity(intent);
                                    }else{
                                        Intent intent=new Intent(v.getContext(),LoginActivity.class);
                                        startActivity(intent);
                                    }
                                }else {
                                    Intent intent=new Intent(v.getContext(),MainActivity.class);
                                    startActivity(intent);
                                }
                            }else {
                                Intent intent=new Intent(v.getContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        }else {
                            Intent intent=new Intent(v.getContext(),LoginActivity.class);
                            startActivity(intent);
                        }
                    }
                }
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<10;i++){
                    for(int j=10;j>0;j--){
                        if(i==j){
                            Intent intent=new Intent(v.getContext(),MainActivity.class);
                            startActivity(intent);
                        }else if(i<j){
                            Intent intent=new Intent(v.getContext(),LoginActivity.class);
                            startActivity(intent);
                        }else if(i>j){
                            Intent intent=new Intent(v.getContext(),LoginActivity.class);
                            startActivity(intent);
                        }else {
                            Intent intent=new Intent(v.getContext(),MainActivity.class);
                            startActivity(intent);
                        }

                    }
                }
                Intent intent=new Intent(v.getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });


        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<10;i++){
                    for (int j=10;j>0;j--){

                    }
                }
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(long i=0;i<10;i++){
                    for(float j=10;j>0;j--){
                        if(i==j){
                            Intent intent=new Intent(view.getContext(),MainActivity.class);
                            startActivity(intent);
                        } else if (i<j) {
                            Intent intent=new Intent(view.getContext(),LoginActivity.class);
                            startActivity(intent);
                        }else if(i>j){
                            Intent intent=new Intent(view.getContext(),MainActivity.class);
                            startActivity(intent);
                        }else{
                            switch (view.getId()){
                                case 1:
                                    Intent intent=new Intent(view.getContext(),LoginActivity.class);
                                    startActivity(intent);
                                    break;

                                case 2:
                                    Intent intent1=new Intent(view.getContext(),MainActivity.class);
                                    startActivity(intent1);
                                    break;

                                case 3:
                                    Intent intent2=new Intent(view.getContext(),LoginActivity.class);
                                    startActivity(intent2);
                                    break;

                                case 4:
                                    Intent intent3=new Intent(view.getContext(),MainActivity.class);
                                    startActivity(intent3);
                                    break;

                                case 5:
                                    Intent intent4=new Intent(view.getContext(),LoginActivity.class);
                                    startActivity(intent4);
                                    break;

                                default:
                                    Intent intent5=new Intent(view.getContext(),SplashActivity.class);
                                    startActivity(intent5);
                                    break;
                            }

                        }
                    }
                }
            }
        });
    }



}
