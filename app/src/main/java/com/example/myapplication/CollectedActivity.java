package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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


        RecyclerView recyclerView
                = findViewById(R.id.recyclerView);


        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ItemClass> itemClasses = new ArrayList<>();


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

        recyclerView.setAdapter(adapter);
    }

    public void goback12(View view) {
        Intent intent=new Intent(view.getContext(),DeliverynotCheckActivity.class);
        startActivity(intent);
    }
}
