package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.CollectionAdapter;
import com.example.myapplication.Model.Collection;

import java.util.ArrayList;
import java.util.List;

public class Colllecteditem extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colllecteditem);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewProducts);
        List<Collection> collections = new ArrayList<>();
        collections.add(new Collection("2023-12-15", "Household", "MONEY ENDANGERED 145mm X 110mm", "£10.44", "Qty:1"));
        collections.add(new Collection("2023-12-16", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm X 110mm", "£10.44", "Qty:4"));
        collections.add(new Collection("2023-12-17", "Household", "MONEY TIN ENDANGERED SPECIES 145mm X 110mm", "£10.44", "Qty:6"));
        collections.add(new Collection("2023-12-18", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm", "£50.44", "Qty:1"));
        collections.add(new Collection("2023-12-19", "Household", "MONEY TIN ENDANGERE SPECIES 145mm", "£17.44", "Qty:4"));
        collections.add(new Collection("2023-12-20", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm", "£40.44", "Qty:6"));
        collections.add(new Collection("2023-12-21", "BITS BOBS", "MONEY TIN ENDANGERE SPECIES 145mm", "£20.44", "Qty:12"));
        collections.add(new Collection("2023-12-22", "Household", "MONEY TIN ENDANGERE SPECIES 145mm", "£13.44", "Qty:7"));
        CollectionAdapter adapter = new CollectionAdapter(collections);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
