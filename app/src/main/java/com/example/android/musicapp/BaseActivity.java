package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Pablo on 07-Aug-16.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView homeTV = (TextView)(findViewById(R.id.home_tv));
        if( homeTV!= null ) {
            homeTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isInFront("MainActivity")) return;
                    Intent intent = new Intent(BaseActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }

        TextView nowPlayingTV = (TextView)(findViewById(R.id.nowplaying_tv));
        if( nowPlayingTV != null ) {
            nowPlayingTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isInFront("NowPlayingActivity")) return;
                    Intent intent = new Intent(BaseActivity.this, NowPlayingActivity.class);
                    startActivity(intent);
                }
            });
        }

        TextView storeTV = (TextView)(findViewById(R.id.store_tv));
        if( storeTV != null ) {
            storeTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isInFront("StoreActivity")) return;
                    Intent intent = new Intent(BaseActivity.this, StoreActivity.class);
                    startActivity(intent);
                }
            });
        }

        TextView detailTV = (TextView)(findViewById(R.id.details_tv));
        if( detailTV != null ) {
            detailTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isInFront("DetailsActivity")) return;
                    Intent intent = new Intent(BaseActivity.this, DetailsActivity.class);
                    startActivity(intent);
                }
            });
        }

        TextView searchTV = (TextView)(findViewById(R.id.search_tv));
        if( searchTV != null ) {
            searchTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isInFront("SearchActivity")) return;
                    Intent intent = new Intent(BaseActivity.this, SearchActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

    private boolean isInFront( String activityName ) {
        String currentAct = this.getClass().getSimpleName();
        return activityName.equals(currentAct);
    }
}
