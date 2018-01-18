package com.inception.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

    }

    public void  doLogin(View v)
    {

        EditText username_et =  findViewById(R.id.et1);

        EditText password_et =  findViewById(R.id.et2);

        

        if(username_et.getText().toString().equals("admin") && password_et.getText().toString().equals("123456"))
        {
            Intent i = new Intent(FirstActivity.this , SecondActivity.class);

            startActivity(i);
        }

        else {

            Toast.makeText(FirstActivity.this ,"invalid credentials",Toast.LENGTH_LONG).show();
        }


    }


}


