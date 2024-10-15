package com.example.javam3_hw3.cities_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.javam3_hw3.R;
import com.example.javam3_hw3.continents_recyclerview.Continents;

public class CitiesViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivAvatar;
    private TextView tvName;
    public CitiesViewHolder(@NonNull View itemView) {
        super(itemView);
        ivAvatar = itemView.findViewById(R.id.iv_content);
        tvName = itemView.findViewById(R.id.tv_name);
    }
    void onBind(Cities cities){
        Glide.with(ivAvatar.getContext()).load(cities.getImage()).into(ivAvatar);
        tvName.setText(cities.getName());

    }
}
