package com.tolet.sajib.materialcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView school,library,hospital,restaurent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        school=findViewById(R.id.schoolcardviewid);
        library=findViewById(R.id.librarycardviewid);
        hospital=findViewById(R.id.hospitalcardviewid);
        restaurent=findViewById(R.id.restaurentcardviewid);
        school.setOnClickListener(this);
        library.setOnClickListener(this);
        hospital.setOnClickListener(this);
        restaurent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.schoolcardviewid){
            Intent intent=new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(intent);
        }
    }
}
