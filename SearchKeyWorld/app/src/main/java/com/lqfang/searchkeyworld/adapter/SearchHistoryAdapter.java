package com.lqfang.searchkeyworld.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lqfang.searchkeyworld.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lqfang on 2017/11/30.
 * 历史记录适配器
 */
public class SearchHistoryAdapter extends BaseAdapter {

    private Context mContext;
    private LinearLayout historyLayout;
    public List<String> list = new ArrayList<>();

    //定义回调事件，用于点击事件

    public OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public SearchHistoryAdapter(Context context, LinearLayout historyLayout,  List<String> list ) {
        // TODO Auto-generated constructor stub
        this.mContext = context;
        this.historyLayout = historyLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        if(list != null){
            return list.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public boolean addAll(List<String> list) {
        return this.list.addAll(list);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup arg2) {
        // TODO Auto-generated method stub
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.adapter_search_history, null);
            holder.rl_item = (RelativeLayout) convertView.findViewById(R.id.rl_item);
            holder.houseNameView = (TextView) convertView
                    .findViewById(R.id.tv_historytext);
            holder.single_close = (ImageView) convertView.findViewById(R.id.single_close);
            convertView.setTag(holder);


        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.houseNameView.setText(list.get(position));

        if (mOnItemClickListener != null) {
            final ViewHolder finalHolder = holder;
            holder.rl_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(finalHolder.rl_item, position);
                }
            });

            holder.single_close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnItemClickListener.onItemChildClick(view, position);
                    //点击删除单条历史记录
                    list.remove(position);
                    if (list.size() == 0) {
                        historyLayout.setVisibility(View.GONE);
                    }
                    notifyDataSetChanged();
                }
            });

        }

        return convertView;
    }

    class ViewHolder {
        TextView houseNameView;
        ImageView single_close;
        RelativeLayout rl_item;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemChildClick(View view, int position);
    }

}

