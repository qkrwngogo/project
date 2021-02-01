package com.example.originaltest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import nl.joery.animatedbottombar.AnimatedBottomBar;


public class MainActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vpPager = (ViewPager) findViewById(R.id.viewPager2_container);
        adapterViewPager = new PagerAdapter((getSupportFragmentManager()));
        vpPager.setAdapter(adapterViewPager);
        AnimatedBottomBar bottomBar = (AnimatedBottomBar) findViewById(R.id.bottom_bar);
        bottomBar.setupWithViewPager(vpPager);
        ImageButton homeBtn = (ImageButton) findViewById(R.id.home);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomBar.selectTabById(R.id.nav_routine, true);
            }
        });
    }


}

