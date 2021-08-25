package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Login_activity extends AppCompatActivity {

    TextView email_obj,pass_obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email_obj=findViewById(R.id.put_name);
        pass_obj=findViewById(R.id.put_pass);

        Intent intent=getIntent();

        String Email_get=intent.getStringExtra(MainActivity.Name_Key);
        String Pass_get=intent.getStringExtra(MainActivity.Pass_Key);

        email_obj.setText(Email_get);
        pass_obj.setText(Pass_get);



    }
}