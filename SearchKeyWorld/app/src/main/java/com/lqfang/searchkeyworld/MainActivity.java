package com.lqfang.searchkeyworld;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.lqfang.searchkeyworld.adapter.SearchHistoryAdapter;
import com.lqfang.searchkeyworld.adapter.SearchKeyAdapter;
import com.lqfang.searchkeyworld.widget.NewFistListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements TextView.OnEditorActionListener{

    @Bind(R.id.et_search_key)
    EditText et_search_key;
    @Bind(R.id.list_search_key)
    ListView list_search_key;
    @Bind(R.id.ll_recent_city)
    LinearLayout ll_recent_city;
    @Bind(R.id.list_recent)
    NewFistListView list_recent;
    @Bind(R.id.clear_key)
    TextView clear_key;

    String keyWorld;
    private String historykey;
    private SharedPreferences sp;
    List<String> listHistory = new ArrayList<>();
    private SearchKeyAdapter searchKeyAdapter;
    private SearchHistoryAdapter searchHistoryAdapter;
    private InputMethodManager inputManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();
        getSearchKey();
        getHistoryData();
    }

    private void initViews() {
        historykey = "key";
        sp = getSharedPreferences(historykey, 0);
        searchKeyAdapter = new SearchKeyAdapter(this);
        list_search_key.setAdapter(searchKeyAdapter);

        // 显示键盘
        et_search_key.setFocusable(true);
        et_search_key.setFocusableInTouchMode(true);
        et_search_key.requestFocus();
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {
                inputManager = (InputMethodManager) et_search_key.getContext()
                        .getSystemService(
                                MainActivity.this.INPUT_METHOD_SERVICE);
                inputManager.showSoftInput(et_search_key, 0);
                timer.cancel();
            }

        }, 200);
    }

    /*
   * 获取历史记录
   * */
    private void getHistoryData() {
        // TODO Auto-generated method stub
        List<String> listKeyWord = getKey();
        if (!("".equals(listKeyWord.get(0))) && listKeyWord.size() > 0) {

            ll_recent_city.setVisibility(View.VISIBLE);
            searchHistoryAdapter = new SearchHistoryAdapter(this, ll_recent_city, listHistory);

            searchHistoryAdapter.setOnItemClickListener(new SearchHistoryAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    String keyword = listHistory.get(position);

                }

                @Override
                public void onItemChildClick(View view, int position) {
                    //点击删除单条历史记录
                    SharedPreferences sp1 = getSharedPreferences(historykey, 0);
                    String save_Str = sp1.getString("history", "");
                    String[] hisArrays = save_Str.split(",");
                    String str = "";
                    StringBuilder sb = new StringBuilder(str);

                    for (int i = 0; i < hisArrays.length; i++) {
                        if(i !=position){
                            sb.append(hisArrays[i] + ",");
                        }
                    }
                    sp.edit().putString("history", sb.toString()).commit();
                }
            });

            searchHistoryAdapter.addAll(listHistory);
            list_recent.setAdapter(searchHistoryAdapter);
            searchHistoryAdapter.notifyDataSetChanged();
        }

    }


    // 保存关键字
    private void saveKey(String key) {
        SharedPreferences sp1 = getSharedPreferences(historykey, 0);
        String save_Str = sp1.getString("history", "");
        String[] hisArrays = save_Str.split(",");
        //关键字存储按时间倒序存（把数组倒序）
        StringBuilder sb = new StringBuilder(key);
        //数组倒序(始末倒序)
        for (int start = 0, end = hisArrays.length - 1; start < end; start++, end--) {
            String temp = hisArrays[end];
            hisArrays[end] = hisArrays[start];
            hisArrays[start] = temp;
        }
        sb.append( "," + save_Str);
        sp.edit().putString("history", sb.toString()).commit();

    }

    // 获取历史关键字
    private List<String> getKey() {
        String save_history = sp.getString("history", "");
        String[] hisArrays = save_history.split(",");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < hisArrays.length; i++) {
            list.add(hisArrays[i]);
        }
        //遍历, 去重(去老元素，留新元素)
        for(String s : list){//循环list
            if(!listHistory.contains(s)){
                listHistory.add(s);
            }
        }
        return listHistory;
    }

    private void getSearchKey(){
        et_search_key.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                keyWorld = et_search_key.getText().toString().trim();
                saveKey(keyWorld);
                if(keyWorld.equals("")){
                    list_search_key.setVisibility(View.GONE);
                }else {
                    list_search_key.setVisibility(View.VISIBLE);
                    searchKeyAdapter = new SearchKeyAdapter(MainActivity.this);
                    list_search_key.setAdapter(searchKeyAdapter);
                }
            }
        });
    }

    @OnClick(R.id.clear_key)
    void clearKey(){
        sp.edit().clear().commit();
        ll_recent_city.setVisibility(View.GONE);
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            // 当按了搜索之后关闭软键盘
            ((InputMethodManager) et_search_key.getContext().getSystemService(
                    Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(
                    MainActivity.this.getCurrentFocus().getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
            //
            return true;
        }
        return false;
    }
}
