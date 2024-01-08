package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.myapplication.Adapter.AdapterClass;
import com.example.myapplication.Model.ItemClass;

import java.util.ArrayList;
import java.util.List;

public class CollectedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collected);

        // From the MainActivity, find the RecyclerView.
        RecyclerView recyclerView
                = findViewById(R.id.recyclerView);

        // Create and set the layout manager
        // For the RecyclerView.
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ItemClass> itemClasses = new ArrayList<>();

        // pass the arguments
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Rice,Flour"));

        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));

        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Curry Powder"));

        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));

        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Rice,Flour"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));

        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Curry Powder"));

        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.icon,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));





        AdapterClass adapterClass
                = new AdapterClass(itemClasses);

        AdapterClass adapter
                = new AdapterClass(itemClasses);

        // set the adapter
        recyclerView.setAdapter(adapter);
    }
}
