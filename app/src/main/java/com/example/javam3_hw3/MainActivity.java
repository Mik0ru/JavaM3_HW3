package com.example.javam3_hw3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javam3_hw3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding viewBinding;
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        loadData();
        initRV();
    }

    private void loadData() {
        contacts.add(new Contacts( "Mom", "0555077977" ));
        contacts.add(new Contacts( "Dad", "0305505375" ));
        contacts.add(new Contacts("Bro", "0102212315" ));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_contacts);
        VideosAdapter adapter = new VideosAdapter(this.getLayoutInflater(), contacts);
        recyclerView.setAdapter(adapter);
    }
}