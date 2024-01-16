package com.example.myapplication.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Collection;
import com.example.myapplication.R;

import java.util.List;

public class DeliveryChechAdapter extends RecyclerView.Adapter<DeliveryChechAdapter.ViewHolder> {

    private List<Collection> collections;

    public DeliveryChechAdapter(List<Collection> collections) {
        this.collections = collections;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);


        View itemView = inflater.inflate(R.layout.deliveryitem, parent, false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Collection collection = collections.get(position);





    }

    @Override
    public int getItemCount() {
        return collections.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {




        public ViewHolder(View itemView) {
            super(itemView);




        }
    }
}

