package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Pag4 extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag4);

        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de gas","12:00"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de distancia","17:00"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de gas","10:00"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de distancia","11:30"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de gas","13:00"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de distancia","17:40"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de gas","16:00"));
        elements.add(new ListElement("#FFFFFF", "Alerta", "Limite de distancia","14:30"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}

