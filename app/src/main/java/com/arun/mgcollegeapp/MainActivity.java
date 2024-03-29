package com.arun.mgcollegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1,b2;
    String getUname, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.userid);
        e2 = (EditText) findViewById(R.id.password);
        b1 = (Button) findViewById(R.id.btnid);
        b2=(Button)findViewById(R.id.regbtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"reached",Toast.LENGTH_LONG).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getUname = e1.getText().toString();
                getPassword = e2.getText().toString();

                if(getPassword.equals("12345")&&getUname.equals("arun"))
                {
                    Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
            }
                else
                {
                    Toast.makeText(getApplicationContext(),"retry",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
