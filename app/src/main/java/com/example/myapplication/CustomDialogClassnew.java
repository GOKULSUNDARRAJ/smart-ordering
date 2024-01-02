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

public class CustomDialogClassnew extends Dialog {


    androidx.cardview.widget.CardView scanorder,newproduct;

    public CustomDialogClassnew(@NonNull Context context) {
        super(context);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout_new);



        ImageView claer=findViewById(R.id.claer);
        claer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        scanorder=findViewById(R.id.scanorder);
        newproduct=findViewById(R.id.addnewproduct);

        newproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),AddNewProduct.class);
                v.getContext().startActivity(intent);
                dismiss();
            }
        });

        scanorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CamerascanActivity.class);
                v.getContext().startActivity(intent);
                dismiss();
            }
        });
    }
}
