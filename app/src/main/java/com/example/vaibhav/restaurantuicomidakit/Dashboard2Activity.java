package com.example.vaibhav.restaurantuicomidakit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import adapter.Dashboard2_adapter;
import adapter.Dashboard5_adapter;
import model.Dashboard2_model;
import model.Dashboard5_model;

public class Dashboard2Activity extends AppCompatActivity {

    String tv1[] ={"Ayam goreng ninit, Pogung Kidul","Penyetan mas kobis, Pogung",
            "Ayam goreng ninit, Pogung Kidul","Penyetan mas kobis, Pogung",
            "Ayam goreng ninit, Pogung Kidul"};

    String[] abc = {"OPEN","CLOSE","OPEN","CLOSE","OPEN"};

    int[] ll1 = {R.drawable.rect_yellowbutton,R.drawable.rect_redbutton,R.drawable.rect_yellowbutton
            ,R.drawable.rect_redbutton,R.drawable.rect_yellowbutton};

    Integer imagecook[] ={R.drawable.maxresdefault,R.drawable.cook,R.drawable.maxresdefault,R.drawable.cook,R.drawable.maxresdefault};

    private RecyclerView recyclerView;
    private Dashboard2_adapter dashboard2_adapter;
    private ArrayList<Dashboard2_model> dashboard2_model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);

        recyclerView= findViewById(R.id.recycle1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Dashboard2Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        dashboard2_model = new ArrayList<>();

        for (int i=0;i < abc.length;i++) {
            Dashboard2_model ab = new Dashboard2_model(abc[i],tv1[i],imagecook[i],ll1[i]);
            dashboard2_model.add(ab);
        }

        dashboard2_adapter = new Dashboard2_adapter(Dashboard2Activity.this,dashboard2_model);
        recyclerView.setAdapter(dashboard2_adapter);

    }
}
