package com.example.originaltest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import nl.joery.animatedbottombar.AnimatedBottomBar;


public class MainActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;
    FragmentPagerAdapter adapterViewMenu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager container = findViewById(R.id.viewPager_container);
        adapterViewPager = new PagerAdapter((getSupportFragmentManager()));
        container.setAdapter(adapterViewPager);
        AnimatedBottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setupWithViewPager(container);
        // Home Button
        ImageButton homeBtn = findViewById(R.id.home);
        ImageButton menuBtn = findViewById(R.id.menu);

        homeBtn.setOnClickListener(v -> bottomBar.selectTabById(R.id.nav_routine, true));
        // Menu Button

    }

}
