package com.example.shoppinapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    public ProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView tvusername,tvpassword,tvphone,tvemail,tvaddress,tvcountry;
        Button butmyorders,buthelpcentre;
        ImageView imgavatar;
        imgavatar=view.findViewById(R.id.imgv);
        imgavatar.setImageResource(R.drawable.avatar);
        buthelpcentre = view.findViewById(R.id.buthelpcentre);
        tvusername=view.findViewById(R.id.tvusername);
        tvpassword=view.findViewById(R.id.tvpassword);
        tvphone=view.findViewById(R.id.tvphone);
        tvemail=view.findViewById(R.id.tvemail);
        tvaddress=view.findViewById(R.id.tvaddress);
        tvcountry=view.findViewById(R.id.tvcountry);
        butmyorders=view.findViewById(R.id.butmyorders);
        //login l=new login();
        tvusername.setText(login.str[0]);
        tvpassword.setText(login.str[1]);
        tvemail.setText(login.str[2]);
        tvemail.setText(Register.giveemail());
        tvphone.setVisibility(View.GONE);
        tvemail.setVisibility(View.GONE);
        tvaddress.setVisibility(View.GONE);
        tvcountry.setVisibility(View.GONE);



        buthelpcentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i=new Intent(ProfileFragment.this.getActivity(),com.example.shoppinapp.help.class);
               startActivity(i);
            }
        });

        butmyorders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i=new Intent(ProfileFragment.this.getActivity(),com.example.shoppinapp.ordervisit.class);
              startActivity(i);
            }
        });

        return view;
    }
}