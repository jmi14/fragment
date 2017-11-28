package com.example.hpfolio.myfragmente;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;
    TabsAdapter tabsAdapter;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabsAdapter = new TabsAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.pager);

        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                actionBar = getActionBar();
                actionBar.setSelectedNavigationItem(position);
            }
        });

        viewPager.setAdapter(tabsAdapter);
        actionBar = getActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        };

        actionBar.addTab(actionBar.newTab().setText("1").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("2").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("3").setTabListener(tabListener));

    }
}
