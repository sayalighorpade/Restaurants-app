package com.sayali.learning.afinal.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sayali.learning.afinal.Interface.OnItemClickListener;
import com.sayali.learning.afinal.R;

/**
 * Created by Learning on 16/12/2017.
 */

public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txt_cart_name, txt_price;
    public ImageView img_cart_count;

    private OnItemClickListener itemClickListener;

    public void setTxt_cart_name(TextView txt_cart_name) {
        this.txt_cart_name = txt_cart_name;
    }

    public CardViewHolder(View itemView) {
        super(itemView);

        txt_cart_name = itemView.findViewById(R.id.cart_item_name);
        txt_price = itemView.findViewById(R.id.cart_item_price);
        img_cart_count = itemView.findViewById(R.id.cart_item_count);

    }

    @Override
    public void onClick(View view) {

    }
}
