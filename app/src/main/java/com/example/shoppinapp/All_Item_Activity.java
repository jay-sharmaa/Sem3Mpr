package com.example.shoppinapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class All_Item_Activity extends Menuforallactivity {
    ImageView firstimage,secondimage,thirdimage;
    TextView brandname,itemname,price;
    Button butorder,butadd;
    static  int d = -1;
    static  int d1 = 0;
    static int item_id = -1,num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_item);
        firstimage = findViewById(R.id.firstimage);
        secondimage = findViewById(R.id.secondimage);
        thirdimage = findViewById(R.id.thirdimage);
        brandname = findViewById(R.id.selectedbrand);
        itemname = findViewById(R.id.selecteditem);
        price = findViewById(R.id.price);
        butorder = findViewById(R.id.butorder);
        butadd=findViewById(R.id.butadd);
        Intent intent = getIntent();
        item_id = intent.getIntExtra("Key",-1);


         {
            if (item_id == 0 ) {
                firstimage.setImageResource(R.drawable.item_realme_1);
                secondimage.setImageResource(R.drawable.item_realme_2);
                thirdimage.setImageResource(R.drawable.item_realme_3);
                brandname.setText("Realme");
                itemname.setText("Realme Narzo 10");
                price.setText("15000/-");
            } else if (item_id == 1 ) {
                firstimage.setImageResource(R.drawable.ball1);
                secondimage.setImageResource(R.drawable.ball2);
                thirdimage.setImageResource(R.drawable.ball3);
                brandname.setText("Ballz");
                itemname.setText("Tennis Balls");
                price.setText("250/-");
            } else if (item_id == 2 ) {
                firstimage.setImageResource(R.drawable.shoes1);
                secondimage.setImageResource(R.drawable.shoes2);
                thirdimage.setImageResource(R.drawable.shoes3);
                brandname.setText("Reebok");
                itemname.setText("Reebok Nitro 1");
                price.setText("899/-");
            } else if (item_id == 3 ) {
                firstimage.setImageResource(R.drawable.tshirt1);
                secondimage.setImageResource(R.drawable.tshirt2);
                thirdimage.setImageResource(R.drawable.tshirt3);
                brandname.setText("Jack n Jones");
                itemname.setText("Flexible T-shirt");
                price.setText("459/-");
            } else if (item_id == 4 ) {
                firstimage.setImageResource(R.drawable.laptop1);
                secondimage.setImageResource(R.drawable.laptop2);
                thirdimage.setImageResource(R.drawable.laptop3);
                brandname.setText("Asus");
                itemname.setText("Asus Tuf Dash F-15");
                price.setText("69999/-");
            } else if (item_id == 5 ) {
                firstimage.setImageResource(R.drawable.cricket1);
                secondimage.setImageResource(R.drawable.cricket2);
                thirdimage.setImageResource(R.drawable.cricket3);
                brandname.setText("Kakabura");
                itemname.setText("Hit Hard 7");
                price.setText("1699/-");
            } else if (item_id == 6 ) {
                firstimage.setImageResource(R.drawable.womenshoes1);
                secondimage.setImageResource(R.drawable.womenshoes2);
                thirdimage.setImageResource(R.drawable.womenshoes3);
                brandname.setText("Slim Wear");
                itemname.setText("Slim wear extra-soft");
                price.setText("399/-");
            } else if (item_id == 7 ) {
                firstimage.setImageResource(R.drawable.pant1);
                secondimage.setImageResource(R.drawable.pant2);
                thirdimage.setImageResource(R.drawable.pant3);
                brandname.setText("Ben Martin");
                itemname.setText("Full Length Best Quality");
                price.setText("799/-");
            }
            else if (item_id == 8 ) {
                firstimage.setImageResource(R.drawable.campus1);
                secondimage.setImageResource(R.drawable.campus2);
                thirdimage.setImageResource(R.drawable.campus3);
                brandname.setText("Campus");
                itemname.setText("Blue designer Shoes");
                price.setText("1099/-");
            }
            else if (item_id == 9 ) {
                firstimage.setImageResource(R.drawable.badminton1);
                secondimage.setImageResource(R.drawable.badminton2);
                thirdimage.setImageResource(R.drawable.badminton3);
                brandname.setText("Omsan");
                itemname.setText("Best shuttle racket");
                price.setText("799/-");
            }
            else if (item_id == 10 ) {
                firstimage.setImageResource(R.drawable.indoprimo1);
                secondimage.setImageResource(R.drawable.indoprimo2);
                thirdimage.setImageResource(R.drawable.indoprimo3);
                brandname.setText("Indoprimo");
                itemname.setText("Blue Full-length Shirt");
                price.setText("459/-");
            }
            else if (item_id == 11 ) {
                firstimage.setImageResource(R.drawable.hockey1);
                secondimage.setImageResource(R.drawable.hockey2);
                thirdimage.setImageResource(R.drawable.hockey3);
                brandname.setText("XENON NS");
                itemname.setText("Hockey Stick");
                price.setText("1199/-");
            }
            else if (item_id == 12 ) {
                firstimage.setImageResource(R.drawable.stylelureblack1);
                secondimage.setImageResource(R.drawable.stylelureblack2);
                thirdimage.setImageResource(R.drawable.stylelureblack3);
                brandname.setText("Style Lure");
                itemname.setText("Black Formal Shoes");
                price.setText("899/-");
            }
            else if (item_id == 13 ) {
                firstimage.setImageResource(R.drawable.carrom1);
                secondimage.setImageResource(R.drawable.carrom2);
                thirdimage.setImageResource(R.drawable.carrom3);
                brandname.setText("SMT");
                itemname.setText("Carrom Board");
                price.setText("1099/-");
            }
            else if (item_id == 14 ) {
                firstimage.setImageResource(R.drawable.designer1);
                secondimage.setImageResource(R.drawable.designer2);
                thirdimage.setImageResource(R.drawable.designer3);
                brandname.setText("DesignKeeda");
                itemname.setText("Designer Shirt");
                price.setText("899/-");
            }
            else if (item_id == 15 ) {
                firstimage.setImageResource(R.drawable.whitecanva1);
                secondimage.setImageResource(R.drawable.whitecanva2);
                thirdimage.setImageResource(R.drawable.whitecanva3);
                brandname.setText("Canva");
                itemname.setText("White Canva Shoes");
                price.setText("1499/-");
            }
            else if (item_id == 16 ) {
                firstimage.setImageResource(R.drawable.chess1);
                secondimage.setImageResource(R.drawable.chess2);
                thirdimage.setImageResource(R.drawable.chess3);
                brandname.setText("JPG");
                itemname.setText("Wooden Chess Board");
                price.setText("399/-");
            }
            else if (item_id == 17 ) {
                firstimage.setImageResource(R.drawable.woodland1);
                secondimage.setImageResource(R.drawable.woodland2);
                thirdimage.setImageResource(R.drawable.woodland3);
                brandname.setText("Woodland");
                itemname.setText("Woodland Military Shoes");
                price.setText("2500/-");
            }
            else if (item_id == 18 ) {
                firstimage.setImageResource(R.drawable.tshirtwb1);
                secondimage.setImageResource(R.drawable.tshirtwb2);
                thirdimage.setImageResource(R.drawable.tshirtwb3);
                brandname.setText("RR Tshirts");
                itemname.setText("White-Blue check tshirt");
                price.setText("799/-");
            }
            else if (item_id == 19 ) {
                firstimage.setImageResource(R.drawable.sparx1);
                secondimage.setImageResource(R.drawable.sparx2);
                thirdimage.setImageResource(R.drawable.sparx3);
                brandname.setText("Sparx");
                itemname.setText("Light stylish shoes");
                price.setText("759/-");
            }
            else if (item_id == 20 ) {
                firstimage.setImageResource(R.drawable.tshit1);
                secondimage.setImageResource(R.drawable.tshit2);
                thirdimage.setImageResource(R.drawable.tshit3);
                brandname.setText("Asian");
                itemname.setText("Light Green lined tshirt");
                price.setText("599/-");
            }
            else if (item_id == 21 ) {
                firstimage.setImageResource(R.drawable.ac1);
                secondimage.setImageResource(R.drawable.ac2);
                thirdimage.setImageResource(R.drawable.ac3);
                brandname.setText("BlueStar");
                itemname.setText("Window AC");
                price.setText("27000/-");
            }
            else if (item_id == 22 ) {
                firstimage.setImageResource(R.drawable.tshit1);
                secondimage.setImageResource(R.drawable.tshit2);
                thirdimage.setImageResource(R.drawable.tshit3);
                brandname.setText("RG");
                itemname.setText("Microphone");
                price.setText("1300/-");
            }
        }
        butadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c=0;

                if(d1 < 1) {
                    d =item_id;
                    num += 1;
                    d1 += 1;
                }
                else{
                    Toast.makeText(All_Item_Activity.this, "Only one item can be in  a cart at a time", Toast.LENGTH_SHORT).show();
                }
            }
        });
        butorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent i=new Intent(All_Item_Activity.this,com.example.shoppinapp.order.class);
            i.putExtra("orderno",item_id);
             startActivity(i);
         }
        });
    }

   /* @Override
    public void onBackPressed() {

        if(item_id != -1){
            Intent intent = new Intent(this,HomeFragment.class);
            startActivity(intent);
        }

        super.onBackPressed();
    }
*/
}