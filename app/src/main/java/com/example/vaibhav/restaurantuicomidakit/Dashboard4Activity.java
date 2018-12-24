package com.example.vaibhav.restaurantuicomidakit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Dashboard4_adapter;
import adapter.Dashboard5_adapter;
import model.Dashboard5_model;
import model.Dashbord4_model;

public class Dashboard4Activity extends AppCompatActivity {

    String tv1[] = {"Knock You Naked Brownies","Red Lentil Curry","Asian Noodle Salad","Knock You Naked Brownies","Red Lentil Curry"};
    String tv2[] = {"Guavas","Tarragon","Cannellini beans","Guavas","Tarragon"};
    String tv3[] = {"61","45","48","61","45"};

    Integer icecrme[] = {R.drawable.cake,R.drawable.khana,R.drawable.chines,R.drawable.cake,R.drawable.khana};

    private RecyclerView recyclerView;
    private Dashboard4_adapter dashboard4_adapter;
    private ArrayList<Dashbord4_model> dashbord4_models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard4);

        recyclerView= findViewById(R.id.recycle4);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Dashboard4Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        dashbord4_models = new ArrayList<>();

        for (int i=0;i < tv1.length;i++) {
            Dashbord4_model ab = new Dashbord4_model(tv1[i],tv2[i],tv3[i],icecrme[i]);
            dashbord4_models.add(ab);
        }

        dashboard4_adapter = new Dashboard4_adapter(Dashboard4Activity.this,dashbord4_models);
        recyclerView.setAdapter(dashboard4_adapter);

    }
}