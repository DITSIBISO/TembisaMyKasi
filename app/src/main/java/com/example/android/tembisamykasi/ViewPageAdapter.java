package com.example.android.tembisamykasi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/11.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new PublicPlaceContentFragment();
        }
        else if (position == 1)
        {
            fragment = new ResturantsPubsContentFragment();
        }
        else if (position == 2)
        {
            fragment = new ZiwaphiContentFragment();
        }



        else if (position == 4)
        {
            fragment = new Fragment();
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 4;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Gallery";
        }
        else if (position == 1)
        {
            title = "Events";
        }


        return title;
    }
}

