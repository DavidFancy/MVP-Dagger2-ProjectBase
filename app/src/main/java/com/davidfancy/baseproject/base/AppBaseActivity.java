package com.davidfancy.baseproject.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by David Liu on 5/10/17.
 * NowBoarding Ltd
 * lyhmelbourne@gmail.com
 */

public abstract class AppBaseActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent();
    }

    /**
     * Injecting the Activity to Dagger
     */
    protected abstract void setupActivityComponent();
}
