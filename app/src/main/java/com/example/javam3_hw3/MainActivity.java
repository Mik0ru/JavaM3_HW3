package com.example.javam3_hw3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding viewBinding;
    ArrayList<Dishes> videos = new ArrayList<Dishes>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        loadData();
        initRV();
    }

    private void loadData() {
        videos.add(new Dishes("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0aBa1iK6QiRQf0C0oGI3qqfbgPJuJuPfzNQ&s", "Pepperoni pizza", "Pepperoni pizza is one of the most popular pizzas in the world. It's a classic combination of tomato sauce, cheese, and pepperoni that has been around for decades." ));
        videos.add(new Dishes("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ15DaHLtIPXplgiOrSAH8v-xqTHrlkZvBoKA&s", "Carbonara pasta", "Carbonara is an Italian main course consisting of spaghetti (long thin strands of pasta) with bacon and a creamy sauce made from eggs, Pecorino or Parmesan and black pepper" ));
        videos.add(new Dishes("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOIiNbCtvRjdGunEXvzblckJtNTZRe4eYDvw&s", "Caesar salad", "Caesar salad is made with romaine lettuce, croutons, Parmesan cheese, and Caesar dressing" ));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_videos);
        DishesAdapter adapter = new DishesAdapter(this.getLayoutInflater(), videos);
        recyclerView.setAdapter(adapter);
    }
}