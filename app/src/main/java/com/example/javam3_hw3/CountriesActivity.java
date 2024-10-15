package com.example.javam3_hw3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.countries_recyclerview.Countries;
import com.example.javam3_hw3.countries_recyclerview.CountriesAdapter;

import java.util.ArrayList;

public class CountriesActivity extends AppCompatActivity implements OnItemClick {
    private String name, continent;
    ArrayList<Countries> countries = new ArrayList<Countries>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_countries);
       name = getIntent().getStringExtra("name");
        loadData();
        initRV();

    }
    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_countries);
        CountriesAdapter adapter = new CountriesAdapter(this.getLayoutInflater(), countries , this );
        recyclerView.setAdapter(adapter);
    }
    private void loadData() {
        if (name.equals("Asia")){
            continent = "Asia";
            countries.add(new Countries("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png",  "Japan" ));
            countries.add(new Countries("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/800px-Flag_of_the_People%27s_Republic_of_China.svg.png",  "China" ));
            countries.add(new Countries("https://cdn.britannica.com/49/1949-050-39ED83BA/Flag-South-Korea.jpg",  "Korea" ));
        } else if (name.equals("Europe")) {
            continent = "Europe";
            countries.add(new Countries("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png",  "Germany" ));
            countries.add(new Countries("https://cdn.britannica.com/82/682-004-F0B47FCB/Flag-France.jpg",  "France" ));
            countries.add(new Countries("https://cdn.britannica.com/25/4825-050-977D8C5E/Flag-United-Kingdom.jpg",  "UK" ));
        } else if (name.equals("North America")) {
            continent = "NorthAmerica";
            countries.add(new Countries("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png",  "Canada" ));
            countries.add(new Countries("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flag_of_the_United_States_%28Pantone%29.svg/800px-Flag_of_the_United_States_%28Pantone%29.svg.png",  "USA" ));
            countries.add(new Countries("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png",  "Mexico" ));
        }

    }

    @Override
    public void onClick(int position) {
        Countries country = countries.get(position);
        Intent intent = new Intent(this,CitiesActivity.class);
        intent.putExtra("name", country.getName());
        intent.putExtra("continent", continent);
        startActivity(intent);
        Toast.makeText(this, country.getName(), Toast.LENGTH_SHORT).show();
    }
}