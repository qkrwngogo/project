package com.example.originaltest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    companion object{
        private const val NUM_PAGES = 4
    }
    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        if(position== 0) {
            return Routine()
        } else if(position == 1) {
            return Exercise()
        } else if(position == 2) {
            return Record()
        } else {
            return Profile()
        }
    }

}