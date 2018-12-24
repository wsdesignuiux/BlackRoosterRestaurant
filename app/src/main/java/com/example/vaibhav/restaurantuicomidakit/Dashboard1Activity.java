package com.example.vaibhav.restaurantuicomidakit;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import adapter.ViewpagerAdapter;
import me.relex.circleindicator.CircleIndicator;

public class Dashboard1Activity extends AppCompatActivity {

    Spinner spinner;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private ViewpagerAdapter viewpagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard1);

        spinner = findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("Pizza Salad");
        list.add("Salad");
        list.add("Baked Chicken");
        list.add("Pizza Salad");
        list.add("Salad");
        list.add("Baked Chicken");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Dashboard1Activity.this, R.layout.item_spinnergreen,
                R.id.spinner_text1, list);
        spinner.setAdapter(dataAdapter);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        circleIndicator = (CircleIndicator) findViewById(R.id.circleindicator);

        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        circleIndicator.setViewPager(viewPager);
        viewpagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

    }
}