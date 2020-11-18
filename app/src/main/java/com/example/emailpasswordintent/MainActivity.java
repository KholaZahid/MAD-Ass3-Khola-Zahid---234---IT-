package com.example.emailpasswordintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    EditText p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = (EditText) findViewById (R.id.email);
        p = (EditText)findViewById (R.id.pass);
    }

    public void logIn(View v)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("email",e.getText().toString());
        intent.putExtra("pass", p.getText().toString());
        startActivity(intent);
    }
}
