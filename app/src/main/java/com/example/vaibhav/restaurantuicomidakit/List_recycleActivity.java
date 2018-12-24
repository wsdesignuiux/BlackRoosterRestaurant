package com.example.vaibhav.restaurantuicomidakit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Dashboard5_adapter;
import adapter.Item_recycle_adapter;
import model.Dashboard5_model;
import model.Item_recycle_model;

public class List_recycleActivity extends AppCompatActivity {

    String textrecycle[] = {"1.Sign in","2.Sign up 1",
            "3.Sign up 2","4.Sign up 3","5.Sign up 4",
            "6.Forget password 1","7.Forget password 2",
            "8.Dashboard 1","9.Dashboard 2","10.Dashboard 3","11.Dashboard 4","12.Dashboard 5",
            "13.payment1","14.payment2","15.payment3",
            "16.Profile","17.Cart","18.Your cart","19.Order arrived","20.OngoingDelivery","21.Map"};
    RecyclerView recyclerView;
    Item_recycle_adapter item_recycle_adapter;
    ArrayList<Item_recycle_model> item_recycle_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recycle);

        recyclerView= findViewById(R.id.listrecycle);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(List_recycleActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        item_recycle_model = new ArrayList<>();

        for (int i=0;i < textrecycle.length;i++) {
            Item_recycle_model ab = new Item_recycle_model(textrecycle[i]);
            item_recycle_model.add(ab);
        }

        item_recycle_adapter = new Item_recycle_adapter(List_recycleActivity.this,item_recycle_model);
        recyclerView.setAdapter(item_recycle_adapter);
    }
}
