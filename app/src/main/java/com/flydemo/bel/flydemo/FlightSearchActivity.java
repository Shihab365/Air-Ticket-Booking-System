package com.flydemo.bel.flydemo;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Calendar;

public class FlightSearchActivity extends AppCompatActivity {

    Spinner fromSpin,toSpin;
    String[] fromCountry,toCountry;
    ImageButton departButton;
    TextView departText;
    Button srcFly;

    Calendar c;
    DatePickerDialog dpd;
    int day,month,year;
    String startPt,endPt,jrnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_search);

        fromSpin=findViewById(R.id.spin_from_id);
        toSpin=findViewById(R.id.spin_to_id);
        departButton=findViewById(R.id.departdateID);
        departText=findViewById(R.id.departtextID);
        srcFly=findViewById(R.id.searchFlyButtID);

        fromCountry=getResources().getStringArray(R.array.fly_from);
        toCountry=getResources().getStringArray(R.array.fly_to);

        ArrayAdapter<String> fromAdapter=new ArrayAdapter<>(this,R.layout.fs_spinner_sample,R.id.fs_spintextID,fromCountry);
        ArrayAdapter<String> toAdapter=new ArrayAdapter<>(this,R.layout.fs_spinner_sample,R.id.fs_spintextID,toCountry);

        fromSpin.setAdapter(fromAdapter);
        toSpin.setAdapter(toAdapter);

        fromSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                startPt=fromSpin.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        toSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                endPt=toSpin.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        departButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c=Calendar.getInstance();
                day=c.get(Calendar.DAY_OF_MONTH);
                month=c.get(Calendar.MONTH);
                year=c.get(Calendar.YEAR);

                dpd=new DatePickerDialog(FlightSearchActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int myear, int mmonth, int mdayOfMonth) {
                        departText.setText(mdayOfMonth + " / " + (mmonth+1) + " / " + myear);
                        jrnDate=mdayOfMonth + " / " + (mmonth+1) + " / " + myear;
                    }
                },day,month,year);
                dpd.show();

            }
        });

        srcFly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FlightSearchActivity.this,FlightPlanActivity.class);
                intent.putExtra("data1",startPt);
                intent.putExtra("data2",endPt);
                intent.putExtra("data3",jrnDate);
                startActivity(intent);
            }
        });
    }
}
