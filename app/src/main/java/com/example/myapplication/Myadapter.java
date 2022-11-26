package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    Context context;
    ArrayList<Historial> list;

    public Myadapter(Context context, ArrayList<Historial> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Historial historial = list.get(position);
        holder.hora.setText(historial.getHora());
        holder.niveles.setText(historial.getNiveles());
        holder.distancia.setText(historial.getDistancia());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView hora, niveles, distancia;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hora = itemView.findViewById(R.id.tvhora);
            niveles = itemView.findViewById(R.id.tvniveles);
            distancia = itemView.findViewById(R.id.tvdistancia);
        }
    }
}
