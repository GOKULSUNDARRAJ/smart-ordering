package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Adapter.ScanAdapter2;
import com.example.myapplication.Model.Scanorder;

import java.util.ArrayList;
import java.util.List;

public class ScanOrderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ScanAdapter2 scanorderAdapter;
    private List<Scanorder> scanorderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_order);

        recyclerView = findViewById(R.id.recyclerViewScanOrders);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        scanorderList = new ArrayList<>();
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));
        scanorderList.add(new Scanorder(R.drawable.img_3, "Pelex Kids 3D band Watch PLX-046", "1 X £1.90"));


        scanorderAdapter = new ScanAdapter2(this, scanorderList);
        recyclerView.setAdapter(scanorderAdapter);
    }

    public void gotoback(View view) {
        Intent intent = new Intent(ScanOrderActivity.this, MainActivity.class);
        startActivity(intent);
    }






    public void gotocamerascan(View view) {

        Intent intent = new Intent(ScanOrderActivity.this, CamerascanActivity.class);
        startActivity(intent);
    }

}
