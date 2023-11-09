package com.example.shoppinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ordervisit extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Itemmodel> al=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordervisit);
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        Itemmodel i1 = new Itemmodel(R.drawable.item_realme_1, "Realme", "Realme Narzo 10", "15,000/-");
        Itemmodel i2 = new Itemmodel(R.drawable.ball1, "Ballz", "Tennis Balls", "250/-");
        Itemmodel i3 = new Itemmodel(R.drawable.shoes1, "Reebok", "Reebok Nitro 1", "899/-");
        Itemmodel i4 = new Itemmodel(R.drawable.tshirtwb1, "Jack n Jones", "Flexible T-shirt", "459/-");
        Itemmodel i5 = new Itemmodel(R.drawable.laptop1, "Asus", "Asus Tuf Dash F-15", "69,999/-");
        Itemmodel i6 = new Itemmodel(R.drawable.cricket1, "Kakabura", "Hit hard X7", "1699/-");
        Itemmodel i7 = new Itemmodel(R.drawable.womenshoes1, "Slim Wear", "Slim wear extra-soft", "399/-");
        Itemmodel i8 = new Itemmodel(R.drawable.pant1, "Ben Martin", "Full length Best Quality", "799/-");
        Itemmodel i9 = new Itemmodel(R.drawable.campus1,"Campus","Blue designer Shoes","1099/-");
        Itemmodel i10 = new Itemmodel(R.drawable.badminton1,"Omsan","Best shuttle racket","799/-");
        Itemmodel i11 = new Itemmodel(R.drawable.indoprimo1,"Indoprimo","Blue Full-length Shirt","459/-");
        Itemmodel i12 = new Itemmodel(R.drawable.hockey1,"XENON NS","Hockey Stick","1199/-");
        Itemmodel i13 = new Itemmodel(R.drawable.stylelureblack1,"Style Lure","Black Formal Shoes","899/-");
        Itemmodel i14 = new Itemmodel(R.drawable.carrom1,"SMT","Carrom Board","1099/-");
        Itemmodel i15 = new Itemmodel(R.drawable.designer1,"DesignKeeda","Designer Shirt","899/-");
        Itemmodel i16 = new Itemmodel(R.drawable.whitecanva1,"Canva","White Canva Shoes","1499/-");
        Itemmodel i17 = new Itemmodel(R.drawable.chess1,"JPG","Wooden Chess Board","399/-");
        Itemmodel i18 = new Itemmodel(R.drawable.woodland1,"Woodland","Woodland Military Shoes","2500/-");
        Itemmodel i19 = new Itemmodel(R.drawable.tshirtwb1,"RR Tshirts","White-Blue check tshirt","799/-");
        Itemmodel i20 = new Itemmodel(R.drawable.sparx1,"Sparx","Light stylish shoes","759/-");
        Itemmodel i21 = new Itemmodel(R.drawable.tshit1,"Asian ","Light Green lined tshirt","599/-");
        Itemmodel i22 = new Itemmodel(R.drawable.ac1,"BlueStar","Window AC","27000/-");
        Itemmodel i23 = new Itemmodel(R.drawable.rgmicrp1,"RG","Microphone","1300/-");
        if (order.o == 0) {
            al.add(i1);
        } else if (order.o == 1) {
            al.add(i2);
        } else if (order.o == 2) {
            al.add(i3);
        } else if (order.o == 3) {
            al.add(i4);
        } else if (order.o == 4) {
            al.add(i5);
        } else if (order.o == 5) {
            al.add(i6);
        } else if (order.o == 6) {
            al.add(i7);
        } else if (order.o == 7) {
            al.add(i8);
        } else if (order.o == 8) {
            al.add(i9);
        } else if (order.o == 9) {
            al.add(i10);
        } else if (order.o == 10) {
            al.add(i11);
        } else if (order.o == 11) {
            al.add(i12);
        } else if (order.o == 12) {
            al.add(i13);
        } else if (order.o == 13) {
            al.add(i14);
        } else if (order.o == 14) {
            al.add(i15);
        } else if (order.o == 15) {
            al.add(i16);
        } else if (order.o == 16) {
            al.add(i17);
        } else if (order.o == 17) {
            al.add(i18);
        } else if (order.o == 18) {
            al.add(i19);
        } else if (order.o == 19) {
            al.add(i20);
        } else if (order.o == 20) {
            al.add(i21);
        } else if (order.o == 21) {
            al.add(i22);
        }
        else if (order.o == 22) {
            al.add(i23);
        }
        CustomHomeAdapter c = new CustomHomeAdapter(al);
        rv.setAdapter(c);
    }

        /*@Override
        public void onBackPressed() {
        Intent intent = new Intent(this,HomeFragment.class);
                startActivity(intent);


            super.onBackPressed();
        }*/
    }
