package com.example.originaltest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import nl.joery.animatedbottombar.AnimatedBottomBar;


public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2_container);
        AnimatedBottomBar animatedBottomBar = findViewById(R.id.bottom_bar);


    }


}

