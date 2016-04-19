package com.vadmin.tweet;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by vadmin on 5/2/15.
 */


public class TweetAdapter extends ArrayAdapter {
    private LayoutInflater inflater;
    public TweetAdapter(Activity activity, int row_tweet, String[] items){
        super(activity, R.layout.row_tweet, items);
        inflater = activity.getWindow().getLayoutInflater();

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        return inflater.inflate(R.layout.row_tweet, parent, false);
    }
}
