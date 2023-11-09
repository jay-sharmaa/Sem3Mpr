package com.example.shoppinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help extends AppCompatActivity {
Button butcall,butmess,butweb,butemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        butcall=findViewById(R.id.butcall);
        butmess=findViewById(R.id.butmess);
        butweb=findViewById(R.id.butweb);
        butemail=findViewById(R.id.butemail);

        butcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call=new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel: +919999999999"));
              startActivity(call);
            }
        });

        butmess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mess=new Intent( Intent.ACTION_SENDTO);
                mess.setData(Uri.parse("smsto:"+Uri.encode("+919999999999")));
                mess.putExtra("sms_body","Type your problem here!!");
                startActivity(mess);
            }
        });

        butemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email=new Intent(Intent.ACTION_SEND);
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"jay@gmail.com","dhruv@gmail.com","nipun@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT,"My issues");
                email.putExtra(Intent.EXTRA_TEXT,"Type your issue here!!");
                startActivity(email);
            }
        });

        butweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.com/home");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

       /* butloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Uri uri=Uri.parse("geo:0,0?q=Thadomal Shahani Engineering College,Mumbai,India");
               Intent loc=new Intent(Intent.ACTION_VIEW,uri);
               loc.setPackage("com.google.android.app.maps");
               startActivity(loc);
            }
        });*/
    }
}