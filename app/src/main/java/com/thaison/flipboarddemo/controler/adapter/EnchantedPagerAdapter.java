package com.thaison.flipboarddemo.controler.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.resourceManager.CategoryImageManager;
import com.tiagosantos.enchantedviewpager.EnchantedViewPager;

import java.util.List;

/**
 * Created by H81 on 3/3/2017.
 */

public class EnchantedPagerAdapter extends PagerAdapter {
    private Context mContext;
    private LayoutInflater inflater;
    private List<CategoryImageManager> categoryImages;

    public EnchantedPagerAdapter(Context mContext, List<CategoryImageManager> categoryImages) {
        this.mContext = mContext;
        this.categoryImages = categoryImages;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView mCurrentView = (ImageView) inflater.inflate(R.layout.category_image_item,
                container, false);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;

        CategoryImageManager image = this.categoryImages.get(position);
        Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(),
                image.getImageResource(), options);

        mCurrentView.setImageBitmap(bitmap);
        mCurrentView.setTag(EnchantedViewPager.ENCHANTED_VIEWPAGER_POSITION + position);
        container.addView(mCurrentView);

        return mCurrentView;
    }

    @Override
    public int getCount() {
        return categoryImages.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getResources().getString(R.string.cover_stories);

            case 1:
                return mContext.getResources().getString(R.string.dogs);

            case 2:
                return mContext.getResources().getString(R.string.photography);

            case 3:
                return mContext.getResources().getString(R.string.music);

            case 4:
                return mContext.getResources().getString(R.string.movies);

            case 5:
                return mContext.getResources().getString(R.string.politics);

            case 6:
                return mContext.getResources().getString(R.string.sports);

            case 7:
                return mContext.getResources().getString(R.string.technology);

            case 8:
                return mContext.getResources().getString(R.string.recipes);

            case 9:
                return mContext.getResources().getString(R.string.beauty);

            default:
                return mContext.getResources().getString(R.string.unknown);
        }
    }
}
