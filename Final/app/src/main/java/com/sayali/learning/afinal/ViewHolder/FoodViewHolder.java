package com.sayali.learning.afinal.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sayali.learning.afinal.Database.Database;
import com.sayali.learning.afinal.Interface.OnItemClickListener;
import com.sayali.learning.afinal.R;

import info.hoang8f.widget.FButton;

/**
 * Created by Learning on 16/12/2017.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView foodname;
    public OnItemClickListener itemClickListener;
    public ImageView foodimage;
    public FButton deleteorder;
    public FoodViewHolder(final View itemView) {
        super(itemView);
        foodname= itemView.findViewById(R.id.food_name);
        foodimage= itemView.findViewById(R.id.food_image);
      //  deleteorder=itemView.findViewById(R.id.deleteorder);
        itemView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
itemClickListener.onClick(v,getAdapterPosition(),false);
    }

    public void setItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

}
