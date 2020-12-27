package com.example.setdynamicversion;

public class Carta {
    private String id;
    private int imatge;
    private float puntos;

    public Carta(String id, int imatge, float puntos) {
        this.id = id;
        this.imatge = imatge;
        this.puntos = puntos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImatge() {
        return imatge;
    }

    public void setImatge(int imatge) {
        this.imatge = imatge;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "\nCarta{" +
                "id='" + id + '\'' +
                ", foto=" + imatge +
                ", puntos=" + puntos +
                '}';
    }
}
