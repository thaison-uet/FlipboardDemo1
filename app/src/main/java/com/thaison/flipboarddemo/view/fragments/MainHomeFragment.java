package com.thaison.flipboarddemo.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.view.activities.MainActivity;

/**
 * Created by H81 on 3/3/2017.
 */

public class MainHomeFragment extends Fragment implements View.OnClickListener {
    private Button btnAdded;
    private Button btnLikes;
    private Button btnMagazines;
    private Button btnFollowing;
    private ImageView ivNext;
    private LinearLayout llAdded;
    private LinearLayout llLikes;
    private LinearLayout llMagazines;
    private LinearLayout llFollowing;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_main, container, false);

        btnAdded = (Button) view.findViewById(R.id.btn_added);
        btnAdded.setOnClickListener(this);
        btnLikes = (Button) view.findViewById(R.id.btn_likes);
        btnLikes.setOnClickListener(this);
        btnMagazines = (Button) view.findViewById(R.id.btn_magazines);
        btnMagazines.setOnClickListener(this);
        btnFollowing = (Button) view.findViewById(R.id.btn_following);
        btnFollowing.setOnClickListener(this);
        llAdded = (LinearLayout) view.findViewById(R.id.ll_added);
        llLikes = (LinearLayout) view.findViewById(R.id.ll_likes);
        llMagazines = (LinearLayout) view.findViewById(R.id.ll_magazines);
        llFollowing = (LinearLayout) view.findViewById(R.id.ll_following);

        ivNext = (ImageView) view.findViewById(R.id.iv_next);
        ivNext.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_added:
                btnAdded.setTextColor(getResources().getColor(R.color.colorBlack));
                btnLikes.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnMagazines.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnFollowing.setTextColor(getResources().getColor(R.color.colorLightGray));
                llAdded.setVisibility(View.VISIBLE);
                llLikes.setVisibility(View.GONE);
                llMagazines.setVisibility(View.GONE);
                llFollowing.setVisibility(View.GONE);
                break;

            case R.id.btn_likes:
                btnLikes.setTextColor(getResources().getColor(R.color.colorBlack));
                btnAdded.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnMagazines.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnFollowing.setTextColor(getResources().getColor(R.color.colorLightGray));
                llLikes.setVisibility(View.VISIBLE);
                llAdded.setVisibility(View.GONE);
                llMagazines.setVisibility(View.GONE);
                llFollowing.setVisibility(View.GONE);
                break;

            case R.id.btn_magazines:
                btnMagazines.setTextColor(getResources().getColor(R.color.colorBlack));
                btnAdded.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnLikes.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnFollowing.setTextColor(getResources().getColor(R.color.colorLightGray));
                llMagazines.setVisibility(View.VISIBLE);
                llAdded.setVisibility(View.GONE);
                llLikes.setVisibility(View.GONE);
                llFollowing.setVisibility(View.GONE);
                break;

            case R.id.btn_following:
                btnFollowing.setTextColor(getResources().getColor(R.color.colorBlack));
                btnAdded.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnLikes.setTextColor(getResources().getColor(R.color.colorLightGray));
                btnMagazines.setTextColor(getResources().getColor(R.color.colorLightGray));

                llFollowing.setVisibility(View.VISIBLE);
                llAdded.setVisibility(View.GONE);
                llLikes.setVisibility(View.GONE);
                llMagazines.setVisibility(View.GONE);
                break;

            case R.id.iv_next:
                ((MainActivity) getActivity()).goToNextPage();
                break;
        }
    }
}
