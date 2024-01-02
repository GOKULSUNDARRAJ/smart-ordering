package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.PickingAdapter;
import com.example.myapplication.Model.Picking;

import java.util.ArrayList;
import java.util.List;

public class pickingActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PickingAdapter pickingAdapter;
    private List<Picking> pickingItemList;

    private EditText productsearch;
    private DrawerLayout drawerLayout;
    private ImageView menuImage;
    private TextWatcher productSearchTextWatcher;


    private Button addproduct;
    private Button collect;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);


        collect = findViewById(R.id.collect);
        collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Scanbarcode.class);
                startActivity(intent);
            }
        });

        productsearch = findViewById(R.id.productsearch);
        addproduct = findViewById(R.id.button3);

        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showCustomDialog();

            }
        });

        productSearchTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                filterRecyclerView(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        };

        productsearch.addTextChangedListener(productSearchTextWatcher);


        drawerLayout = findViewById(R.id.drawable);
        menuImage = findViewById(R.id.menuimage);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        menuImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputMethodManager inputMethodManager = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        String[] items = {"All", "Niru", "Nanthan", "Yaal"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = (String) parentView.getItemAtPosition(position);
                if (selectedItem.equals("All")) {
                    pickingAdapter.showAllItems();
                } else {
                    pickingAdapter.filterByHint(selectedItem);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });

        productsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productsearch.setText("");
            }
        });

        recyclerView = findViewById(R.id.recyclerViewProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pickingItemList = new ArrayList<>();
        pickingItemList.add(new Picking(R.drawable.image1, "URID FLOUR (ROASTED)", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image2, "Niru raw white rice flour (canada)", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image3, "Niru Desiccated Coconut, 500g", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image4, "Nanthan Coconut Desiccated Medium 400 g", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image5, "Hides Fine Foods Desiccated ", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image2, "Naturally Grown Desiccated Coconut 250g", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image3, "Niru Desiccated Coconut, 500g", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image1, "NanthanRainbow Organic Desiccated Coconut 250g", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image2, "Niru Yaal spec/offer puttu flour", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image3, "Yaal Coconut Desiccated Medium 400 g", "1 X £1.90"));
        pickingItemList.add(new Picking(R.drawable.image4, "Pelex Kids 3D band Nanthan Watch PLX-046", "1 X £1.90"));

        pickingAdapter = new PickingAdapter(this, pickingItemList, productsearch);
        recyclerView.setAdapter(pickingAdapter);
    }

    public void gotoback(View view) {
        Intent intent = new Intent(pickingActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private void filterRecyclerView(String searchText) {
        List<Picking> filteredList = new ArrayList<>();

        for (Picking item : pickingItemList) {
            if (item.getTitle().toLowerCase().contains(searchText.toLowerCase())) {
                filteredList.add(item);
            }
        }


        pickingAdapter.filterList(filteredList);
    }

    private void removeProductSearchTextWatcher() {
        if (productsearch != null && productSearchTextWatcher != null) {
            productsearch.removeTextChangedListener(productSearchTextWatcher);
        }
    }

    private void stopTextWatcher() {
        removeProductSearchTextWatcher();
    }


    private void showCustomDialog() {
        CustomDialogClassnew cdd = new CustomDialogClassnew(this);
        cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd.show();
    }


}
