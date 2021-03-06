package com.self.template.Act;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioButton;

import com.self.template.Fragment.Fragment_order;
import com.self.template.Fragment.Fragment_find;
import com.self.template.Fragment.Fragment_home;
import com.self.template.Fragment.Fragment_mine;
import com.self.template.R;
import com.self.template.Util.FragmentTabHandler;
import com.self.template.View.FlowRadioGroup;

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
public class HomeAct extends FragmentActivity {

    private long mExitTime;
    public FlowRadioGroup rgs;
    public FragmentTabHandler fragmentContorler;
    private List<Fragment> fragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //去掉title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.win_home);

        //添加碎片
        fragments.add(Fragment_home.newInstance());
        fragments.add(Fragment_find.newInstance());
        fragments.add(Fragment_order.newInstance());
        fragments.add(Fragment_mine.newInstance());

        rgs = (FlowRadioGroup) findViewById(R.id.tabMain);

        fragmentContorler = new FragmentTabHandler(HomeAct.this, fragments, R.id.layout_tab_content);

        rgs.setOnCheckedChangeListener(new FlowRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(FlowRadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.btnHome:
                        fragmentContorler.showTab(0);
                        break;

                    case R.id.btnNews:
                        fragmentContorler.showTab(1);
                        break;

                    case R.id.btnDiscovery:
                        fragmentContorler.showTab(2);
                        break;

                    case R.id.btnMe:
                        fragmentContorler.showTab(3);
                        break;

                    default:
                        break;
                }
            }
        });

        ((RadioButton)findViewById(R.id.btnHome)).setChecked(true);
    }

}
