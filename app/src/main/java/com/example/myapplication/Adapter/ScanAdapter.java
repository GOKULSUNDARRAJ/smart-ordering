package com.example.myapplication.Adapter;

import android.content.Context;
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

import com.example.myapplication.Model.Product;
import com.example.myapplication.R;

import java.util.List;

public class ScanAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int VIEW_TYPE_PRODUCT = 0;
    private static final int VIEW_TYPE_BUTTON = 1;

    private Context context;
    private List<Product> productList;

    public ScanAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_BUTTON) {
            View buttonView = LayoutInflater.from(context).inflate(R.layout.button_layout, parent, false);
            return new ButtonViewHolder(buttonView);
        } else {
            View productView = LayoutInflater.from(context).inflate(R.layout.scanorderlayout, parent, false);
            return new ProductViewHolder(productView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == VIEW_TYPE_PRODUCT) {
            ProductViewHolder productViewHolder = (ProductViewHolder) holder;
            Product product = productList.get(position);
            productViewHolder.imageViewProduct.setImageResource(product.getImageResourceId());
            productViewHolder.textViewProductTitle.setText(product.getTitle());
            productViewHolder.textViewProductCountAndPrice.setText(product.getCountAndPrice());



            productViewHolder.dec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    InputMethodManager inputMethodManager = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    }

                    final int[] currentCount = {Integer.parseInt(productViewHolder.textViewCount.getEditableText().toString())};
                    if (currentCount[0] > 0) {

                        Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);
                        productViewHolder.textViewCount.startAnimation(slideDown);


                        slideDown.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {}

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                productViewHolder.textViewCount.setVisibility(View.INVISIBLE);


                                currentCount[0]--;
                                productViewHolder.textViewCount.setText(String.valueOf(currentCount[0]));


                                Animation slideUp = AnimationUtils.loadAnimation(context, R.anim.slide_down);
                                productViewHolder.textViewCount.startAnimation(slideUp);

                                productViewHolder.textViewCount.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                    }


                }
            });





            productViewHolder.inc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    InputMethodManager inputMethodManager = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    }

                    int currentCount = Integer.parseInt(productViewHolder.textViewCount.getEditableText().toString());
                    currentCount++;


                    Animation slideUp = AnimationUtils.loadAnimation(context, R.anim.slide_up);
                    productViewHolder.textViewCount.startAnimation(slideUp);


                    int finalCurrentCount = currentCount;
                    slideUp.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {}

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            productViewHolder.textViewCount.setVisibility(View.INVISIBLE);


                            productViewHolder.textViewCount.setText(String.valueOf(finalCurrentCount));


                            Animation slideIn = AnimationUtils.loadAnimation(context, R.anim.slide_up);
                            productViewHolder.textViewCount.startAnimation(slideIn);


                            productViewHolder.textViewCount.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {}
                    });


                }
            });







        } else {


        }



    }

    @Override
    public int getItemCount() {
        return productList.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        return (position == productList.size()) ? VIEW_TYPE_BUTTON : VIEW_TYPE_PRODUCT;
    }







    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewProduct;
        TextView textViewProductTitle;
        TextView textViewProductCountAndPrice;
        EditText textViewCount;
        ImageView dec,inc;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewProduct = itemView.findViewById(R.id.imageViewProduct);
            textViewProductTitle = itemView.findViewById(R.id.textViewProductTitle);
            textViewProductCountAndPrice = itemView.findViewById(R.id.textViewProductCountAndPrice);
            dec=itemView.findViewById(R.id.dec);
            inc=itemView.findViewById(R.id.inc);
            textViewCount=itemView.findViewById(R.id.txt);
        }
    }













    public static class ButtonViewHolder extends RecyclerView.ViewHolder {

        Button button;
        ImageView dec,inc;

        public ButtonViewHolder(@NonNull View itemView) {
            super(itemView);

            button = itemView.findViewById(R.id.button);



        }
    }
}
