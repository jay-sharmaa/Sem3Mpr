package com.example.shoppinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
EditText edtusername,edtpassword;
Button butlogin,butregister;
static String[] str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtusername=findViewById(R.id.edtusername);
        edtpassword=findViewById(R.id.edtpassword);
        butlogin=findViewById(R.id.butlogin);
        butregister=findViewById(R.id.butregister);

        butlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           String name=edtusername.getText().toString();
           String pass=edtpassword.getText().toString();
           String email=Register.giveemail();
           if(name.isEmpty()||pass.isEmpty()){
               Toast.makeText(login.this, "Enter all fields!!", Toast.LENGTH_SHORT).show();
           }
           else {
               database d = new database(login.this);
               boolean b = d.serachusernamepassword(name, pass, email);
               if (b) {
                   Toast.makeText(login.this, "Login successfull!!", Toast.LENGTH_SHORT).show();
                   str=d.give();
                   Intent i = new Intent(login.this,com.example.shoppinapp.MainActivity.class);
                   startActivity(i);
               } else {
                   Toast.makeText(login.this, "Invalid Credentials!!", Toast.LENGTH_SHORT).show();
               }
           }
            }
        });
        butregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login.this,com.example.shoppinapp.Register.class);
                startActivity(i);
            }
        });
    }
}