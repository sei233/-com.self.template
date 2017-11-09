package com.self.template.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.self.template.R;
import com.self.template.history.RecordAdapter;
import com.self.template.history.record;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : ZouJianFeng-Marco
 *     e-mail :
 *     time   : 2017/03/28
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class Fragment_mine extends BaseFragment{

    private List<record> recordsList = new ArrayList<>();

    public static Fragment_mine newInstance() {
        Fragment_mine f = new Fragment_mine();
        return f;
    }

    @Override
    protected void initView() {}

    @Override
    public void onResume() {
        super.onResume();

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mine, container, false);
        initRecords();
        RecordAdapter adapter=new RecordAdapter(getContext(),R.layout.listview_history,recordsList);         //getContext()
        ListView listView=(ListView)rootView.findViewById(R.id.listview_history);
        listView.setAdapter(adapter);
        return rootView;
    }

    private void initRecords() {
        for (int i = 0; i < 2; i++) {
            record yesterday = new record("预约时间 2017-04-26 11:30至12:00",
                    "预约位置 【桂苑食堂一楼 08】",
                    "预约状态 未就坐");
            recordsList.add(yesterday);
            record today = new record("预约时间 2017-04-26 11:30至12:00",
                    "预约位置 【杏园食堂二楼 23】",
                    "预约状态 已就坐");
            recordsList.add(today);
        }
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_mine;
    }
}