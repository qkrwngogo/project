package com.example.originaltest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


class PagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 4;
    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Routine.newInstance(0);
            case 1:
                return Exercise.newInstance(1);
            case 2:
                return Record.newInstance(2);
            case 3:
                return Profile.newInstance(3);
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page" + position;
    }
}