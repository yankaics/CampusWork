package com.shun.campuswork.activity;

import com.lidroid.xutils.ViewUtils;
import com.shun.campuswork.R;

/**
 * Created by shun99 on 2015/12/3.
 */
public class QuestionActivity extends BaseActivity{

    @Override
    public void init() {
        setContentView(R.layout.activity_question);
        ViewUtils.inject(this);
    }

}
