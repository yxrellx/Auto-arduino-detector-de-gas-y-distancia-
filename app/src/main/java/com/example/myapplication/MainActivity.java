package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference dbReference;
    ArrayList<Parametros> Parametros;
    //ArrayList<Notificacion> notificacion;
    //ArrayList<Historial> Historial;
    //TextView textView;


    ImageButton arriba;
    ImageButton abajo;
    ImageButton derecha;
    ImageButton izquierda;
    ImageButton detener;
    ImageButton conexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView = findViewById(R.id.textView);
        database = FirebaseDatabase.getInstance();
        dbReference = database.getReference("Parametros");
        //dbReference.addValueEventListener(new ValueEventListener() {
           //* @Override
        //public void onDataChange(@NonNull DataSnapshot snapshot) {
        // String m= snapshot .getValue(String.class);
        // textView.setText(m);
           // }
    // @Override
    // public void onCancelled(@NonNull DatabaseError error) {
    //   }
    // });
        dbReference.child("distancia").setValue("0");
        dbReference.child("niveles").setValue("00");
        dbReference.child("tmax").setValue(0);
        dbReference.child("tmin").setValue(100);
        dbReference.child("promedio").setValue("");
       // dbReference = database.getReference("notificacion");




        arriba = (ImageButton) findViewById(R.id.arriba);
        abajo = (ImageButton) findViewById(R.id.abajo);
        derecha = (ImageButton) findViewById(R.id.derecha);
        izquierda = (ImageButton) findViewById(R.id.izquierda);
        detener = (ImageButton) findViewById(R.id.detener);
        conexion = (ImageButton) findViewById(R.id.conexion);

        abajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hacia abajo", Toast.LENGTH_SHORT).show();
            }
        });

        izquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hacia la izquierda", Toast.LENGTH_SHORT).show();
            }
        });

        detener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "detener", Toast.LENGTH_SHORT).show();
            }
        });

        conexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Conexion", Toast.LENGTH_SHORT).show();
            }
        });

        arriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hacia arriba", Toast.LENGTH_SHORT).show();
            }
        });

        derecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hacia la derecha", Toast.LENGTH_SHORT).show();
            }
        });
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    
    @Override 
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.item1){
            Toast.makeText(this,"clic Historial",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Pag2.class);
            startActivity(i);
        }else if(id==R.id.item2) {
            Toast.makeText(this, "clic Niveles", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Pag3.class);
            startActivity(i);
        }
        else if(id==R.id.item3) {
            Toast.makeText(this, "clic Notificacion", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Pag4.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);

    }






}