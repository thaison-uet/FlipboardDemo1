package com.thaison.flipboarddemo.controler.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.view.fragments.MainCategoryFragment;
import com.thaison.flipboarddemo.view.fragments.MainHomeFragment;
import com.thaison.flipboarddemo.view.fragments.MainSelectFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H81 on 3/3/2017.
 */

public class MainFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private List<Fragment> fragments;

    public MainFragmentAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
        initComponents();
    }

    private void initComponents() {
        fragments = new ArrayList<>();
        fragments.add(new MainHomeFragment());
        fragments.add(new MainCategoryFragment());
        fragments.add(new MainSelectFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}
