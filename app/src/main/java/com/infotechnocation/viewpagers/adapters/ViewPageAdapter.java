package com.infotechnocation.viewpagers.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.infotechnocation.viewpagers.fragments.NewFragment;
import com.infotechnocation.viewpagers.fragments.PopularFragment;

import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 12/6/2016.
 */

public class ViewPageAdapter extends FragmentStatePagerAdapter {

    String[] title;
    ArrayList<Fragment> fragments;

    public ViewPageAdapter(FragmentManager fm, String[] title, ArrayList<Fragment> fragments){
        super(fm);
        this.title = title;
        this.fragments = fragments;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
