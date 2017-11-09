package com.self.template.history;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.self.template.R;

import java.util.List;

/**
 * Created by 石乾 on 2017/11/9.
 */

public class RecordAdapter extends ArrayAdapter {
    private int resourceId;

    public RecordAdapter(@NonNull Context context, @LayoutRes int textViewResourceId, List<record> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        record record = (com.self.template.history.record) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);

        TextView time=(TextView)view.findViewById(R.id.time);
        TextView location=(TextView)view.findViewById(R.id.location);
        TextView state=(TextView)view.findViewById(R.id.state);

        time.setText(record.getTime());
        location.setText(record.getLocation());
        state.setText(record.getState());

        return view;
    }
}

