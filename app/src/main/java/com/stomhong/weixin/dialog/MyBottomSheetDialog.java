package com.stomhong.weixin.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.widget.BottomSheetDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.stomhong.weixin.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: StomHong
 * Date: 2017/7/18
 *
 * @since: 1.0
 * Description:
 */

public class MyBottomSheetDialog extends BottomSheetDialog {

    private OnItemClickListener mOnItemClickListener;
    private List<String> list = new ArrayList<>() ;
    private
    @SuppressWarnings("unchecked")
    ArrayAdapter adapter;

    private MyBottomSheetDialog(@NonNull Context context) {
        super(context);
    }

    public MyBottomSheetDialog(@NonNull Context context, List<String> data) {
        super(context);
        init(context,data);
    }

    private MyBottomSheetDialog(@NonNull Context context, @StyleRes int theme) {
        super(context, theme);
    }

    private MyBottomSheetDialog(@NonNull Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);

    }

    private void init(final Context context, List<String> d) {
        if (d != null) {
            list.addAll(d);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_bottom_sheet,null);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        adapter = new ArrayAdapter(context,android.R.layout.simple_list_item_1,list){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view1= super.getView(position, convertView, parent);
                TextView textView = (TextView) view1.findViewById(android.R.id.text1);
                textView.setTextColor(context.getResources().getColor(R.color.colorPrimaryLight));
                textView.setTextSize(17.5f);
                textView.setGravity(Gravity.CENTER);
                return view1;
            }
        };
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mOnItemClickListener.onItemClick(position);
                dismiss();
            }
        });
//        SuperTextView textView = (SuperTextView) view.findViewById(R.id.stv_cancel);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                dismiss();
//            }
//        });
        setContentView(view);
    }

    public void setData(List<String> data){
        list.addAll(data);
        adapter.notifyDataSetChanged();
    }

    public void setData(String... data) {
        list.addAll(Arrays.asList(data));
        adapter.notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }


}
