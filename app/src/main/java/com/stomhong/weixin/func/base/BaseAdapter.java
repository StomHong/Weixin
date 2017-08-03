package com.stomhong.weixin.func.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @author  StomHong
 * @version 1.0.0
 * @since 1.0.0
 * Date: 2017/7/25
 * Description: Adapter基类
 */
public abstract class BaseAdapter<T extends BaseViewHolder> extends RecyclerView.Adapter<T>{


    @Override
    public abstract T onCreateViewHolder(ViewGroup parent, int viewType);

    @SuppressWarnings("unchecked")
    @Override
    public void onBindViewHolder(T holder, int position) {
        holder.bindData(getItem(position),position);
    }

    public abstract Object getItem(int position);

    @Override
    public abstract int getItemCount();


}
