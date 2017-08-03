package com.stomhong.weixin.wedget;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;

/**
 * Author: StomHong
 * Date: 2017/7/25
 * @version 1.0.0
 * @since 1.0.0
 * Description:
 */
public class KeyPreImeEditText extends AppCompatEditText{
    public KeyPreImeEditText(Context context) {
        super(context);
    }

    public KeyPreImeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KeyPreImeEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            setVisibility(GONE);
            Log.e("keyboard", "onKeyPreIme we got back");
        }
        return super.onKeyPreIme(keyCode, event);
    }
}
