package com.example.javam3_hw3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.continents_recyclerview.Continents;
import com.example.javam3_hw3.continents_recyclerview.ContinentsAdapter;
import com.example.javam3_hw3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    private ActivityMainBinding viewBinding;
    ArrayList<Continents> continents = new ArrayList<Continents>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        loadData();
        initRV();
    }

    private void loadData() {
        continents.add(new Continents("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Asia_%28orthographic_projection%29_without_New_Guinea.svg/220px-Asia_%28orthographic_projection%29_without_New_Guinea.svg.png",  "Asia" ));
        continents.add(new Continents("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Location_North_America.svg/800px-Location_North_America.svg.png",  "North America" ));
        continents.add(new Continents("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Europe_orthographic_Caucasus_Urals_boundary_%28with_borders%29.svg/280px-Europe_orthographic_Caucasus_Urals_boundary_%28with_borders%29.svg.png",  "Europe" ));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_continents);
        ContinentsAdapter adapter = new ContinentsAdapter(this.getLayoutInflater(), continents , this );
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        Continents continent = continents.get(position);
        Intent intent = new Intent(this,CountriesActivity.class);
        intent.putExtra("name", continent.getName());
        startActivity(intent);
        Toast.makeText(this, continent.getName(), Toast.LENGTH_SHORT).show();
    }
}