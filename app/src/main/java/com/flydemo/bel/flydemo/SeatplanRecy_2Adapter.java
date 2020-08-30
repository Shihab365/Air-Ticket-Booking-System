package com.flydemo.bel.flydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SeatplanRecy_2Adapter extends RecyclerView.Adapter<SeatplanRecy_2Adapter.MyViewHolder> {

    private static SeatplanRecy_2Adapter.ClickListener clickListener;
    Context context;
    int[] seat_2;

    public SeatplanRecy_2Adapter(Context context, int[] seat_2) {
        this.context = context;
        this.seat_2 = seat_2;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.seat_plane_sample,parent,false);
        return new SeatplanRecy_2Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.setImageResource(seat_2[position]);
    }

    @Override
    public int getItemCount() {
        return seat_2.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{

        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.seatplane_id);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClickListener(getAdapterPosition(),v);
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClickListener(getAdapterPosition(),v);
            return false;
        }
    }
    public interface ClickListener{

        void onItemClickListener(int pos,View v);
        void onItemLongClickListener(int pos,View v);
    }
    public void setOnItemClickListener(SeatplanRecy_2Adapter.ClickListener clickListener)
    {
        SeatplanRecy_2Adapter.clickListener=clickListener;
    }

}
