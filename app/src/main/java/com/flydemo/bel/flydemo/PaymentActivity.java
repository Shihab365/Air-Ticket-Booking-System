package com.flydemo.bel.flydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    Button payButton;
    TextView fareText,pClassTxt;
    EditText numEdit,dateEdit,cvvEdit,nameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        payButton=findViewById(R.id.paynow_id);
        fareText=findViewById(R.id.totalfare_id);
        pClassTxt=findViewById(R.id.p_classname_id);

        numEdit=findViewById(R.id.cardNumEditId);
        dateEdit=findViewById(R.id.cardDateEditId);
        cvvEdit=findViewById(R.id.cardCvvEditId);
        nameEdit=findViewById(R.id.cardNameEditId);

        String str1=getIntent().getStringExtra("data1");
        String str2=getIntent().getStringExtra("data2");
        final String str3=getIntent().getStringExtra("data7");
        final String str4=getIntent().getStringExtra("data8");
        final String str5=getIntent().getStringExtra("data9");
        final String str6=getIntent().getStringExtra("data10");
        final String str7=getIntent().getStringExtra("data11");
        final String str8=getIntent().getStringExtra("data12");
        final String str9=getIntent().getStringExtra("data13");
        fareText.setText(str1);
        pClassTxt.setText(str2);

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cNum=numEdit.getText().toString();
                String cDate=dateEdit.getText().toString();
                String cCvv=cvvEdit.getText().toString();
                String cName=nameEdit.getText().toString();

                if(cNum.matches("") || cDate.matches("") || cCvv.matches("") || cName.matches("")){
                    Toast.makeText(PaymentActivity.this, "Fill all the box", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(PaymentActivity.this,BoardingPassActivity.class);
                    intent.putExtra("data1",str3);
                    intent.putExtra("data2",str4);
                    intent.putExtra("data3",str5);
                    intent.putExtra("data4",str6);
                    intent.putExtra("data5",str7);
                    intent.putExtra("data6",str8);
                    intent.putExtra("data7",str9);
                    startActivity(intent);
                }
            }
        });
    }
}
