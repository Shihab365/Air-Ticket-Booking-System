package com.flydemo.bel.flydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SeatplanRecy_1Adapter extends RecyclerView.Adapter<SeatplanRecy_1Adapter.MyViewHolder> {

    private static ClickListener clickListener;
    Context context;
    int[] seat_1;

    public SeatplanRecy_1Adapter(Context context, int[] seat_1) {
        this.context = context;
        this.seat_1 = seat_1;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.seat_plane_sample,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.setImageResource(seat_1[position]);
    }

    @Override
    public int getItemCount() {
        return seat_1.length;
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
    public void setOnItemClickListener(ClickListener clickListener)
    {
        SeatplanRecy_1Adapter.clickListener=clickListener;
    }

}
