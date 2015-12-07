package com.shun.campuswork.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * Created by shun99 on 2015/11/19.
 */
public abstract class BaseActivity extends AppCompatActivity {
    public Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    public abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("onDestroy","onDestroy....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("onStop", "onStop....");
    }
}
