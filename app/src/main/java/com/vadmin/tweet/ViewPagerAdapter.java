package com.vadmin.tweet;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
/**
 * Created by vadmin on 24/2/15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence tabTitles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence slideTitles[], int mNumbOfTabsum) {
        super(fm);


        this.tabTitles = slideTitles;
        this.NumbOfTabs = mNumbOfTabsum;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                //Fragement for Personal Tab
                return new Profile();
            case 1:
                //Fragment for Medical Tab
                return new NewsFeed();
            case 2:
                //Fragment for Insurance Tab
                return new Favourites();
        }
        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}