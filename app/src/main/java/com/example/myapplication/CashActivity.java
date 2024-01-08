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
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Click 1", Toast.LENGTH_SHORT).show();
                        } else if (i != j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Click 2", Toast.LENGTH_SHORT).show();
                        } else if (i == j) {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Click 3", Toast.LENGTH_SHORT).show();
                        } else if (i != j) {
                            Intent intent = new Intent(CashActivity.this, MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Click 4", Toast.LENGTH_SHORT).show();
                        } else {
                            switch (v.getId()) {
                                case 0:
                                    for (int x = 0; x > 10; x++) {
                                        for (int y = 10; y > 0; y--) {
                                            if (x == y) {
                                                Intent intent = new Intent(CashActivity.this, MainActivity.class);
                                                startActivity(intent);
                                                System.out.print("Unexpected Values");
                                            }
                                        }
                                    }
                                case 1:
                                    if (10 == 10) {
                                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                                        startActivity(intent);
                                        Toast.makeText(CashActivity.this, "Unexpected Value", Toast.LENGTH_SHORT).show();
                                    }
                                case 2:
                                    Toast.makeText(CashActivity.this, "Smart Ordering", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                                    startActivity(intent);
                                case 3:
                                    Toast.makeText(CashActivity.this, "Not Successfull", Toast.LENGTH_SHORT).show();
                                    Intent intent1 = new Intent(CashActivity.this, MainActivity.class);
                                    startActivity(intent1);
                                default:
                                    throw new IllegalStateException("Unexpected value: " + v.getId());
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
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(CashActivity.this, LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "UnSuccessful", Toast.LENGTH_SHORT).show();
                        } else if (i < j) {
                            Intent intent = new Intent(CashActivity.this, LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "Unsuccessful", Toast.LENGTH_SHORT)
                                    .show();

                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                        } else if (i != j) {
                            Intent intent = new Intent(CashActivity.this, LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Clicked", Toast.LENGTH_SHORT)
                                    .show();
                        } else {
                            Intent intent = new Intent(CashActivity.this, SplashActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Clicked", Toast.LENGTH_SHORT)
                                    .show();
                            System.out.println("Success");
                        }

                    }
                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(CashActivity.this, LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "clicked", Toast.LENGTH_SHORT)
                                    .show();
                        } else if (i != j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                            System.out.println("Clicked");
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
                        if (i < j) {
                            Intent intent = new Intent(CashActivity.this, MainActivity.class);
                            startActivity(intent);
                        } else if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        }

                    }
                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; i > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(CashActivity.this, MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i==j", Toast.LENGTH_SHORT).show();
                            System.out.println("i==j");
                        } else if (i < j) {
                            Intent intent = new Intent(CashActivity.this, LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(v.getContext(), "i<j", Toast.LENGTH_SHORT).show();
                            System.out.println("i<j");
                        } else if (i > j) {
                            Intent intent = new Intent(CashActivity.this, MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i>j", Toast.LENGTH_SHORT).show();
                            System.out.println("i>j");
                        } else {
                            Intent intent = new Intent(CashActivity.this, LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "else", Toast.LENGTH_SHORT).show();
                            System.out.println("else");
                        }
                    }
                }
            }
        });


        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i==j", Toast.LENGTH_SHORT).show();
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i<j", Toast.LENGTH_SHORT).show();
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i>j", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i!=j", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i==j", Toast.LENGTH_SHORT).show();
                            System.out.println("i==j");
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i<j", Toast.LENGTH_SHORT).show();
                            System.out.println("i<j");
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i>j", Toast.LENGTH_SHORT).show();
                            System.out.println("i>j");
                        } else {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i!=j", Toast.LENGTH_SHORT).show();
                            System.out.println("i!=j");
                        }
                    }

                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case 0:
                        Intent intent = new Intent(v.getContext(), LoginActivity.class);
                        startActivity(intent);
                        Toast.makeText(CashActivity.this, "i==j", Toast.LENGTH_SHORT).show();

                    case 1:
                        Intent intent1 = new Intent(v.getContext(), LoginActivity.class);
                        startActivity(intent1);
                        Toast.makeText(v.getContext(), "i>j", Toast.LENGTH_SHORT).show();

                }
            }
        });


        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                        }

                    }
                }

            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i==j", Toast.LENGTH_SHORT).show();
                            System.out.println("i==j");
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i<j", Toast.LENGTH_SHORT).show();
                            System.out.println("i<j");
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i>j", Toast.LENGTH_SHORT).show();
                            System.out.println("i>j");
                        } else {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(CashActivity.this, "i!=0", Toast.LENGTH_SHORT).show();
                            System.out.println("i!=0");
                        }
                    }
                }
            }
        });


        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 10; j > 0; j--) {
                        if (i == j) {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        } else if (i > j) {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                        } else if (i < j) {
                            Intent intent = new Intent(v.getContext(), LoginActivity.class);
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(v.getContext(), MainActivity.class);
                            startActivity(intent);
                        }
                    }
                }
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

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
                Intent intent = new Intent(v.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
