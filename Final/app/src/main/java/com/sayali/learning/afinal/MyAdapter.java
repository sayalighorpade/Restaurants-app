package com.sayali.learning.afinal;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sayali.learning.afinal.Model.Category;

import java.util.ArrayList;

/**
 * Created by Learning on 15/12/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
        Context c;
        ArrayList<Category> categoryArrayList;
public MyAdapter(Context c,ArrayList<Category> categoryArrayList){
        this.c=c;
        this.categoryArrayList=categoryArrayList;
        }
@Override
public MyHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
        }



    @Override
public void onBindViewHolder(MyHolder holder,int position){
        holder.nameTxt.setText(categoryArrayList.get(position).getName());
        PicassoClient.downloadImage(c,categoryArrayList.get(position).getUrl(),holder.img);
        }
@Override
public int getItemCount(){
        return categoryArrayList.size();
        }
        }
