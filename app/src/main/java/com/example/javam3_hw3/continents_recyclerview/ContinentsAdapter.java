package com.example.javam3_hw3.continents_recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.OnItemClick;
import com.example.javam3_hw3.R;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsViewHolder> {
    private  LayoutInflater inflater;
    private  ArrayList<Continents> continents;
    private OnItemClick onItemClick;


    public ContinentsAdapter(LayoutInflater inflater, ArrayList<Continents> continents, OnItemClick onItemClick) {
        this.inflater = inflater;
        this.continents = continents;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_continents, parent, false);
        return new ContinentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Continents continent = continents.get(position);
        holder.onBind(continent);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }
}
