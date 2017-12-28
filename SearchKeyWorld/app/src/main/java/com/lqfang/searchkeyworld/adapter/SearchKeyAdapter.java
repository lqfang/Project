package com.lqfang.searchkeyworld.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.lqfang.searchkeyworld.R;


/**
 * Created by lqfang on 2017/11/23.
 * 搜索关键字的智能提示页面适配器
 */
public class SearchKeyAdapter extends BaseAdapter {

    private Context context;
    Intent intent;

    private String[] search_key = {"故宫", "东方明珠", "长城", "天安门", "鸟巢", "北京", "上海"};
    private String[] num_key = {"1", "1", "1", "1", "1", "0", "0"};

    public SearchKeyAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return search_key.length;
    }

    @Override
    public Object getItem(int position) {
        return search_key[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_search_key, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_keyword_name = (TextView) convertView.findViewById(R.id.tv_keyword_name);
            viewHolder.tv_keyword_num = (TextView) convertView.findViewById(R.id.tv_keyword_num);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tv_keyword_name.setText(search_key[position]);
        viewHolder.tv_keyword_num.setText(num_key[position]);


        //判断列表中内容是城市还是景点
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "你选择的是"+ search_key[position], Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    class ViewHolder{
        TextView tv_keyword_name, tv_keyword_num;
    }
}
