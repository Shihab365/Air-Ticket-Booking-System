package com.flydemo.bel.flydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AfterSeatActivity extends AppCompatActivity {

    EditText editText;
    Button confSel;
    TextView as_seattext,as_fromtxt,as_totxt,as_datetxt,as_classname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_seat);

        confSel=findViewById(R.id.confirmsel_id);
        as_seattext=findViewById(R.id.as_seatnum_id);
        as_fromtxt=findViewById(R.id.as_fromtext_id);
        as_totxt=findViewById(R.id.as_totext_id);
        as_datetxt=findViewById(R.id.as_datetext_id);
        as_classname=findViewById(R.id.as_classname_id);
        editText=findViewById(R.id.edittext_id);

        final String str1=getIntent().getStringExtra("data1");
        final String str2=getIntent().getStringExtra("data2");
        final String str3=getIntent().getStringExtra("data3");
        final String str4=getIntent().getStringExtra("data4");
        final String str5=getIntent().getStringExtra("data5");
        final String str6=getIntent().getStringExtra("data6");
        final String str7=getIntent().getStringExtra("data7");
        final String str8=getIntent().getStringExtra("data8");

        as_seattext.setText(str1);
        as_fromtxt.setText(str2);
        as_totxt.setText(str3);
        as_datetxt.setText(str4);
        as_classname.setText(str5);

        confSel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pName=editText.getText().toString();

                if(pName.matches("")){
                    Toast.makeText(AfterSeatActivity.this, "Please enter name", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(AfterSeatActivity.this,PaymentActivity.class);
                    intent.putExtra("data1",str6);
                    intent.putExtra("data2",str5);
                    intent.putExtra("data7",str7);
                    intent.putExtra("data8",str4);
                    intent.putExtra("data9",str8);
                    intent.putExtra("data10",str2);
                    intent.putExtra("data11",str3);
                    intent.putExtra("data12",pName);
                    intent.putExtra("data13",str1);
                    startActivity(intent);
                }
            }
        });
    }
}
