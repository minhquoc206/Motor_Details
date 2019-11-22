package com.example.listviewdemo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewdemo.R;

import java.util.ArrayList;

public class Fragment_Sym extends AppCompatActivity
{
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sym);
        viewPager = findViewById(R.id.view_paper);
        viewPager.setAdapter( (new PagerDemoAdapter()));
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }

    private class PagerDemoAdapter extends FragmentPagerAdapter
    {
        public PagerDemoAdapter() { super(getSupportFragmentManager()); }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Fragment();
                case 1:
                    return new Fragment();
                default:
                    return new Fragment();
            }

        }

        @Override
        public int getCount() { return 3; }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position){
            switch (position) {
                case 0:
                    return "PHO THONG";
                case 1:
                    return "PKN";
                default:
                    return "PKL" ;
            }
        }
    }
}

