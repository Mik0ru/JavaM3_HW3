package com.example.javam3_hw3.continents_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.javam3_hw3.R;

public class ContinentsViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivAvatar;
    private TextView tvName;
    public ContinentsViewHolder(@NonNull View itemView) {
        super(itemView);
        ivAvatar = itemView.findViewById(R.id.iv_content);
        tvName = itemView.findViewById(R.id.tv_name);
    }
    void onBind(Continents continents){
        Glide.with(ivAvatar.getContext()).load(continents.getImage()).into(ivAvatar);
        tvName.setText(continents.getName());

    }
}
