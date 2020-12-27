package com.example.setdynamicversion;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LocalPlayer extends Player {
    private Context contextPlayer;

    private Boolean canPlay=true;
    private String nom;
    private float punts;
    private int imatge;
    private int coins;
    private ArrayList<Carta> cartasPlayer= new ArrayList<>();

    public LocalPlayer(String nom, int imatge, float punts, int coins, Context contextPlayer) {
        super();
        this.nom = nom;
        this.punts = punts;
        this.imatge = imatge;
        this.coins = coins;
        this.contextPlayer=contextPlayer;

        //update les dades del context principal


        // update imagenes tanto el local como el del imageviewplayer1
        ImageView imageViewLocalPlayer = ((Activity) contextPlayer).findViewById(R.id.imageViewLocalPlayer);
        imageViewLocalPlayer.setImageResource(getImatge());

        ImageView imageViewPlayer = ((Activity) contextPlayer).findViewById(R.id.imageViewPlayer1);
        imageViewPlayer.setImageResource(getImatge());


        TextView textViewNamePlayer =  ((Activity)contextPlayer).findViewById(R.id.textViewNamePlayer1);
        textViewNamePlayer.setText(getNom());

        TextView textViewNameLocalPlayer = ((Activity)contextPlayer).findViewById(R.id.textViewNameLocalPlayer);
        textViewNameLocalPlayer.setText(getNom());


        TextView textViewPunts =  ((Activity)contextPlayer).findViewById(R.id.textViewPlayer1Score);
        textViewPunts.setText(String.valueOf(getPunts()));

        TextView textViewScore = ((Activity) contextPlayer).findViewById(R.id.textViewScore);
        textViewScore.setText(String.valueOf(getCoins()));

    }
    public void mePlanto(){
        if(getPunts()>0) {
            ImageView imageView = ((Activity) contextPlayer).findViewById(R.id.imageViewPila);
            imageView.setClickable(false);
            Toast.makeText(contextPlayer, "T'has Plantat", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(contextPlayer, "No pots plantarte amb 0 punts", Toast.LENGTH_SHORT).show();
        }
    }
    public void updatePlayerPunts(Carta c){
        float p = getPunts();
        this.cartasPlayer.add(c);
        setPunts(p+c.getPuntos());

        TextView txtView =  ((Activity)contextPlayer).findViewById(R.id.textViewPlayer1Score);
        txtView.setText(String.valueOf(getPunts()));
        if (getPunts()>7.5){
            Toast.makeText(contextPlayer, "Has perdut", Toast.LENGTH_SHORT).show();
            canPlay=false;
        }

        if (!canPlay){
            ImageView imageView   = ((Activity) contextPlayer).findViewById(R.id.imageViewPila);
            imageView.setClickable(false);
        }

    }

    public Context getContextPlayer() {
        return contextPlayer;
    }

    public void setContextPlayer(Context contextPlayer) {
        this.contextPlayer = contextPlayer;
    }

    public Boolean getCanPlay() {
        return canPlay;
    }

    public void setCanPlay(Boolean canPlay) {
        this.canPlay = canPlay;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPunts() {
        return punts;
    }

    public void setPunts(float punts) {
        this.punts = punts;
    }

    public int getImatge() {
        return imatge;
    }

    public void setImatge(int imatge) {
        this.imatge = imatge;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public ArrayList<Carta> getCartasPlayer() {
        return cartasPlayer;
    }

    public void setCartasPlayer(ArrayList<Carta> cartasPlayer) {
        this.cartasPlayer = cartasPlayer;
    }
}
