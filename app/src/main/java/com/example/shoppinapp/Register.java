package com.example.shoppinapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText edtusername,edtpassword,edtrepassword;
static EditText edtemail;
static String email,username,password,repassword;
TextView textView;
Button butfinalregister;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtusername=findViewById(R.id.username);
        edtpassword=findViewById(R.id.password);
        edtemail=findViewById(R.id.email);
        edtrepassword=findViewById(R.id.edtrepassword);
        butfinalregister=findViewById(R.id.butfinalregister);

        database dbe=new database(this);
        butfinalregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = edtusername.getText().toString().trim();
                password = edtpassword.getText().toString().trim();
                email = edtemail.getText().toString().trim();
                repassword = edtrepassword.getText().toString().trim();
                if (username.isEmpty() || password.isEmpty() || email.isEmpty() || repassword.isEmpty()) {
                    Toast.makeText(Register.this, "Enter all fields", Toast.LENGTH_SHORT).show();
                } else if (password.length() != 8) {
                    Toast.makeText(Register.this, "Password must be 8 charactes long", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.contentEquals(repassword)) {
                        boolean b = dbe.searchusername(username);
                        if (b == false) {
                            Toast.makeText(Register.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            dbe.add(username, password, email);
                            Intent ii=new Intent(Register.this,com.example.shoppinapp.MainActivity.class);
                            startActivity(ii);
                        } else {
                            Toast.makeText(Register.this, "Username already exists!!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Register.this, "Both the passwords should be same!! ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    static String giveemail(){
        return email;
    }

}
