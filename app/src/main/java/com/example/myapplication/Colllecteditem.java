package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.CollectionAdapter;
import com.example.myapplication.Model.Collection;

import java.util.ArrayList;
import java.util.List;

public class Colllecteditem extends AppCompatActivity {

    ImageView gotoback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colllecteditem);

        gotoback=findViewById(R.id.gotoback);
        gotoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),pickingActivity.class);
                startActivity(intent);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recyclerViewProducts);
        List<Collection> collections = new ArrayList<>();
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "Household", "MONEY ENDANGERED 145mm X 110mm", "£10.44", "Qty:1"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm X 110mm", "£10.44", "Qty:4"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "Household", "MONEY TIN ENDANGERED SPECIES 145mm X 110mm", "£10.44", "Qty:6"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm", "£50.44", "Qty:1"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "Household", "MONEY TIN ENDANGERE SPECIES 145mm", "£17.44", "Qty:4"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm", "£40.44", "Qty:6"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm", "£20.44", "Qty:12"));
        collections.add(new Collection("MONEY TIN ENDANGERE SPECIES 145mm", "Household", "MONEY TIN ENDANGERE SPECIES 145mm", "£13.44", "Qty:7"));
        CollectionAdapter adapter = new CollectionAdapter(collections);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
