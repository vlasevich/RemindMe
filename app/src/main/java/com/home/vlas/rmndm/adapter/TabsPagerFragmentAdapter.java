package com.home.vlas.rmndm.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.home.vlas.rmndm.fragment.AbstractTabFragment;
import com.home.vlas.rmndm.fragment.BirthdaysFragment;
import com.home.vlas.rmndm.fragment.HistoryFragment;
import com.home.vlas.rmndm.fragment.IdeasFragment;
import com.home.vlas.rmndm.fragment.ToDoFragment;

import java.util.HashMap;
import java.util.Map;


public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap(context);
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
