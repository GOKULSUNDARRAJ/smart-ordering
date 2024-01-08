package com.example.myapplication.Adapter;

import static com.example.myapplication.Model.ItemClass.LayoutOne;
import static com.example.myapplication.Model.ItemClass.LayoutTwo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.ItemClass;
import com.example.myapplication.R;

import java.util.List;


public class AdapterClass extends RecyclerView.Adapter {

    private List<ItemClass> itemClassList;


    public AdapterClass(List<ItemClass> itemClassList) {
        this.itemClassList = itemClassList;
    }


    @Override
    public int getItemViewType(int position) {
        switch (itemClassList.get(position).getViewType()) {
            case 0:
                return LayoutOne;
            case 1:
                return LayoutTwo;
            default:
                return -1;
        }
    }



    class LayoutOneViewHolder
            extends RecyclerView.ViewHolder {

        private TextView textview;
        private LinearLayout linearLayout;

        public LayoutOneViewHolder(@NonNull View itemView) {
            super(itemView);


            textview = itemView.findViewById(R.id.text);
            linearLayout = itemView.findViewById(R.id.linearlayout);
        }


        private void setView(String text) {

            textview.setText(text);
        }
    }


    class LayoutTwoViewHolder
            extends RecyclerView.ViewHolder {

        private ImageView icon;
        private TextView text_one, text_two;
        private LinearLayout linearLayout;

        public LayoutTwoViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.image);
            text_one = itemView.findViewById(R.id.text_one);
            text_two = itemView.findViewById(R.id.text_two);
            linearLayout
                    = itemView.findViewById(R.id.linearlayout);
        }

        private void setViews(int image, String textOne,
                              String textTwo) {
            icon.setImageResource(image);
            text_one.setText(textOne);
            text_two.setText(textTwo);
        }
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType) {
        switch (viewType) {
            case LayoutOne:
                View layoutOne
                        = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_one, parent,
                                false);
                return new LayoutOneViewHolder(layoutOne);
            case LayoutTwo:
                View layoutTwo
                        = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_two, parent,
                                false);
                return new LayoutTwoViewHolder(layoutTwo);
            default:
                return null;
        }
    }



    @Override
    public void onBindViewHolder(
            @NonNull RecyclerView.ViewHolder holder,
            int position) {

        switch (itemClassList.get(position).getViewType()) {
            case LayoutOne:

                String text
                        = itemClassList.get(position).getText();
                ((LayoutOneViewHolder) holder).setView(text);


                ((LayoutOneViewHolder) holder)
                        .linearLayout.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        Toast
                                                .makeText(
                                                        view.getContext(),
                                                        "Hello from Layout One!",
                                                        Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                });

                break;

            case LayoutTwo:
                int image
                        = itemClassList.get(position).geticon();
                String text_one
                        = itemClassList.get(position).getText_one();
                String text_two
                        = itemClassList.get(position).getText_two();
                ((LayoutTwoViewHolder) holder)
                        .setViews(image, text_one, text_two);
                ((LayoutTwoViewHolder) holder)
                        .linearLayout.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        Toast
                                                .makeText(
                                                        view.getContext(),
                                                        "Hello from Layout Two!",
                                                        Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                });
                break;
            default:

                return;
        }
    }



    @Override
    public int getItemCount() {
        return itemClassList.size();
    }
}
