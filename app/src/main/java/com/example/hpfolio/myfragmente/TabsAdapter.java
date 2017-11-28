package com.example.hpfolio.myfragmente;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by HP FOLIO on 11/20/2017.
 */

public class TabsAdapter extends FragmentStatePagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:

                return new Android();

            case 1:
                return new Ios();

            case 2:
                return new Windows();
        }


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
