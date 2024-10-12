package com.example.javam3_hw3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding viewBinding;
    ArrayList<Videos> videos = new ArrayList<Videos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        loadData();
        initRV();
    }

    private void loadData() {
        videos.add(new Videos("https://media.tenor.com/bZpVIa5jAx8AAAAe/mr-beast-mr-beast-thumb-nail.png", "I made 1000 people play squid game", "MR Beast" ));
        videos.add(new Videos("https://i.redd.it/t1j8eek9cwed1.jpeg", "Why so serious?", "Jonkler" ));
        videos.add(new Videos("https://static1.cbrimages.com/wordpress/wp-content/uploads/2021/02/rickroll-header.jpg", "Never Gonna Give You Up", "Rick Astley" ));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_videos);
        VideosAdapter adapter = new VideosAdapter(this.getLayoutInflater(), videos);
        recyclerView.setAdapter(adapter);
    }
}