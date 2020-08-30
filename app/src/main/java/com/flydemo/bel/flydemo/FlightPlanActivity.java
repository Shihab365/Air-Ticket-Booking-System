package com.flydemo.bel.flydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class FlightPlanActivity extends AppCompatActivity {

    RecyclerView fpRecy;
    TextView fptext1,fptext2,fptext3;
    String[] arrTime,arrAirport,flyTime,deptTime,deptAirport,flyCost,optName,optClass;

    FP_recyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_plan);

        fpRecy=findViewById(R.id.fp_recyviewID);
        fptext1=findViewById(R.id.fp_fromtextId);
        fptext2=findViewById(R.id.fp_totextId);
        fptext3=findViewById(R.id.fp_date_id);


        final String rFrom=getIntent().getStringExtra("data1");
        final String rTo=getIntent().getStringExtra("data2");
        final String rDate=getIntent().getStringExtra("data3");
        fptext1.setText(rFrom);
        fptext2.setText(rTo);
        fptext3.setText(rDate);

        arrTime=getResources().getStringArray(R.array.arrival_time);
        arrAirport=getResources().getStringArray(R.array.arrival_airport);
        flyTime=getResources().getStringArray(R.array.flying_time);
        deptTime=getResources().getStringArray(R.array.depart_time);
        deptAirport=getResources().getStringArray(R.array.depart_airport);
        flyCost=getResources().getStringArray(R.array.plane_fare);
        optName=getResources().getStringArray(R.array.operator_name);
        optClass=getResources().getStringArray(R.array.operator_class);

        adapter=new FP_recyAdapter(this,arrTime,arrAirport,flyTime,deptTime,deptAirport,flyCost,optName,optClass);
        fpRecy.setAdapter(adapter);
        fpRecy.setLayoutManager(new LinearLayoutManager(this));

        adapter.setOnItemClickListener(new FP_recyAdapter.ClickListener() {
            @Override
            public void onItemClickListener(int pos, View v) {

                //get airline class from adapter
                TextView classCtg=(TextView)v.findViewById(R.id.optClassID);
                String clsName=classCtg.getText().toString();
                TextView costText=(TextView)v.findViewById(R.id.flyCostID);
                String flyCost=costText.getText().toString();
                TextView optNameTxt=(TextView)v.findViewById(R.id.optNameID);
                String optName=optNameTxt.getText().toString();
                TextView timeTxt=(TextView)v.findViewById(R.id.arrTimeID);
                String deptTime=timeTxt.getText().toString();

                Intent intent=new Intent(FlightPlanActivity.this,SeatPlanActivity.class);
                intent.putExtra("data1",rFrom);
                intent.putExtra("data2",rTo);
                intent.putExtra("data3",rDate);
                intent.putExtra("data4",clsName);
                intent.putExtra("data5",flyCost);
                intent.putExtra("data6",optName);
                intent.putExtra("data7",deptTime);
                startActivity(intent);
            }

            @Override
            public void onItemLongClickListener(int pos, View v) {
                //get airline class from adapter
                TextView classCtg=(TextView)v.findViewById(R.id.optClassID);
                String clsName=classCtg.getText().toString();
                TextView costText=(TextView)v.findViewById(R.id.flyCostID);
                String flyCost=costText.getText().toString();

                Intent intent=new Intent(FlightPlanActivity.this,SeatPlanActivity.class);
                intent.putExtra("data1",rFrom);
                intent.putExtra("data2",rTo);
                intent.putExtra("data3",rDate);
                intent.putExtra("data4",clsName);
                intent.putExtra("data5",flyCost);
                startActivity(intent);
            }
        });
    }
}
