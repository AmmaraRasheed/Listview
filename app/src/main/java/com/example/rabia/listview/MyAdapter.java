package com.example.rabia.listview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {

    public Activity context;
    public String[] title,des;
    public Integer[] image;
    public MyAdapter(Activity context, String[] title,String[] des,Integer[] image) {
        super(context,R.layout.listview_layout,title);
        this.context=context;
        this.title=title;
        this.des=des;
        this.image=image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.listview_layout, null, true);
        TextView title1 = view.findViewById(R.id.title);
        TextView des1 = view.findViewById(R.id.description);
        ImageView image1 = view.findViewById(R.id.image_list);
        title1.setText(title[position]);
        des1.setText(des[position]);
        image1.setImageResource(image[position]);
        return view;
    }

}
