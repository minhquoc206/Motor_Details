package com.example.listviewdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.listviewdemo.R;

public class Fragment_Activity extends AppCompatActivity
{
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
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
                    return new Fragment_Kawasaki();
                case 1:
                    return new Fragment_Yamaha();
                case 2:
                    return new Fragment_Honda();
                default:
                    return new Fragment_Sym();
            }

        }

        @Override
        public int getCount() { return 4; }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position){
            switch (position) {
                case 0:
                    return "KAWASAKI";
                case 1:
                    return "YAMAHA";
                case 2:
                     return "HONDA";
                default:
                    return "SYM";
            }
        }
    }
}
