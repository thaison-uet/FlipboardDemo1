package com.thaison.flipboarddemo.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.adapter.InterestAdapter;
import com.thaison.flipboarddemo.view.activities.MainActivity;

/**
 * Created by H81 on 3/3/2017.
 */

public class MainSelectFragment extends Fragment implements AdapterView.OnItemClickListener, View.OnClickListener {
    private ListView lvInterest;
    private InterestAdapter interestAdapter;
    private ImageView ivBack;
    private ImageView ivFlipboardLogo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_select_main, container, false);
        lvInterest = (ListView) view.findViewById(R.id.lv_interest);
        interestAdapter = new InterestAdapter(container.getContext());
        lvInterest.setAdapter(interestAdapter);
        lvInterest.setOnItemClickListener(this);

        ivBack = (ImageView) view.findViewById(R.id.iv_back);
        ivBack.setOnClickListener(this);
        ivFlipboardLogo = (ImageView) view.findViewById(R.id.iv_flipboard_logo);
        ivFlipboardLogo.setOnClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        interestAdapter.getInterestTitle(position);
    }

    @Override
    public void onClick(View v) {
        ((MainActivity) getActivity()).goToPreviousPage();
    }
}
