package com.vadmin.tweet;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by vadmin on 26/3/15.
 */
public class Tabs extends ActionBarActivity {

    int Numboftabs = 3;
    private Toolbar toolbar;                              // Declaring the Toolbar Object
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tTabs;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        toolbar = (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        slide_tab();

    }

    private void slide_tab() {
        try {
            // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
            CharSequence slideTitles[] = {"Profile", "News Feed", "Favourites"};
            adapter = new ViewPagerAdapter(getSupportFragmentManager(), slideTitles, Numboftabs);

            // Assigning ViewPager View and setting the adapter
            pager = (ViewPager) findViewById(R.id.pager);
            pager.setOffscreenPageLimit(2);
            pager.setAdapter(adapter);

            // Assiging the Sliding Tab Layout View
            tTabs = (SlidingTabLayout) findViewById(R.id.tabs);
            tTabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
            tTabs.setViewPager(pager);
            tTabs.setBackgroundColor(getResources().getColor(R.color.background_floating_material_light));

            // Setting Custom Color for the Scroll bar indicator of the Tab View
            tTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
                @Override
                public int getIndicatorColor(int position) {
                    return getResources().getColor(R.color.material_red_500);
                }
            });


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
