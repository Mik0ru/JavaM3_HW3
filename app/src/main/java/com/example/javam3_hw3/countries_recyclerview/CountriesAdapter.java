package com.example.javam3_hw3.countries_recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.OnItemClick;
import com.example.javam3_hw3.R;
import com.example.javam3_hw3.continents_recyclerview.Continents;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesViewHolder> {private LayoutInflater inflater;
    private ArrayList<Countries> countries;
    private OnItemClick onItemClick;


    public CountriesAdapter(LayoutInflater inflater, ArrayList<Countries> countries, OnItemClick onItemClick) {
        this.inflater = inflater;
        this.countries = countries;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_continents, parent, false);
        return new CountriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Countries country = countries.get(position);
        holder.onBind(country);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}

