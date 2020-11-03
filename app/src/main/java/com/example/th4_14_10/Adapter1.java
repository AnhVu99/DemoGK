package com.example.th4_14_10;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class Adapter1 extends RecyclerView.Adapter<Adapter1.MyViewHolder> {
    //private List<item1> moviesList;
    Context ctx;
    int layout;
    ArrayList<item1> arr;

    public Adapter1(Context ctx, int layout, ArrayList<item1> arr) {
        this.ctx = ctx;
        this.layout = layout;
        this.arr = arr;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView gia;
        ImageView img;

        MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.txtName);
            gia = view.findViewById(R.id.txtGia);
            img = view.findViewById(R.id.imageView);
        }
    }
    public Adapter1(ArrayList<item1> moviesList) {
        this.arr = moviesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(ctx)
                .inflate(layout, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        item1 movie = arr.get(position);

        holder.gia.setText(movie.getGia().toString());
        holder.name.setText(movie.getName());
        holder.img.setImageResource(movie.getAnh());
    }
    @Override
    public int getItemCount() {
        return arr.size();
    }
}