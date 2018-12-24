package com.example.vaibhav.restaurantuicomidakit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_inActivity extends AppCompatActivity {


//    EditText phoneno,password;
//    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
//
//            phoneno = findViewById(R.id.phoneno);
//            password = findViewById(R.id.password);
//
//            btnlogin= findViewById(R.id.btnlogin);
//
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String phone = phoneno.getText().toString();
//                String pass = password.getText().toString();
//
//                if(phone.equals("1234") && pass.equals("1234")){
//                    // valid
//                    Intent i = new Intent(Sign_inActivity.this, Signup1Activity.class);
//                    startActivity(i);
//
//                }else{
//                    // invalid
//                    Toast.makeText(Sign_inActivity.this,"Invalid username or password !!", Toast.LENGTH_LONG).show();
//
//                }
//            }
//        });
    }
}