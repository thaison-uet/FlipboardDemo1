package com.thaison.flipboarddemo.view.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.adapter.MainFragmentAdapter;
import com.thaison.flipboarddemo.view.fragments.MainSelectFragment;

/**
 * Created by H81 on 3/1/2017.
 */

public class MainActivity extends AppCompatActivity {
    private ViewPager vpMainViewPager;
    private MainFragmentAdapter mainFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        vpMainViewPager = (ViewPager) findViewById(R.id.vp_main_view_pager);
        mainFragmentAdapter = new MainFragmentAdapter(getSupportFragmentManager(), this);
        vpMainViewPager.setAdapter(mainFragmentAdapter);
    }

    public void goToPreviousPage() {
        vpMainViewPager.setCurrentItem(vpMainViewPager.getCurrentItem() - 1);
    }

    public void goToNextPage() {
        vpMainViewPager.setCurrentItem(vpMainViewPager.getCurrentItem() + 1);
    }
}
