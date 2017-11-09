package com.self.template.history;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by 石乾 on 2017/11/9.
 */

public class RecordAdapter extends ArrayAdapter {
    public RecordAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }


}

