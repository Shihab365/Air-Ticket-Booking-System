package com.flydemo.bel.flydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeRecyAdapter_1 extends RecyclerView.Adapter<HomeRecyAdapter_1.MyViewHolder> {

    Context context;
    int[] destImg_1;
    String[] destName_1;

    public HomeRecyAdapter_1(Context context, int[] destImg_1, String[] destName_1) {
        this.context = context;
        this.destImg_1 = destImg_1;
        this.destName_1 = destName_1;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.home_recy_sample,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.destImageView.setImageResource(destImg_1[position]);
        holder.destTextView.setText(destName_1[position]);
    }

    @Override
    public int getItemCount() {
        return destName_1.length-1;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView destImageView;
        TextView destTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            destImageView=itemView.findViewById(R.id.homeRecyImgID);
            destTextView=itemView.findViewById(R.id.homeRecyTextID);
        }
    }

}
