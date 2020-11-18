package com.example.emailpasswordintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String emails[]={"aa@gmail.com","bb@gmail.com","cc@gmail.com","dd@gmail.com",
            "ee@gmail.com","ff@gmail.com","gg@gmail.com","hh@gmail.com",
            "ii@gmail.com","jj@gmail.com","kk@gmail.com","ll@gmail.com"};
    String Passwords[]={"aa","bb","cc","dd","ee","ff","ii","jj","kk","ll"};
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1  = (TextView) findViewById (R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        tv4 = (TextView) findViewById(R.id.text4);

        Intent intent = getIntent();
        String e = intent.getStringExtra("email");
        String p = intent.getStringExtra("pass");
        for (int i = 0; i < emails.length; i++)
            if ((e.matches(emails[i]))&& (p.matches(Passwords[i]))) {
                tv1.setText("You are logged in! " );
                tv2.setText("Your EmailAddress is: "+ e);
                tv3.setText("Your Password is: "+ p);
            }
            else {
                tv4.setText("Invalid email address or password " );

            }
    }
}

