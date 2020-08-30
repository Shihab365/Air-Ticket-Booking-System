package com.flydemo.bel.flydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeRecyAdapter extends RecyclerView.Adapter<HomeRecyAdapter.MyViewHolder> {

    Context context;
    int[] destImg;
    String[] destName;

    public HomeRecyAdapter(Context context, int[] destImg, String[] destName) {
        this.context = context;
        this.destImg = destImg;
        this.destName = destName;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.home_recy_sample,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.destImageView.setImageResource(destImg[position]);
        holder.destTextView.setText(destName[position]);
    }

    @Override
    public int getItemCount() {
        return destName.length-1;
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
