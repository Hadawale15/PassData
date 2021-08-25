package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText email_obj,pass_obj;
   Button login_obj,signup_obj;
   TextView obj;

   public static final String Name_Key ="name_key";
   public static final String Pass_Key= "pass_key";
   public static final String Email_v="shubhamhadawale15@gmail.com";
   public static final String Pass_v="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email_obj=findViewById(R.id.email);
        pass_obj=findViewById(R.id.password);
        login_obj=findViewById(R.id.login);
        signup_obj=findViewById(R.id.signup);
        obj=findViewById(R.id.sign);


       login_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email=email_obj.getText().toString();
                String Password=pass_obj.getText().toString( );
                  if (TextUtils.equals(Email,Email_v) &&TextUtils.equals(Password,Pass_v))  {
                      Intent intent = new Intent(MainActivity.this, Login_activity.class);
                      intent.putExtra(Name_Key, Email);
                      intent.putExtra(Pass_Key, Password);
                      startActivity(intent);

                  }
                  else
                  {
                    System.out.println("wrong information");

                  }

            }
        });
        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SignUp_activity.class);
                startActivity(intent);
            }
        });

    }
}