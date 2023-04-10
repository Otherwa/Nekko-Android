package com.example.nekko;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the TabLayout view
        TabLayout tabLayout = findViewById(R.id.tabview);

        // Add tabs to the TabLayout
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());

        // Create a ViewPager adapter to manage the three fragments
        ViewPager viewPager = findViewById(R.id.viewpager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Pics(), "Pics");
        adapter.addFragment(new Feed(), "Feed");
        adapter.addFragment(new Profiles(), "Profile");
        viewPager.setAdapter(adapter);

        // Link the TabLayout to the ViewPager
        tabLayout.setupWithViewPager(viewPager);


    }
}