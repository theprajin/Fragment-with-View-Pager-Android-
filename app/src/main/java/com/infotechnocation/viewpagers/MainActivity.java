package com.infotechnocation.viewpagers;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.infotechnocation.viewpagers.adapters.ViewPageAdapter;
import com.infotechnocation.viewpagers.fragments.NewFragment;
import com.infotechnocation.viewpagers.fragments.PopularFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout)findViewById(R.id.tabLayout);
        mViewPager = (ViewPager)findViewById(R.id.veiwPager);

        final String[] title = new String[]{"New","Popular"};
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new NewFragment());
        fragments.add(new PopularFragment());

        ViewPageAdapter mViewPagerAdapter = new ViewPageAdapter(getSupportFragmentManager(),title,fragments);

        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){


            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle(title[position]);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
