package com.stomhong.weixin.func.weixin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stomhong.weixin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeixinFragment extends Fragment {


    public WeixinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weixin, container, false);
    }

}
