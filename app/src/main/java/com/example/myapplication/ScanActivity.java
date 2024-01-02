package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Adapter.ScanAdapter;
import com.example.myapplication.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ScanActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ScanAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        recyclerView = findViewById(R.id.recyclerViewProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        productList.add(new Product(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        productList.add(new Product(R.drawable.img_3, "Product 2", "2 X £2.50"));
        productList.add(new Product(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        productList.add(new Product(R.drawable.img_3, "Product 2", "2 X £2.50"));
        productList.add(new Product(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        productList.add(new Product(R.drawable.img_3, "Product 2", "2 X £2.50"));
        productList.add(new Product(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        productList.add(new Product(R.drawable.img_3, "Product 2", "2 X £2.50"));
        productList.add(new Product(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        productList.add(new Product(R.drawable.img_3, "Product 2", "2 X £2.50"));
        productList.add(new Product(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        productList.add(new Product(R.drawable.image5,"Niru red rice","1 X £1.60"));


        productAdapter = new ScanAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);




    }

    public void gotoback(View view) {
        Intent intent=new Intent(ScanActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void gotoscan(View view) {
        Intent intent=new Intent(ScanActivity.this,ScanOrderActivity.class);
        startActivity(intent);
    }







}
