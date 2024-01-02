package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Colllecteditem;
import com.example.myapplication.CustomDialogClass;
import com.example.myapplication.Model.Picking;
import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class PickingAdapter extends RecyclerView.Adapter<PickingAdapter.PickingViewHolder> {
    private Context context;
    private List<Picking> productList;
    private List<Picking> originalList;
    private EditText productSearchEditText;

    public PickingAdapter(Context context, List<Picking> productList, EditText productSearchEditText) {
        this.context = context;
        this.productList = productList;
        this.originalList = new ArrayList<>(productList);
        this.productSearchEditText = productSearchEditText;


    }


    @NonNull
    @Override
    public PickingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pickingiteam, parent, false);
        return new PickingViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull PickingViewHolder holder, int position) {
        Picking product = productList.get(position);

        holder.imageViewProduct.setImageResource(product.getImageResourceId());
        holder.textViewProductTitle.setText(product.getTitle());
        holder.textViewProductCountAndPrice.setText(product.getCountAndPrice());


        holder.inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }

                int currentCount = Integer.parseInt(holder.textViewCount.getEditableText().toString());
                currentCount++;


                Animation slideUp = AnimationUtils.loadAnimation(context, R.anim.slide_up);
                holder.textViewCount.startAnimation(slideUp);


                int finalCurrentCount = currentCount;
                slideUp.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        holder.textViewCount.setVisibility(View.INVISIBLE);


                        holder.textViewCount.setText(String.valueOf(finalCurrentCount));


                        Animation slideIn = AnimationUtils.loadAnimation(context, R.anim.slide_up);
                        holder.textViewCount.startAnimation(slideIn);


                        holder.textViewCount.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                if (productSearchEditText.isFocused()) {
                    productSearchEditText.clearFocus();
                    productSearchEditText.setHint("Product Search");
                }
            }
        });


        holder.imageViewRemoveProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }

                final int[] currentCount = {Integer.parseInt(holder.textViewCount.getEditableText().toString())};
                if (currentCount[0] > 0) {

                    Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);
                    holder.textViewCount.startAnimation(slideDown);


                    slideDown.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            holder.textViewCount.setVisibility(View.INVISIBLE);


                            currentCount[0]--;
                            holder.textViewCount.setText(String.valueOf(currentCount[0]));


                            Animation slideUp = AnimationUtils.loadAnimation(context, R.anim.slide_down);
                            holder.textViewCount.startAnimation(slideUp);

                            holder.textViewCount.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {
                        }
                    });
                }

                if (productSearchEditText.isFocused()) {
                    productSearchEditText.clearFocus();
                    productSearchEditText.setHint("Product Search");
                }
            }

        });


        holder.showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.showCustomDialog();
                if (productSearchEditText.isFocused()) {
                    productSearchEditText.clearFocus();
                    productSearchEditText.setHint("Product Search");
                }
            }
        });

        holder.collected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), Colllecteditem.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class PickingViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewProduct;
        TextView textViewProductTitle;
        TextView textViewProductCountAndPrice;


        FloatingActionButton imageViewRemoveProduct;
        EditText textViewCount;
        FloatingActionButton inc;


        Button showDialogButton,collected;

        EditText productsearch;



        public PickingViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewProduct = itemView.findViewById(R.id.imageViewProduct);
            textViewProductTitle = itemView.findViewById(R.id.textViewProductTitle);
            textViewProductCountAndPrice = itemView.findViewById(R.id.textViewProductCountAndPrice);
            imageViewRemoveProduct = itemView.findViewById(R.id.dec);
            inc = itemView.findViewById(R.id.inc);
            textViewCount = itemView.findViewById(R.id.txt);
            showDialogButton = itemView.findViewById(R.id.button3);
            productsearch = itemView.findViewById(R.id.productsearch);
            collected=itemView.findViewById(R.id.showDialogButton);

        }


        private void showCustomDialog() {
            CustomDialogClass cdd = new CustomDialogClass(inc.getContext());
            cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            cdd.show();
        }


    }

    public void filterByHint(String hint) {
        List<Picking> filteredList = new ArrayList<>();
        for (Picking item : originalList) {
            if (item.getTitle().toLowerCase().contains(hint.toLowerCase())) {
                filteredList.add(item);
            }
        }
        productList = filteredList;
        notifyDataSetChanged();
    }


    public void showAllItems() {
        productList = new ArrayList<>(originalList);
        notifyDataSetChanged();
    }


    public void filterList(List<Picking> filteredList) {
        productList = filteredList;
        notifyDataSetChanged();
    }


}






































































