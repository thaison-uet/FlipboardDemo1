package com.thaison.flipboarddemo.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.adapter.EnchantedPagerAdapter;
import com.thaison.flipboarddemo.controler.resourceManager.CategoryImageManager;
import com.tiagosantos.enchantedviewpager.EnchantedViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H81 on 3/3/2017.
 */

public class MainCategoryFragment extends Fragment {
    private EnchantedViewPager enchantedViewPager;
    private EnchantedPagerAdapter enchantedPagerAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category_main, container, false);
        enchantedViewPager = (EnchantedViewPager) view.findViewById(R.id.evp_select_view_pager);
        enchantedPagerAdapter = new EnchantedPagerAdapter(container.getContext(), createCategoryImages());
        enchantedViewPager.setAdapter(enchantedPagerAdapter);
        return view;
    }

    private List<CategoryImageManager> createCategoryImages() {
        List<CategoryImageManager> categoryImages = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            categoryImages.add(new CategoryImageManager(getCategoryImageReference(i)));
        }

        return categoryImages;
    }

    private int getCategoryImageReference(int position) {
        if (position == 0) {
            return R.drawable.category_image_1;
        } else if (position == 1) {
            return R.drawable.category_image_2;
        } else if (position == 2) {
            return R.drawable.category_image_3;
        } else if (position == 3) {
            return R.drawable.category_image_4;
        } else if (position == 4) {
            return R.drawable.category_image_5;
        } else if (position == 5) {
            return R.drawable.category_image_6;
        } else if (position == 6) {
            return R.drawable.category_image_7;
        } else if (position == 7) {
            return R.drawable.category_image_8;
        } else if (position == 8) {
            return R.drawable.category_image_9;
        } else if (position == 9) {
            return R.drawable.category_image_10;
        }

        return R.drawable.category_image_1;
    }
}
