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
        return rootView;
    }



    @Override
    protected int layoutId() {
        return R.layout.fragment_mine;
    }
}