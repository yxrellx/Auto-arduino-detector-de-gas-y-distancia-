package com.example.myapplication;

public class Historial {
    public String id;
    public String hora;
    public int distancia;
    public int niveles;

    public Historial() {

    }

    public Historial(String id, String hora, int distancia, int niveles) {
        this.id = id;
        this.hora = hora;
        this.distancia = distancia;
        this.niveles = niveles;
    }

    @Override
    public String toString() {
        return "dffc{" +
                "id='" + id + '\'' +
                ", hora='" + hora+ '\'' +
                ", niveles='" + niveles + '\'' +
                ", distancia='" + distancia + '\'' +
                '}';
    }
}
