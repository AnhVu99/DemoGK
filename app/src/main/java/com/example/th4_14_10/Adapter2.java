package com.example.th4_14_10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Adapter2 extends BaseAdapter {
    Context ctx;
    ArrayList<itemSach> arr;
    int layout;

    public Adapter2(Context ctx, ArrayList<itemSach> arr, int layout) {
        this.ctx = ctx;
        this.arr = arr;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layout,viewGroup,false);

        ImageView img = (ImageView) view.findViewById(R.id.imageSach);
        TextView name = (TextView) view.findViewById((R.id.textName));

        img.setImageResource(arr.get(i).getImg());
        name.setText(arr.get(i).getName());

        return view;
    }
}
