package com.example.abhishek.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.abhishek.myapplication.R.id.next;

public class Signup extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        final Intent i = getIntent();
        /*----------------textView---------------------------------------------*/
        TextView first_name =(TextView)findViewById(R.id.first_name);
        TextView last_name =(TextView)findViewById(R.id.last_name);
        TextView  Emailid1 =(TextView)findViewById(R.id.Emailid1);
        TextView mobile_no=(TextView)findViewById(R.id.mobile_no);
        TextView password1=(TextView)findViewById(R.id.password1);
        /*-------------------------EditText-----------------------------------*/

        EditText first_name_input=(EditText)findViewById(R.id.firstname_input);
        EditText last_name_input=(EditText)findViewById(R.id.last_name_input);
        EditText email_input =(EditText)findViewById(R.id.email_input);
        EditText mobile_input=(EditText)findViewById(R.id.mobile_no_input);
        EditText passwords=(EditText)findViewById(R.id.password_input);

        /*-------------------------------ImageButton---------------------------------------------------*/
        ImageButton back =(ImageButton)findViewById(R.id.back);
        ImageButton next =(ImageButton)findViewById(R.id.next);

       back.setOnClickListener(this);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),Login.class);
                startActivity(i);

            }
        });

        next.setOnClickListener(this);
        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),SignupCon.class);
                startActivity(i);

            }
        });
    }



    @Override
    public void onClick(View v) {

    }
}
