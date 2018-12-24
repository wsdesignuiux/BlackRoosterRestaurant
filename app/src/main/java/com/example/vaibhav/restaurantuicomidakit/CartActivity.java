package com.example.vaibhav.restaurantuicomidakit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Cart_adapter;
import adapter.Dashboard4_adapter;
import model.Cart_model;
import model.Dashbord4_model;

public class CartActivity extends AppCompatActivity {

    String text1[] = {"Knock You Naked Brownies","Red Lentil Curry","Asian Noodle Salad"};
    String text2[] = {"Guavas","Tarragon","Cannellini beans"};
    String text3[] = {"61","45","48"};

    Integer image1[] = {R.drawable.cake,R.drawable.khana,R.drawable.chines};

    private RecyclerView recyclerView;
    private Cart_adapter cart_adapter;
    private ArrayList<Cart_model> cart_models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView= findViewById(R.id.cart);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CartActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cart_models = new ArrayList<>();

        for (int i=0;i < text1.length;i++) {
            Cart_model ab = new Cart_model(text1[i],text2[i],text3[i],image1[i]);
            cart_models.add(ab);
        }

        cart_adapter = new Cart_adapter(CartActivity.this,cart_models);
        recyclerView.setAdapter(cart_adapter);

    }
}
