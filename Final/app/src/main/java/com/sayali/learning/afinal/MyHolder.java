package com.sayali.learning.afinal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sayali.learning.afinal.Interface.OnItemClickListener;

/**
 * Created by Learning on 15/12/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
    public TextView nameTxt;
    public OnItemClickListener itemClickListener;
    public ImageView img;
    public MyHolder(View itemView) {
        super(itemView);
        nameTxt= itemView.findViewById(R.id.menu_name);
        img= itemView.findViewById(R.id.imageView);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }
}