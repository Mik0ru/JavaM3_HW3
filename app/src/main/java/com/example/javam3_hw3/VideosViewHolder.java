package com.example.javam3_hw3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideosViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivAvatar;
    private TextView tvNum, tvName;
    public VideosViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNum = itemView.findViewById(R.id.tv_number);
        tvName = itemView.findViewById(R.id.tv_name);
    }
    void onBind(Contacts contacts){
        tvName.setText(contacts.getName());
        tvNum.setText(contacts.getNum());

    }
}
