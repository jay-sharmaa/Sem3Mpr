package com.example.shoppinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class categoryview extends AppCompatActivity implements Itemclicklistener{
int senddata;
    private List<Itemmodel> itemmodels;
    private CustomHomeAdapter homeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryview);
        Intent intent = getIntent();
         senddata = intent.getIntExtra("revdata",0);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleviewcategory);
        itemmodels = new ArrayList<>();
        Itemmodel i1 = new Itemmodel(R.drawable.item_realme_1,"Realme","Realme Narzo 10","15,000/-");
        Itemmodel i2 = new Itemmodel(R.drawable.ball1,"Ballz","Tennis Balls","250/-");
        Itemmodel i3 = new Itemmodel(R.drawable.shoes1,"Reebok","Reebok Nitro 1","899/-");
        Itemmodel i4 = new Itemmodel(R.drawable.tshirtwb1,"Jack n Jones","Flexible T-shirt","459/-");
        Itemmodel i5 = new Itemmodel(R.drawable.laptop1,"Asus","Asus Tuf Dash F-15","69,999/-");
        Itemmodel i6 = new Itemmodel(R.drawable.cricket1,"Kakabura","Hit hard X7","1699/-");
        Itemmodel i7 = new Itemmodel(R.drawable.womenshoes1,"Slim Wear","Slim wear extra-soft","399/-");
        Itemmodel i8 = new Itemmodel(R.drawable.pant1,"Ben Martin","Full length Best Quality","799/-");
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

        homeAdapter = new CustomHomeAdapter(itemmodels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(homeAdapter);
        homeAdapter.setItemclicklistener(this);

        if(senddata == 1){
            itemmodels.add(i4);
            itemmodels.add(i8);
            itemmodels.add(i11);
            itemmodels.add(i15);
            itemmodels.add(i19);
            itemmodels.add(i21);
        } else if (senddata == 2) {
            itemmodels.add(i3);
            itemmodels.add(i7);
            itemmodels.add(i9);
            itemmodels.add(i13);
            itemmodels.add(i16);
            itemmodels.add(i18);
            itemmodels.add(i20);
        } else if (senddata == 3) {
            itemmodels.add(i2);
            itemmodels.add(i6);
            itemmodels.add(i10);
            itemmodels.add(i12);
            itemmodels.add(i14);
            itemmodels.add(i17);
        } else if (senddata == 4) {
            itemmodels.add(i1);
            itemmodels.add(i5);
            itemmodels.add(i22);
            itemmodels.add(i23);
        }
    }
    @Override
    public void onCllick(View view, int pos) {
        if(senddata==1){
            switch(pos){
                case 0:Intent intenttshirt = new Intent(getApplicationContext(),All_Item_Activity.class);
                    intenttshirt.putExtra("Key",3);
                    startActivity(intenttshirt);
                    break;
                case 1:Intent intentpant = new Intent(getApplicationContext(),All_Item_Activity.class);
                    intentpant.putExtra("Key",7);
                    startActivity(intentpant);
                    break;
                case 2:Intent intentindo = new Intent(getApplicationContext(),All_Item_Activity.class);
                    intentindo.putExtra("Key",10);
                    startActivity(intentindo);
                    break;
                case 3:Intent intentdesign = new Intent(getApplicationContext(),All_Item_Activity.class);
                    intentdesign.putExtra("Key",14);
                    startActivity(intentdesign);
                    break;
                case 4:
                    Intent intentrr = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentrr.putExtra("Key", 18);
                    startActivity(intentrr);
                    break;
                case 5:Intent intentasian = new Intent(getApplicationContext(),All_Item_Activity.class);
                    intentasian.putExtra("Key",20);
                    startActivity(intentasian);
                    break;
            }
        }
        else if(senddata==2) {
            switch (pos) {
                case 0:
                    Intent intentreebok = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentreebok.putExtra("Key", 2);
                    startActivity(intentreebok);
                    break;
                case 1:
                    Intent intentslimwear = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentslimwear.putExtra("Key", 6);
                    startActivity(intentslimwear);
                    break;
                case 2:
                    Intent intentcampus = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentcampus.putExtra("Key", 8);
                    startActivity(intentcampus);
                    break;
                case 3:
                    Intent intentstyle = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentstyle.putExtra("Key", 12);
                    startActivity(intentstyle);
                    break;
                case 4:
                    Intent intentcanva = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentcanva.putExtra("Key", 15);
                    startActivity(intentcanva);
                    break;
                case 5:
                    Intent intentwoodland = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentwoodland.putExtra("Key", 17);
                    startActivity(intentwoodland);
                    break;
                case 6:
                    Intent intentsparx = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentsparx.putExtra("Key", 19);
                    startActivity(intentsparx);
                    break;
            }
        }
        else if(senddata==3) {
            switch (pos) {
                case 0:
                    Intent intentball = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentball.putExtra("Key", 1);
                    startActivity(intentball);
                    break;
                case 1:
                    Intent intentbat = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentbat.putExtra("Key", 5);
                    startActivity(intentbat);
                    break;
                case 2:
                    Intent intentbadminton = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentbadminton.putExtra("Key", 9);
                    startActivity(intentbadminton);
                    break;
                case 3:
                    Intent intenthockey = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intenthockey.putExtra("Key", 11);
                    startActivity(intenthockey);
                    break;
                case 4:
                    Intent intentcarrom = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentcarrom.putExtra("Key", 13);
                    startActivity(intentcarrom);
                    break;
                case 5:
                    Intent intentchess = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentchess.putExtra("Key", 16);
                    startActivity(intentchess);
                    break;
            }
        }
        else{
            switch (pos) {
                case 0:
                    Intent intentphone = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentphone.putExtra("Key", 0);
                    startActivity(intentphone);
                    break;
                case 1:
                    Intent intentlaptop = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentlaptop.putExtra("Key", 4);
                    startActivity(intentlaptop);
                    break;
                case 2:
                    Intent intentac = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentac.putExtra("Key", 21);
                    startActivity(intentac);
                    break;
                  case 3:
                    Intent intentrg = new Intent(getApplicationContext(), All_Item_Activity.class);
                    intentrg.putExtra("Key", 22);
                    startActivity(intentrg);
                    break;
            }
        }

    }

}