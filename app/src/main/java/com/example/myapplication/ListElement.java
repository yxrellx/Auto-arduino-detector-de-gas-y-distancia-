package com.example.myapplication;

public class ListElement {
    public String color;
    public String alerta;
    public String texto;
    public String hora;

    public ListElement(String color, String alerta, String texto, String hora) {
        this.color = color;
        this.alerta = alerta;
        this.texto = texto;
        this.hora = hora;
    }

    public String getColor() {
        return color;
    }

    public String getAlerta() {
        return alerta;
    }

    public String getTexto() {
        return texto;
    }

    public String getHora() {
        return hora;
    }


}
