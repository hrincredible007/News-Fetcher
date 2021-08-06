package com.example.newsapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.newsapplication.Fragment.Fragment_Business;
import com.example.newsapplication.Fragment.Fragment_Entertainment;
import com.example.newsapplication.Fragment.Fragment_Health;
import com.example.newsapplication.Fragment.Fragment_Home;
import com.example.newsapplication.Fragment.Fragment_Science;
import com.example.newsapplication.Fragment.Fragment_Sports;
import com.example.newsapplication.Fragment.Fragment_Technology;


public class PageAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PageAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_Home();
            case 1:
                return new Fragment_Sports();
            case 2:
                return new Fragment_Health();
            case 3:
                return new Fragment_Science();
            case 4:
                return new Fragment_Entertainment();
            case 5:
                return new Fragment_Technology();
            case 6:
                return new Fragment_Business();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }


}
