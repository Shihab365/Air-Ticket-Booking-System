package com.flydemo.bel.flydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeatPlanActivity extends AppCompatActivity {

    Button confSeat;
    RecyclerView seatRecy_1,seatRecy_2;

    TextView seatSelect;

    SeatplanRecy_1Adapter sp_recy_1;
    SeatplanRecy_2Adapter sp_recy_2;

    int[] seat_1={R.drawable.seat_available,R.drawable.seat_booked,R.drawable.seat_available,
            R.drawable.seat_booked,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_booked,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_booked,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_booked,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_booked,R.drawable.seat_available,R.drawable.seat_available};
    int[] seat_2={R.drawable.seat_available,R.drawable.seat_booked,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_booked,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_booked,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_booked,R.drawable.seat_available,R.drawable.seat_available,
            R.drawable.seat_available,R.drawable.seat_booked,R.drawable.seat_available,
            R.drawable.seat_booked,R.drawable.seat_available,R.drawable.seat_available};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_plan);

        seatRecy_1=findViewById(R.id.seatplaneRecy_1_id);
        seatRecy_2=findViewById(R.id.seatplaneRecy_2_id);
        confSeat=findViewById(R.id.seatconfirm_id);
        seatSelect=findViewById(R.id.selectseattext_id);

        sp_recy_1=new SeatplanRecy_1Adapter(this,seat_1);
        seatRecy_1.setAdapter(sp_recy_1);
        seatRecy_1.setLayoutManager(new GridLayoutManager(SeatPlanActivity.this,3));

        sp_recy_2=new SeatplanRecy_2Adapter(this,seat_2);
        seatRecy_2.setAdapter(sp_recy_2);
        seatRecy_2.setLayoutManager(new GridLayoutManager(SeatPlanActivity.this,3));

        sp_recy_1.setOnItemClickListener(new SeatplanRecy_1Adapter.ClickListener() {
            @Override
            public void onItemClickListener(int pos, View v) {
                if(pos==0){
                    seatSelect.setText("A1");
                }
                if(pos==2){
                    seatSelect.setText("A3");
                }
                if(pos==4){
                    seatSelect.setText("B2");
                }
                if(pos==5){
                    seatSelect.setText("B3");
                }
                if(pos==6){
                    seatSelect.setText("C1");
                }
                if(pos==7){
                    seatSelect.setText("C2");
                }
                if(pos==9){
                    seatSelect.setText("D1");
                }
                if(pos==10){
                    seatSelect.setText("D2");
                }
                if(pos==11){
                    seatSelect.setText("D3");
                }
                if(pos==13){
                    seatSelect.setText("E2");
                }
                if(pos==14){
                    seatSelect.setText("E3");
                }
                if(pos==15){
                    seatSelect.setText("F1");
                }
                if(pos==16){
                    seatSelect.setText("F2");
                }
                if(pos==17){
                    seatSelect.setText("F3");
                }
                if(pos==18){
                    seatSelect.setText("G1");
                }
                if(pos==20){
                    seatSelect.setText("G3");
                }
                if(pos==21){
                    seatSelect.setText("H1");
                }
                if(pos==22){
                    seatSelect.setText("H2");
                }
                if(pos==23){
                    seatSelect.setText("H3");
                }
                if(pos==25){
                    seatSelect.setText("I2");
                }
                if(pos==26){
                    seatSelect.setText("I3");
                }
            }

            @Override
            public void onItemLongClickListener(int pos, View v) {
                if(pos==0){
                    seatSelect.setText("A1");
                }
                if(pos==2){
                    seatSelect.setText("A3");
                }
                if(pos==4){
                    seatSelect.setText("B2");
                }
                if(pos==5){
                    seatSelect.setText("B3");
                }
                if(pos==6){
                    seatSelect.setText("C1");
                }
                if(pos==7){
                    seatSelect.setText("C2");
                }
                if(pos==9){
                    seatSelect.setText("D1");
                }
                if(pos==10){
                    seatSelect.setText("D2");
                }
                if(pos==11){
                    seatSelect.setText("D3");
                }
                if(pos==13){
                    seatSelect.setText("E2");
                }
                if(pos==14){
                    seatSelect.setText("E3");
                }
                if(pos==15){
                    seatSelect.setText("F1");
                }
                if(pos==16){
                    seatSelect.setText("F2");
                }
                if(pos==17){
                    seatSelect.setText("F3");
                }
                if(pos==18){
                    seatSelect.setText("G1");
                }
                if(pos==20){
                    seatSelect.setText("G3");
                }
                if(pos==21){
                    seatSelect.setText("H1");
                }
                if(pos==22){
                    seatSelect.setText("H2");
                }
                if(pos==23){
                    seatSelect.setText("H3");
                }
                if(pos==25){
                    seatSelect.setText("I2");
                }
                if(pos==26){
                    seatSelect.setText("I3");
                }
            }
        });
        sp_recy_2.setOnItemClickListener(new SeatplanRecy_2Adapter.ClickListener() {
            @Override
            public void onItemClickListener(int pos, View v) {
                if(pos==0){
                    seatSelect.setText("A4");
                }
                if(pos==2){
                    seatSelect.setText("A6");
                }
                if(pos==3){
                    seatSelect.setText("B4");
                }
                if(pos==4){
                    seatSelect.setText("B5");
                }
                if(pos==5){
                    seatSelect.setText("B6");
                }
                if(pos==7){
                    seatSelect.setText("C5");
                }
                if(pos==8){
                    seatSelect.setText("C6");
                }
                if(pos==9){
                    seatSelect.setText("D4");
                }
                if(pos==10){
                    seatSelect.setText("D5");
                }
                if(pos==11){
                    seatSelect.setText("D6");
                }
                if(pos==12){
                    seatSelect.setText("E4");
                }
                if(pos==14){
                    seatSelect.setText("E6");
                }
                if(pos==15){
                    seatSelect.setText("F4");
                }
                if(pos==16){
                    seatSelect.setText("F5");
                }
                if(pos==17){
                    seatSelect.setText("F6");
                }
                if(pos==19){
                    seatSelect.setText("G5");
                }
                if(pos==20){
                    seatSelect.setText("G6");
                }
                if(pos==21){
                    seatSelect.setText("H4");
                }
                if(pos==23){
                    seatSelect.setText("H6");
                }

                if(pos==25){
                    seatSelect.setText("I5");
                }
                if(pos==26){
                    seatSelect.setText("I6");
                }
            }

            @Override
            public void onItemLongClickListener(int pos, View v) {
                if(pos==0){
                    seatSelect.setText("A4");
                }
                if(pos==2){
                    seatSelect.setText("A6");
                }
                if(pos==3){
                    seatSelect.setText("B4");
                }
                if(pos==4){
                    seatSelect.setText("B5");
                }
                if(pos==5){
                    seatSelect.setText("B6");
                }
                if(pos==7){
                    seatSelect.setText("C5");
                }
                if(pos==8){
                    seatSelect.setText("C6");
                }
                if(pos==9){
                    seatSelect.setText("D4");
                }
                if(pos==10){
                    seatSelect.setText("D5");
                }
                if(pos==11){
                    seatSelect.setText("D6");
                }
                if(pos==12){
                    seatSelect.setText("E4");
                }
                if(pos==14){
                    seatSelect.setText("E6");
                }
                if(pos==15){
                    seatSelect.setText("F4");
                }
                if(pos==16){
                    seatSelect.setText("F5");
                }
                if(pos==17){
                    seatSelect.setText("F6");
                }
                if(pos==19){
                    seatSelect.setText("G5");
                }
                if(pos==20){
                    seatSelect.setText("G6");
                }
                if(pos==21){
                    seatSelect.setText("H4");
                }
                if(pos==23){
                    seatSelect.setText("H6");
                }

                if(pos==25){
                    seatSelect.setText("I5");
                }
                if(pos==26){
                    seatSelect.setText("I6");
                }
            }
        });

        final String str1=getIntent().getStringExtra("data1");
        final String str2=getIntent().getStringExtra("data2");
        final String str3=getIntent().getStringExtra("data3");
        final String str4=getIntent().getStringExtra("data4");
        final String str5=getIntent().getStringExtra("data5");
        final String str6=getIntent().getStringExtra("data6");
        final String str7=getIntent().getStringExtra("data7");

        confSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cSeat=seatSelect.getText().toString();
                Intent intent=new Intent(SeatPlanActivity.this,AfterSeatActivity.class);
                intent.putExtra("data1",cSeat);
                intent.putExtra("data2",str1);
                intent.putExtra("data3",str2);
                intent.putExtra("data4",str3);
                intent.putExtra("data5",str4);
                intent.putExtra("data6",str5);
                intent.putExtra("data7",str6);
                intent.putExtra("data8",str7);
                startActivity(intent);
            }
        });
    }
}
