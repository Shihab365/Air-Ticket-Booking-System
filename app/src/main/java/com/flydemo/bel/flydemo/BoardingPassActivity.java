package com.flydemo.bel.flydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BoardingPassActivity extends AppCompatActivity {

    TextView opnameTxt,dateTxt,dpTime,fromTxt,toTxt,bpName,bpSeat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_pass);

        opnameTxt=findViewById(R.id.bp_optname_id);
        dateTxt=findViewById(R.id.bp_date_id);
        dpTime=findViewById(R.id.bp_dptime_id);
        fromTxt=findViewById(R.id.bp_fromID);
        toTxt=findViewById(R.id.bp_toID);
        bpName=findViewById(R.id.bp_nameID);
        bpSeat=findViewById(R.id.bp_seatID);

        String str1=getIntent().getStringExtra("data1");
        String str2=getIntent().getStringExtra("data2");
        String str3=getIntent().getStringExtra("data3");
        String str4=getIntent().getStringExtra("data4");
        String str5=getIntent().getStringExtra("data5");
        String str6=getIntent().getStringExtra("data6");
        String str7=getIntent().getStringExtra("data7");
        opnameTxt.setText(str1);
        dateTxt.setText(str2);
        dpTime.setText(str3);
        fromTxt.setText(str4);
        toTxt.setText(str5);
        bpName.setText(str6);
        bpSeat.setText(str7);
    }
}
