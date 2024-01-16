package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class AddNewProduct extends AppCompatActivity {

    private static final int REQUEST_PERMISSION = 2;
    private static final int REQUEST_IMAGE_SELECTION = 1;

    private Spinner spinner;
    private ImageView addImage, goToBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_product);


        goToBack = findViewById(R.id.gotoback);
        spinner = findViewById(R.id.spinner123);
        addImage = findViewById(R.id.propriceediimage);


        String[] items = {"All"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        goToBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToPickingActivity();
            }
        });

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddNewProduct.this, "Clicked", Toast.LENGTH_SHORT).show();
                requestStoragePermissionAndSelectImage();
            }
        });

    }


    private void navigateToPickingActivity() {
        Intent intent = new Intent(this, pickingActivity.class);
        startActivity(intent);
    }

    private void requestStoragePermissionAndSelectImage() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_PERMISSION);
        } else {
            openImageSelectionIntent();
        }
    }

    private void openImageSelectionIntent() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_IMAGE_SELECTION);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_IMAGE_SELECTION && resultCode == RESULT_OK && data != null) {
            Uri selectedImageUri = data.getData();

            if (selectedImageUri != null && isUriPermissionPersistent(selectedImageUri)) {

                addImage.setImageURI(selectedImageUri);
            } else {

            }
        }
    }


    private boolean isUriPermissionPersistent(Uri uri) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            final int flags = Intent.FLAG_GRANT_READ_URI_PERMISSION;
            try {
                getContentResolver().takePersistableUriPermission(uri, flags);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openImageSelectionIntent();
            } else {

            }
        }
    }

    public void toastmessage(View view) {
        Toast.makeText(AddNewProduct.this, "Submit", Toast.LENGTH_SHORT).show();
    }

    public void tost(View v){
        Toast.makeText(v.getContext(),"Submit",Toast.LENGTH_SHORT).show();
    }



}
