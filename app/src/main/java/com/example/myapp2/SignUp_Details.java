package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignUp_Details extends AppCompatActivity {
   TextView n_obj,e_obj,p_obj,c_obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_details);

        n_obj=findViewById(R.id.newname);
        e_obj=findViewById(R.id.newemail);
        c_obj=findViewById(R.id.newcontact);
        p_obj=findViewById(R.id.newpass);

        Intent intent=getIntent();

        String get_name=intent.getStringExtra(SignUp_activity.Name_Key);
        String get_email=intent.getStringExtra(SignUp_activity.Email_Key);
        String get_contact=intent.getStringExtra(SignUp_activity.Contact_Key);
        String get_pass=intent.getStringExtra(SignUp_activity.Pass_Key);

        n_obj.setText(get_name);
        e_obj.setText(get_email);
        c_obj.setText(get_contact);
        p_obj.setText(get_pass);

    }
}