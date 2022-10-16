package com.example.myapplication;

public class Notificacion {

    public int imagen;
    private String alerta;
    private int hora;
    private String texto;

    public Notificacion(String alerta, int hora, String texto, int imagen) {
        this.alerta = alerta;
        this.hora = hora;
        this.texto = texto;
        this.imagen = imagen;
    }

    public String getAlerta() {
        return alerta;
    }

    public int getHora() {
        return hora;
    }

    public String getTexto() {
        return texto;
    }

    public int getImagen() {
        return imagen;
    }
}
