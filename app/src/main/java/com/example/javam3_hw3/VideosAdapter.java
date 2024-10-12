package com.example.javam3_hw3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideosAdapter extends RecyclerView.Adapter<VideosViewHolder> {
    private  LayoutInflater inflater;
    private  ArrayList<Videos> videos;

    public VideosAdapter(LayoutInflater inflater, ArrayList<Videos> videos) {
        this.inflater = inflater;
        this.videos = videos;
    }

    @NonNull
    @Override
    public VideosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_videos, parent, false);
        return new VideosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideosViewHolder holder, int position) {
        Videos video = videos.get(position);
        holder.onBind(video);
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }
}
