package com.example.myapplication;


import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Pag4 extends AppCompatActivity {
    List<ListElement> elements;
    CardView cardView;
    DatabaseReference database;
    ListAdapter listAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag4);

        init();

    }


    public void init(){
        cardView = findViewById(R.id.cv);
        database = FirebaseDatabase.getInstance().getReference("Notificacion");
        recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                elements = new ArrayList<>();

                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                   // ListElement listElement = dataSnapshot.getValue(ListElement.class);
                   // elements.add(listElement);
                   // elements.add(new ListElement("#FFFFFF", "alerta", "texto","hora"));
                    ListElement listElement = dataSnapshot.getValue(ListElement.class);
                    System.out.println(listElement);
                    elements.add(listElement);

                }
                //myadapter.notifyDataSetChanged();

                ListAdapter listAdapter = new ListAdapter(elements, getApplicationContext());
                recyclerView.setAdapter(listAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}

