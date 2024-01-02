package com.example.myapplication;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.myapplication.R;

public class CustomDialogClass extends Dialog {

    private EditText editTextDialogInput;

    public CustomDialogClass(@NonNull Context context) {
        super(context);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);

        editTextDialogInput = findViewById(R.id.editTextDialogInput);
        Button updateButton = findViewById(R.id.updateButton);


        ImageView claer=findViewById(R.id.claer);
        claer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editTextDialogInput.getText().toString();

                dismiss();
            }
        });




    }
}
