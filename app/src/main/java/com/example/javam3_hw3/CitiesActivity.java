package com.example.javam3_hw3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.cities_recyclerview.Cities;
import com.example.javam3_hw3.cities_recyclerview.CitiesAdapter;
import com.example.javam3_hw3.continents_recyclerview.Continents;
import com.example.javam3_hw3.continents_recyclerview.ContinentsAdapter;
import com.example.javam3_hw3.countries_recyclerview.Countries;

import java.util.ArrayList;

public class CitiesActivity extends AppCompatActivity {
    ArrayList<Cities> cities = new ArrayList<Cities>();
    private String name, continent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cities);
        name =  getIntent().getStringExtra("name");
        continent = getIntent().getStringExtra("continent");
        loadData();
        initRV();
    }
    private void loadData() {
        if (continent.equals("Asia")){
            if (name.equals("Japan")){
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png",  "Tokyo" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png",  "Kyoto" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png",  "Osaka" ));
            } else if (name.equals("China")) {
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/800px-Flag_of_the_People%27s_Republic_of_China.svg.png",  "Beijing" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/800px-Flag_of_the_People%27s_Republic_of_China.svg.png",  "Urumchi" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/800px-Flag_of_the_People%27s_Republic_of_China.svg.png",  "Shanghai" ));
            } else if (name.equals("Korea")) {
                cities.add(new Cities("https://cdn.britannica.com/49/1949-050-39ED83BA/Flag-South-Korea.jpg",  "Seoul" ));
                cities.add(new Cities("https://cdn.britannica.com/49/1949-050-39ED83BA/Flag-South-Korea.jpg",  "Hwason" ));
                cities.add(new Cities("https://cdn.britannica.com/49/1949-050-39ED83BA/Flag-South-Korea.jpg",  "Suvon" ));

            }
        } else if (continent.equals("Europe")) {
            if (name.equals("Germany")){
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png",  "Munchen" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png",  "Berlin" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png",  "Leipzig" ));
            } else if (name.equals("UK")) {
                cities.add(new Cities("https://cdn.britannica.com/25/4825-050-977D8C5E/Flag-United-Kingdom.jpg",  "London" ));
                cities.add(new Cities("https://cdn.britannica.com/25/4825-050-977D8C5E/Flag-United-Kingdom.jpg",  "Manchester" ));
                cities.add(new Cities("https://cdn.britannica.com/25/4825-050-977D8C5E/Flag-United-Kingdom.jpg",  "Liverpool" ));
            } else if (name.equals("France")) {
                cities.add(new Cities("https://cdn.britannica.com/82/682-004-F0B47FCB/Flag-France.jpg",  "Paris" ));
                cities.add(new Cities("https://cdn.britannica.com/82/682-004-F0B47FCB/Flag-France.jpg",  "Lion" ));
                cities.add(new Cities("https://cdn.britannica.com/82/682-004-F0B47FCB/Flag-France.jpg",  "Marcel" ));
            }
        } else if (continent.equals("NorthAmerica")) {
            if (name.equals("Canada")){
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png",  "Toronto" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png",  "Quebec" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png",  "Vancuver" ));

            } else if (name.equals("USA")) {
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flag_of_the_United_States_%28Pantone%29.svg/800px-Flag_of_the_United_States_%28Pantone%29.svg.png",  "New York" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flag_of_the_United_States_%28Pantone%29.svg/800px-Flag_of_the_United_States_%28Pantone%29.svg.png",  "Washington" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flag_of_the_United_States_%28Pantone%29.svg/800px-Flag_of_the_United_States_%28Pantone%29.svg.png",  "Dakota" ));
            } else if (name.equals("Mexico")) {
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png",  "New Mexico" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png",  "Puebla" ));
                cities.add(new Cities("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png",  "Durango" ));
            }
        }

    }
    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_cities);
        CitiesAdapter adapter = new CitiesAdapter(this.getLayoutInflater(), cities  );
        recyclerView.setAdapter(adapter);
    }
}