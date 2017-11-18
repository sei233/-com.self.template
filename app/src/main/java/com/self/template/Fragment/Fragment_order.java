package com.self.template.Fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.self.template.R;
import com.self.template.food.FoodAdapter;
import com.self.template.food.food;

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
public class Fragment_order extends BaseFragment{

    private List<food> foodList = new ArrayList<>();

    public static Fragment_order newInstance() {
        Fragment_order f = new Fragment_order();
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
        View rootView = inflater.inflate(R.layout.fragment_order, container, false);
        initFoods();
        FoodAdapter adapter=new FoodAdapter(getContext(),R.layout.listview,foodList);         //getContext()
        ListView listView=(ListView)rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);
//        Toolbar toolbar = (Toolbar)rootView.findViewById(R.id.toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_back);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                finish();
//            }
//        });
        return rootView;
    }

    private void initFoods() {
        for (int i = 0; i < 2; i++) {
            food hetang = new food("荷塘小炒", R.drawable.hetang, R.drawable.comment, "2元");
            foodList.add(hetang);
            food qingcai = new food("青菜", R.drawable.qingcai, R.drawable.comment, "1元");
            foodList.add(qingcai);
        }
    }
    @Override
    protected int layoutId() {
        return R.layout.fragment_order;
    }
}
