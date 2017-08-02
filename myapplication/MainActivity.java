package com.example.abhishek.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener{
ImageButton ClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//.        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ImageButton logo2 =(ImageButton)findViewById(R.id.logo2);
        logo2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent =new Intent(this,Login.class);
        startActivity(intent);
    }
}
