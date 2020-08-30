package com.flydemo.bel.flydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FP_recyAdapter extends RecyclerView.Adapter<FP_recyAdapter.MyViewHolder> {

    private static ClickListener clickListener;
    Context context;
    String[] arrTime,arrAirport,flyTime,deptTime,deptAirport,flyCost,optName,optClass;

    public FP_recyAdapter(Context context, String[] arrTime, String[] arrAirport, String[] flyTime, String[] deptTime, String[] deptAirport, String[] flyCost, String[] optName, String[] optClass) {
        this.context = context;
        this.arrTime = arrTime;
        this.arrAirport = arrAirport;
        this.flyTime = flyTime;
        this.deptTime = deptTime;
        this.deptAirport = deptAirport;
        this.flyCost = flyCost;
        this.optName = optName;
        this.optClass = optClass;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.search_result_ui,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textArrTime.setText(arrTime[position]);
        holder.textArrAirport.setText(arrAirport[position]);
        holder.textFlyTime.setText(flyTime[position]);
        holder.textDeptTime.setText(deptTime[position]);
        holder.textDeptAirport.setText(deptAirport[position]);
        holder.textFlyCost.setText(flyCost[position]);
        holder.textOptName.setText(optName[position]);
        holder.textOptClass.setText(optClass[position]);
    }

    @Override
    public int getItemCount() {
        return arrTime.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{


        TextView textArrTime,textArrAirport,textFlyTime,textDeptTime,textDeptAirport,
                textFlyCost,textOptName,textOptClass;

        public MyViewHolder(View itemView) {
            super(itemView);

            textArrTime=itemView.findViewById(R.id.arrTimeID);
            textArrAirport=itemView.findViewById(R.id.arrAirportID);
            textFlyTime=itemView.findViewById(R.id.flyTimeID);
            textDeptTime=itemView.findViewById(R.id.deptTimeID);
            textDeptAirport=itemView.findViewById(R.id.deptAirportID);
            textFlyCost=itemView.findViewById(R.id.flyCostID);
            textOptName=itemView.findViewById(R.id.optNameID);
            textOptClass=itemView.findViewById(R.id.optClassID);

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
        FP_recyAdapter.clickListener=clickListener;
    }

}
