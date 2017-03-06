package com.thaison.flipboarddemo.controler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.items.InterestItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H81 on 3/6/2017.
 */

public class InterestAdapter extends BaseAdapter {
    private Context mContext;
    private List<InterestItem> interestes;

    public InterestAdapter(Context mContext) {
        this.mContext = mContext;
        initInterestItem();
    }

    private void initInterestItem() {
        interestes = new ArrayList<>();
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_news),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_business),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.politics),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_celebrity_news),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_weather),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_computer_science),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_travel),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_healthy_eating),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_fashion),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_mindfulness),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_world_economy),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_climate_change),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_climate_change),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_street_art),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_tv),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_movies),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_cool_stuff),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_workouts),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_home),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_calssical_music),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_fortune_500),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_gaming),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_electric_vehicles),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_leadership),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_food_and_dining),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_national_parks),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_startups),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_health),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_digital_photography),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_breakthroughs),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_autos),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_advertising),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_road_trips),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_books),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_running),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_foreign_policy),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_educatiohn),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_new_york_city),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_architecture),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_yoga),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_parenting),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_basketball),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_entrepreneurship),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_tiny_house_movement),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_middle_east),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_self_IMPROVEMENT),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_self_IMPROVEMENT),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_cycling),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_us_congress),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_apps),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_star_wars),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_personal_finance),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_diy),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_sleep),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_green_living),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_nfl),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_space),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_coffee),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_outdoors),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_game_of_thrones),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_gardening),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_how_to_s),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_writing),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_crafting),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_motorsport),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_weddings),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_interior_design),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_memes),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_work_life_balance),
                mContext.getResources().getString(R.string.interest_reading)));
        interestes.add(new InterestItem(
                mContext.getResources().getString(R.string.interest_or_personalize),
                mContext.getResources().getString(R.string.interest_reading)));
    }

    @Override
    public int getCount() {
        return interestes.size();
    }

    @Override
    public InterestItem getItem(int position) {
        return interestes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_interest, parent, false);
            holder = new ViewHolder();
            holder.tvInterestTitle = (TextView) convertView.findViewById(R.id.tv_interest_title);
            holder.tvInterestReading = (TextView) convertView.findViewById(R.id.tv_reading);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        InterestItem interestItem = interestes.get(position);
        holder.tvInterestTitle.setText(interestItem.getTitle());
        holder.tvInterestReading.setText(interestItem.getReading());

        return convertView;
    }

    public void getInterestTitle(int position) {
        Toast.makeText(mContext, interestes.get(position).getTitle(), Toast.LENGTH_SHORT).show();
    }

    private class ViewHolder {
        private TextView tvInterestTitle;
        private TextView tvInterestReading;
    }
}
