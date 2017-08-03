package com.stomhong.weixin.func.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Author: StomHong
 * Date: 2017/7/25
 * @version 1.0.0
 * @since 1.0.0
 * Description: ViewHolder基类
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    private View rootView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        this.rootView = itemView;
    }

    /**
     * 将数据绑定到view
     *
     * @param data 数据
     */
    public abstract void bindData(T data,int position);


    public View getContentView() {
        return this.rootView;
    }
}
