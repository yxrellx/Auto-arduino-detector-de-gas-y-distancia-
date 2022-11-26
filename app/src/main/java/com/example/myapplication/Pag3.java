package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Pag3 extends AppCompatActivity {
    private TextView etTmax;
    private TextView etTmin;
    private TextView etPromedio;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);
        etTmax = (TextView) findViewById(R.id.textView15);
        etTmin = (TextView) findViewById(R.id.textView14);
        etPromedio = (TextView) findViewById(R.id.textView10);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Parametros").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    int tmax = Integer.parseInt(snapshot.child("tmax").getValue().toString());
                    int tmin = Integer.parseInt(snapshot.child("tmin").getValue().toString());
                    double promedio = (tmax + tmin)/2;
                    System.out.print(tmax+"");
                    etTmax.setText(""+tmax);
                    System.out.print(tmin+"");
                    etTmin.setText(""+tmin);
                    System.out.println("promedio" + promedio);
                    etPromedio.setText(""+promedio);


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
}