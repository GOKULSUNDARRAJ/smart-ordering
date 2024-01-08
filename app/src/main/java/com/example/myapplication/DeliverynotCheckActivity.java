package com.example.myapplication;

import static com.example.myapplication.R.id.deliverycheckbtn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Adapter.AdapterClassDelivery;
import com.example.myapplication.Model.ItemClassDelivery;

import java.util.ArrayList;
import java.util.List;

public class DeliverynotCheckActivity extends AppCompatActivity {

    Button deliverycheckbtn123;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliverynot_check);

        deliverycheckbtn123 = findViewById(deliverycheckbtn);

        deliverycheckbtn123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CollectedActivity.class);
                startActivity(intent);
            }
        });



        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ItemClassDelivery> itemClasses = new ArrayList<>();


        itemClasses.add(new ItemClassDelivery(ItemClassDelivery.LayoutOneDelivery, "Rice,Flour"));

        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(ItemClassDelivery.LayoutOneDelivery, "Curry Powder"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(ItemClassDelivery.LayoutOneDelivery, "Rice,Flour"));

        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));
        itemClasses.add(new ItemClassDelivery(
                ItemClassDelivery.LayoutTwoDelivery, R.color.white,
                "Niru millet (Kurankkan) flour", "Niru,Jay Brand"));


        AdapterClassDelivery adapterClassDelivery = new AdapterClassDelivery(itemClasses);


        recyclerView.setAdapter(adapterClassDelivery);

    }
}


