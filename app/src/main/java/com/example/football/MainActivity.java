package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.football.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FootballAdapter adapter;
    private ArrayList<Football> arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        arrayList = getData();
        adapter = new FootballAdapter(arrayList,this);
        binding.rvFootball.setAdapter(adapter);

    }

    private ArrayList<Football> getData()
    {
        ArrayList<Football> data = new ArrayList<>();
        data.add(
                new Football("Chelsea",
                        "Chelsea merupakan team liga inggris dengan dua kali champions",
                        R.drawable.chelsea,2)
        );
        data.add(
                new Football("Real Madrid",
                        "Real Madrid merupakan team liga spanyol dengan 13 kali champions",
                        R.drawable.realmadrid,13)
        );

        return data;
    }
}