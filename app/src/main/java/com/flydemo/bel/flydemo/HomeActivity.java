package com.flydemo.bel.flydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class HomeActivity extends AppCompatActivity {

    ViewFlipper homeFlipper;
    RecyclerView popRecy,offRecy;
    int[] destImg={R.drawable.czech_republic_prague,
            R.drawable.eiffel_tower,R.drawable.grand_canyon,R.drawable.great_wall_of_china,
            R.drawable.machu_picchu,R.drawable.new_york_city,R.drawable.pyramids,
            R.drawable.statue_of_liberty,R.drawable.taj_mahal};

    int[] destImg_1={R.drawable.adventure,R.drawable.cruise,
            R.drawable.eco,R.drawable.hill,
            R.drawable.holiday,R.drawable.honeymoon,R.drawable.pilgrimage,
            R.drawable.wellness,R.drawable.wildlife};
    String[] destName,destName_1;
    CardView homeBooking,homeSchedule,homeProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeFlipper=findViewById(R.id.home_viewflipperID);
        popRecy=findViewById(R.id.recy_populardestID);
        offRecy=findViewById(R.id.recy_offerID);
        homeBooking=findViewById(R.id.home_bookingID);
        homeSchedule=findViewById(R.id.home_scheduleID);
        homeProfile=findViewById(R.id.home_profileID);

        destName=getResources().getStringArray(R.array.popular_destname);
        destName_1=getResources().getStringArray(R.array.offfer_airplane);

        //viewflipper
        int images[]={R.drawable.airplane_1,R.drawable.airplane_3,R.drawable.airplane_5,R.drawable.airplane_8,R.drawable.airplane_2,R.drawable.airplane_4,R.drawable.airplane_6,R.drawable.airplane_7,R.drawable.airplane_9};
        for(int img:images)
        {
            slideFlip(img);
        }

        //cardview Click

        homeBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,FlightSearchActivity.class));
            }
        });
        homeSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Schedule", Toast.LENGTH_SHORT).show();
            }
        });
        homeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Profile", Toast.LENGTH_SHORT).show();
            }
        });

        //for popular recyclerview
        HomeRecyAdapter customAdpater=new HomeRecyAdapter(this,destImg,destName);
        popRecy.setAdapter(customAdpater);
        popRecy.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));

        //for offer recyclerview
        HomeRecyAdapter_1 customAdpater1=new HomeRecyAdapter_1(this,destImg_1,destName_1);
        offRecy.setAdapter(customAdpater1);
        offRecy.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
    }
    //viewflipper
    public void slideFlip(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        homeFlipper.addView(imageView);
        homeFlipper.setFlipInterval(2000);
        homeFlipper.setAutoStart(true);
        homeFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        homeFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
