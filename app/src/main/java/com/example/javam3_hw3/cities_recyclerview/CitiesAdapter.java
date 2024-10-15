package com.example.javam3_hw3.cities_recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.OnItemClick;
import com.example.javam3_hw3.R;
import com.example.javam3_hw3.continents_recyclerview.Continents;
import com.example.javam3_hw3.continents_recyclerview.ContinentsViewHolder;

import java.util.ArrayList;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Cities> cities;

    public CitiesAdapter(LayoutInflater inflater, ArrayList<Cities> cities) {
        this.inflater = inflater;
        this.cities = cities;
    }

    @NonNull
    @Override
    public CitiesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_continents, parent, false);
        return new CitiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CitiesViewHolder holder, int position) {
        Cities city = cities.get(position);
        holder.onBind(city);
    }


    @Override
    public int getItemCount() {
        return cities.size();
    }
}
