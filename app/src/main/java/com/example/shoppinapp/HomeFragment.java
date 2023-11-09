package com.example.shoppinapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements Itemclicklistener{

    private List<Itemmodel> itemmodels;
    private CustomHomeAdapter homeAdapter;

    private Toolbar toolbar;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleview);
        toolbar = view.findViewById(R.id.appbar);

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

        //
        itemmodels.add(i1);
        itemmodels.add(i2);
        itemmodels.add(i3);
        itemmodels.add(i4);
        itemmodels.add(i5);
        itemmodels.add(i6);
        itemmodels.add(i7);
        itemmodels.add(i8);
        itemmodels.add(i9);
        itemmodels.add(i10);
        itemmodels.add(i11);
        itemmodels.add(i12);
        itemmodels.add(i13);
        itemmodels.add(i14);
        itemmodels.add(i15);
        itemmodels.add(i16);
        itemmodels.add(i17);
        itemmodels.add(i18);
        itemmodels.add(i19);
        itemmodels.add(i20);
        itemmodels.add(i21);
        itemmodels.add(i22);
        itemmodels.add(i23);
        //
        homeAdapter = new CustomHomeAdapter(itemmodels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(homeAdapter);
        homeAdapter.setItemclicklistener(this);
        //
        return view;
    }
//    @Override
    public void onCllick(View view, int pos) {
        Intent intent = new Intent(getContext(),All_Item_Activity.class);
        intent.putExtra("Key",pos);
        startActivity(intent);
    }
}