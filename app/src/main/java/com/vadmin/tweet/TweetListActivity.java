package com.vadmin.tweet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class TweetListActivity extends ActionBarActivity {


    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        List_view();

        String[] items = new String[4];
        for (int i=0; i<4; i++){
            items[i] = "String " +i;
        }

    }
 public void List_view(){
     ListView listView = (ListView)findViewById(R.id.list);
     String[] items = {"Sundari", "Suganya", "Surya", "Anitha"};
     listView.setAdapter(new TweetAdapter(this, R.layout.row_tweet, items));
     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Intent intent = new Intent(TweetListActivity.this, TweetDetailActivity.class);
             startActivity(intent);
         }
     });
 }
}
