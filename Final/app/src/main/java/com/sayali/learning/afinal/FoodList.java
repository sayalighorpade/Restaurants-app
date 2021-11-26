package com.sayali.learning.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sayali.learning.afinal.Interface.OnItemClickListener;
import com.sayali.learning.afinal.Model.Food;
import com.sayali.learning.afinal.ViewHolder.FoodViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodList extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference food;
    RecyclerView recyclerView;
    String categoryId="";
    //final static String DB_URL="https://console.firebase.google.com/project/final-91214/database/final-91214";
    //FireBaseClient fireBaseClient;
    FirebaseRecyclerAdapter<Food,FoodViewHolder> adapter;
    private List<Food> foodList;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        database=FirebaseDatabase.getInstance();
        food=database.getReference("Foods");
        recyclerView=(RecyclerView)findViewById(R.id.recycle_food);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        if (getIntent()!=null){
            categoryId=getIntent().getStringExtra("CategoryId");
        }
        if(!categoryId.isEmpty()&& categoryId!=null){
            loadListFood(categoryId);
        }
    }

    private void loadListFood(String categoryId) {
adapter=new FirebaseRecyclerAdapter<Food, FoodViewHolder>(Food.class,R.layout.food_item,FoodViewHolder.class,
        food.orderByChild("MenuId").equalTo(categoryId))
{
    @Override
    protected void populateViewHolder(FoodViewHolder viewHolder, Food model, int position) {
viewHolder.foodname.setText(model.getName());
        Picasso.with(getBaseContext()).load(model.getImage()).into(viewHolder.foodimage);
        final Food local=model;
        viewHolder.setItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent foodDetails=new Intent(FoodList.this,FoodDetail.class);
                foodDetails.putExtra("FoodId",adapter.getRef(position).getKey());
                startActivity(foodDetails);
            }
        });
    }
};
        Log.d("TAG",""+adapter.getItemCount());

recyclerView.setAdapter(adapter);
    }
}
