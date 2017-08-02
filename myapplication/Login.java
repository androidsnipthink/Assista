package com.example.abhishek.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //   this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Intent intent = getIntent();
        TextView logo = (TextView) findViewById(R.id.TextLogo);
        TextView email = (TextView) findViewById(R.id.Emailid1);
        TextView password = (TextView) findViewById(R.id.password1);
        TextView createid = (TextView) findViewById(R.id.create_id);

        //Edit Text
        EditText email_input = (EditText) findViewById(R.id.email_input);
        EditText password_input = (EditText) findViewById(R.id.password_input);
        Button nextButton = (Button) findViewById(R.id.login);
        nextButton.setOnClickListener(this);
        createid.setOnClickListener(this);


        nextButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        createid.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Signup.class);
                startActivity(i);
                CreateId(v);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }

    public void CreateId(View v){

    }
}
