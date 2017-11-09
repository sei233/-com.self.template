package com.self.template.food;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.self.template.R;

import java.util.List;

/**
 * Created by 石乾 on 2017/11/1.
 */

public class FoodAdapter extends ArrayAdapter {

    private int resourceId;

    public FoodAdapter(@NonNull Context context, @LayoutRes int textViewResourceId, List<food> objects) {
        super(context, textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        food food= (com.self.template.food.food) getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        ImageView foodImage=(ImageView)view.findViewById(R.id.food_image);
        TextView foodname=(TextView)view.findViewById(R.id.food_name);
        ImageView foodcomment=(ImageView)view.findViewById(R.id.food_comment);
        TextView foodprice=(TextView)view.findViewById(R.id.food_price);

        foodImage.setImageResource(food.getImageId());
        foodname.setText(food.getName());
        foodcomment.setImageResource(food.getComment());
        foodprice.setText(food.getPrice());

        return view;
    }
}
