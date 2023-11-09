package com.example.shoppinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class order extends AppCompatActivity {
Spinner spin;
static int o = -1;
    EditText edtname,edtnumber,edtemail,edtaddress,edtpincode;
    Button butorder1;
    String name="",address="",phone="",pincode="",paymode="",email="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
      Intent i=getIntent();

        spin=findViewById(R.id.spinner);
        edtname=findViewById(R.id.edtname);
        edtname.setText(login.str[0]);
        edtnumber=findViewById(R.id.edtnumber);
        edtnumber.setText(login.str[1]);
        edtaddress=findViewById(R.id.edtaddress);
        edtemail=findViewById(R.id.edtemail);
        edtpincode=findViewById(R.id.edtpincode);
        butorder1=findViewById(R.id.butorder1);
        ArrayList<String > payment=new ArrayList<>();
        payment.add("None Selected");
        payment.add("Credit Card");
        payment.add("Debit Card");
        payment.add("UPI");
        payment.add("Cash on delivery");
        ArrayAdapter<String> adap=new ArrayAdapter<>(order.this, android.R.layout.simple_dropdown_item_1line,payment);
        spin.setAdapter(adap);


        butorder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=edtname.getText().toString();
                address=edtaddress.getText().toString();
                pincode=edtpincode.getText().toString().trim();
                email=edtemail.toString().trim();
                phone=edtnumber.getText().toString().trim();
                paymode=spin.getSelectedItem().toString();
          if(name.isEmpty()||phone.isEmpty()||address.isEmpty()||pincode.length()!=6)
          {
              Toast.makeText(order.this, "Enter all necessary fields!!", Toast.LENGTH_SHORT).show();
          } else if ((paymode.contentEquals("None Selected"))) {
              Toast.makeText(order.this, "Plaese choose a method for payment!!", Toast.LENGTH_SHORT).show();
          } else {
              o=i.getIntExtra("orderno",-1);
              Intent i=new Intent(order.this,com.example.shoppinapp.orderdone.class);
            //  i.putExtra("dialogkey",1);
              startActivity(i);
          }
            }
        });
    }
}