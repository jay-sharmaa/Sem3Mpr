package com.example.shoppinapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomHomeAdapter extends RecyclerView.Adapter<CustomHomeAdapter.Sportsviewholder> {
    private List<Itemmodel> itemmodel;

    Itemclicklistener itemclicklistener;

    public void setItemclicklistener(Itemclicklistener mylistener){
        this.itemclicklistener = mylistener;
    }

    public CustomHomeAdapter(List<Itemmodel> itemmodel) {
        this.itemmodel = itemmodel;
    }
    @NonNull
    @Override
    public Sportsviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new Sportsviewholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull Sportsviewholder holder, int position) {
        Itemmodel itemodel = itemmodel.get(position);
        holder.pricename.setText(itemodel.Price);
        holder.itemname.setText(itemodel.ItemName);
        holder.brandname.setText(itemodel.BrandName);
        holder.imageView.setImageResource(itemodel.Itemimg);
    }

    @Override
    public int getItemCount() {
        return itemmodel.size();
    }

    public class Sportsviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView brandname;
        TextView itemname;
        TextView pricename;
        ImageView imageView;

        public Sportsviewholder(@NonNull View itemView) {
            super(itemView);
            brandname = itemView.findViewById(R.id.BrandName);
            imageView = itemView.findViewById(R.id.Imageview);
            itemname = itemView.findViewById(R.id.Itemname);
            pricename = itemView.findViewById(R.id.Price);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(itemclicklistener != null){
                itemclicklistener.onCllick(v,getAdapterPosition());
            }
        }
    }
}