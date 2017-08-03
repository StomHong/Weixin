package com.stomhong.weixin.func.weixin;

import android.view.View;
import android.view.ViewGroup;

import com.stomhong.weixin.R;
import com.stomhong.weixin.func.base.BaseAdapter;
import com.stomhong.weixin.data.local.vo.WeixinInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author StomHong
 * @version 1.0.0
 * @since 1.0.0
 * Date: 2017/7/26
 * Description:
 */

public class WeixinAdapter extends BaseAdapter<WeixinHolder> {

    List<WeixinInfo> data = new ArrayList<>();

    @Override
    public WeixinHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = View.inflate(parent.getContext(), R.layout.item_weixin,parent);
        return new WeixinHolder(view);
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
