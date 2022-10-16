package com.example.myapplication;


import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() { return mData.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items) { mData = items; }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImg;
        TextView texto, hora, alerta;

        ViewHolder(View itemView) {
            super(itemView);
            iconImg = itemView.findViewById(R.id.iconImagView);
            texto = itemView.findViewById(R.id.texto);
            alerta = itemView.findViewById(R.id.alerta);
            hora = itemView.findViewById(R.id.hora24);
        }

        void bindData(final ListElement item) {
            iconImg.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            texto.setText(item.getTexto());
            hora.setText(item.getHora());
            alerta.setText(item.getAlerta());


        }
    }
}
