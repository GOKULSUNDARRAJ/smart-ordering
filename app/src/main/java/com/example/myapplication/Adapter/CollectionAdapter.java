package com.example.myapplication.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Collection;
import com.example.myapplication.R;

import java.util.List;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.ViewHolder> {

    private List<Collection> collections;

    public CollectionAdapter(List<Collection> collections) {
        this.collections = collections;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);


        View itemView = inflater.inflate(R.layout.collectionitem, parent, false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Collection collection = collections.get(position);


        holder.dateTextView.setText(collection.getDate());
        holder.categoryTextView.setText(collection.getCategory());
        holder.nameTextView.setText(collection.getName());
        holder.priceTextView.setText(collection.getPrice());
        holder.quantityTextView.setText(collection.getQuantity());


    }

    @Override
    public int getItemCount() {
        return collections.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView dateTextView;
        TextView categoryTextView;
        TextView nameTextView;
        TextView priceTextView;
        TextView quantityTextView;


        public ViewHolder(View itemView) {
            super(itemView);


            dateTextView = itemView.findViewById(R.id.text);
            categoryTextView = itemView.findViewById(R.id.textj12);
            nameTextView = itemView.findViewById(R.id.tet);
            priceTextView = itemView.findViewById(R.id.textjhg);
            quantityTextView = itemView.findViewById(R.id.text134);

        }
    }
}
