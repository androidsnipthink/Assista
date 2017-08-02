package com.example.abhishek.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SignupCon extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_con);
        Button create_id =(Button)findViewById(R.id.create_id);
        create_id.setOnClickListener(this);
        create_id.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
