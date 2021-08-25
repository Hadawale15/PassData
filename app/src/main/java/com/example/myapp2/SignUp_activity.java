package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp_activity extends AppCompatActivity {
     EditText N_obj,E_obj,C_obj,P_obj;
     Button B_obj;

    public static final String Name_Key ="name_key";
    public static final String Email_Key ="email_key";
    public static final String Contact_Key ="contact_key";
    public static final String Pass_Key= "pass_key";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        N_obj=findViewById(R.id.new_name);
        E_obj=findViewById(R.id.new_email);
       C_obj=findViewById(R.id.new_contact);
        P_obj=findViewById(R.id.new_password);

        B_obj=findViewById(R.id.new_signup);


        B_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n_name=N_obj.getText().toString();
                String n_email=E_obj.getText().toString();
                String n_contact=C_obj.getText().toString();
                String n_password=P_obj.getText().toString();



                Intent intent=new Intent(SignUp_activity.this,SignUp_Details.class);
                intent.putExtra(Name_Key,n_name);
                intent.putExtra(Email_Key,n_email);
                intent.putExtra(Contact_Key,n_contact);
                intent.putExtra(Pass_Key,n_password);
                startActivity(intent);
            }
        });
    }
}