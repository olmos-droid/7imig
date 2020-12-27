package com.example.setdynamicversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas = new ArrayList<>();
    private int position;


    public Baraja() {
        position=0;

        cartas.add(new Carta("Oros 1", R.drawable.golds01, 1f));
        cartas.add(new Carta("Oros 2", R.drawable.golds02, 2f));
        cartas.add(new Carta("Oros 3", R.drawable.golds03, 3f));
        cartas.add(new Carta("Oros 4", R.drawable.golds04, 4f));
        cartas.add(new Carta("Oros 5", R.drawable.golds05, 5f));
        cartas.add(new Carta("Oros 6", R.drawable.golds06, 6f));
        cartas.add(new Carta("Oros 7", R.drawable.golds07, 7f));
        cartas.add(new Carta("Oros 8", R.drawable.golds08, 0.5f));
        cartas.add(new Carta("Oros 9", R.drawable.golds09, 0.5f));
        cartas.add(new Carta("Oros 10", R.drawable.golds10, 0.5f));
        cartas.add(new Carta("Oros 11", R.drawable.golds11, 0.5f));
        cartas.add(new Carta("Oros 12", R.drawable.golds12, 0.5f));

        cartas.add(new Carta("Copas 1", R.drawable.cups01, 1f));
        cartas.add(new Carta("Copas 2", R.drawable.cups02, 2f));
        cartas.add(new Carta("Copas 3", R.drawable.cups03, 3f));
        cartas.add(new Carta("Copas 4", R.drawable.cups04, 4f));
        cartas.add(new Carta("Copas 5", R.drawable.cups05, 5f));
        cartas.add(new Carta("Copas 6", R.drawable.cups06, 6f));
        cartas.add(new Carta("Copas 7", R.drawable.cups07, 7f));
        cartas.add(new Carta("Copas 8", R.drawable.cups08, 0.5f));
        cartas.add(new Carta("Copas 9", R.drawable.cups09, 0.5f));
        cartas.add(new Carta("Copas 10", R.drawable.cups10, 0.5f));
        cartas.add(new Carta("Copas 11", R.drawable.cups11, 0.5f));
        cartas.add(new Carta("Copas 12", R.drawable.cups12, 0.5f));

        cartas.add(new Carta("Bastos 1", R.drawable.clubs01, 1f));
        cartas.add(new Carta("Bastos 2", R.drawable.clubs02, 2f));
        cartas.add(new Carta("Bastos 3", R.drawable.clubs03, 3f));
        cartas.add(new Carta("Bastos 4", R.drawable.clubs04, 4f));
        cartas.add(new Carta("Bastos 5", R.drawable.clubs05, 5f));
        cartas.add(new Carta("Bastos 6", R.drawable.clubs06, 6f));
        cartas.add(new Carta("Bastos 7", R.drawable.clubs07, 7f));
        cartas.add(new Carta("Bastos 8", R.drawable.clubs08, 0.5f));
        cartas.add(new Carta("Bastos 9", R.drawable.clubs09, 0.5f));
        cartas.add(new Carta("Bastos 10", R.drawable.clubs10, 0.5f));
        cartas.add(new Carta("Bastos 11", R.drawable.clubs11, 0.5f));
        cartas.add(new Carta("Bastos 12", R.drawable.clubs12, 0.5f));

        cartas.add(new Carta("Espadas 1", R.drawable.swords01, 1f));
        cartas.add(new Carta("Espadas 2", R.drawable.swords02, 2f));
        cartas.add(new Carta("Espadas 3", R.drawable.swords03, 3f));
        cartas.add(new Carta("Espadas 4", R.drawable.swords04, 4f));
        cartas.add(new Carta("Espadas 5", R.drawable.swords05, 5f));
        cartas.add(new Carta("Espadas 6", R.drawable.swords06, 6f));
        cartas.add(new Carta("Espadas 7", R.drawable.swords07, 7f));
        cartas.add(new Carta("Espadas 8", R.drawable.swords08, 0.5f));
        cartas.add(new Carta("Espadas 9", R.drawable.swords09, 0.5f));
        cartas.add(new Carta("Espadas 10", R.drawable.swords10, 0.5f));
        cartas.add(new Carta("Espadas 11", R.drawable.swords11, 0.5f));
        cartas.add(new Carta("Espadas 12", R.drawable.swords12, 0.5f));

        Collections.shuffle(cartas);
        System.out.println(cartas);


    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + cartas +
                '}';
    }
}
