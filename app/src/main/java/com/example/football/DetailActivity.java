package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.football.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvName.setText(getIntent().getStringExtra("nama"));
        binding.tvDetail.setText(getIntent().getStringExtra("detail"));
        binding.ivLogo.setImageResource(getIntent().getIntExtra("logo",R.drawable.chelsea));
    }
}