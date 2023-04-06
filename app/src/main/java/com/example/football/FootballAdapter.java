package com.example.football;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {

    private ArrayList<Football> list;
    private Context context;

    public FootballAdapter(ArrayList<Football> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FootballAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_data, parent, false);
        return new FootballAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FootballAdapter.ViewHolder holder, int position) {
        Football item = list.get(position);
        holder.tvNama.setText(item.nameTeam);
        holder.tvJuara.setText(String.valueOf(item.championTeam));
        holder.ivLogo.setImageResource(item.imageTeam);

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context,DetailActivity.class);
            intent.putExtra("logo",item.imageTeam);
            intent.putExtra("nama",item.nameTeam);
            intent.putExtra("detail",item.detailTeam);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNama,tvDetail,tvJuara;
        private ImageView ivLogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvJuara = itemView.findViewById(R.id.tv_juara);
            ivLogo = itemView.findViewById(R.id.iv_club);
        }
    }
}
