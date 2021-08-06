package com.example.newsapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ImageView drawableLeft;
    TextView main_Heading;
    TabItem tabHome, tabSports, tabHealth, tabScience, tabEntertainment, tabTechnology, tabBusiness;
    ViewPager viewPager;
    PageAdapter pageAdapter;


    String apiKey = "d3427fb2c91149fa89bb72d355f915da";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        drawableLeft = findViewById(R.id.drawableLeft);
        main_Heading = findViewById(R.id.main_Heading);
        tabHome = findViewById(R.id.tabHome);
        tabSports = findViewById(R.id.tabSports);
        tabHealth = findViewById(R.id.tabHealth);
        tabScience = findViewById(R.id.tabScience);
        tabEntertainment = findViewById(R.id.tabEntertainment);
        tabTechnology = findViewById(R.id.tabTechnology);
        tabBusiness = findViewById(R.id.tabBusiness);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter = new PageAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4 || tab.getPosition()==5 || tab.getPosition()==6){
                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        // listen for scroll
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}