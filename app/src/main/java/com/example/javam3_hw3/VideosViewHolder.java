package com.example.javam3_hw3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class VideosViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivAvatar;
    private TextView tvDesc,tvName;
    public VideosViewHolder(@NonNull View itemView) {
        super(itemView);
        ivAvatar = itemView.findViewById(R.id.iv_contact);
        tvDesc = itemView.findViewById(R.id.tv_desc);
        tvName = itemView.findViewById(R.id.tv_name);
    }
    void onBind(Videos videos){
        Glide.with(ivAvatar.getContext()).load(videos.getImage()).into(ivAvatar);
        tvName.setText(videos.getName());
        tvDesc.setText(videos.getDisc());

    }
}
