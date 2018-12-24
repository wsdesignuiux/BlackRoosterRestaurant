package com.example.vaibhav.restaurantuicomidakit;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import adapter.Tab_adapter;

public class Dashboard3Activity extends AppCompatActivity {


    Tab_adapter tab_adapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    private Typeface mTypeface;
    private Typeface mTypefaceBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard3);

        tabLayout = findViewById(R.id.Tablayout1);
        viewPager = findViewById(R.id.vp1);

        tabLayout.addTab(tabLayout.newTab().setText("Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Menu"));
        tabLayout.addTab(tabLayout.newTab().setText("Reviews"));
//tab layout below in viewPager set above.
        TextView tv1 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(0)).getChildAt(1));
        tv1.setScaleY(-1);
        TextView tv2 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(1)).getChildAt(1));
        tv2.setScaleY(-1);
        TextView tv3 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(2)).getChildAt(1));
        tv3.setScaleY(-1);

        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "font/roboto_regular.ttf");
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                }
            }
        }

        Tab_adapter adapter = new Tab_adapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        setCustomFontAndStyle(tabLayout, 0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
       }

    private void setCustomFontAndStyle(TabLayout tabLayout, Integer position) {
        mTypeface = Typeface.createFromAsset(getAssets(), "font/roboto_regular.ttf");
        mTypefaceBold = Typeface.createFromAsset(getAssets(), "font/roboto_regular.ttf");
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    if (j == position) {
                        ((TextView) tabViewChild).setTypeface(mTypefaceBold, Typeface.NORMAL);
                    } else {
                        ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                    }
                }
            }
        }
    }
}