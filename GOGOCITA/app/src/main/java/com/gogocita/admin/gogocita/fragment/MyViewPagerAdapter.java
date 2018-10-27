package com.gogocita.admin.gogocita.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.gogocita.admin.gogocita.fragment.TabFragment1;
import com.gogocita.admin.gogocita.fragment.TabFragment2;
import com.gogocita.admin.gogocita.fragment.TabFragment3;
import com.gogocita.admin.gogocita.fragment.TabFragment4;

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    public static final int NUM_PAGER = 4;

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;

            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;

            case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;

            case 3:
                TabFragment4 tab4 = new TabFragment4();
                return tab4;

            default:
                tab1 = new TabFragment1();
                return tab1;

        }
    }

    @Override
    public int getCount() {
        return NUM_PAGER;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "HOME";
            case 1:
                return "SERVICE";
            case 2:
                return "PROFILE";
            case 3:
                return "SETTING";
            default:
                return "HOME";
        }
    }
}
