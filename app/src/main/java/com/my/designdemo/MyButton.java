package com.my.designdemo;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;


/**
 * Author：mengyuan
 * Date  : 2017/6/29下午4:55
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class MyButton extends AppCompatButton {
    public MyButton(Context context) {
        this(context, null);
    }

    public MyButton(Context context, AttributeSet attrs) {
        this(context, attrs, android.support.v7.appcompat.R.attr.buttonStyle);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        setTextColor(getResources().getColor(R.color.color_ffffff));
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        setBackgroundResource(R.drawable.bg_0090ff_corners_5dp);
    }
}
