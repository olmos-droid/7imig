package com.example.setdynamicversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tablero extends AppCompatActivity {
    private LinearLayout layout;
    private ImageView pilaCartas;
    private Baraja  barajaEsp;
    private Button mePlanto;
    private  ImageView imageViewLocal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);
        treurebarra();//quitar la barra de notificaciones (la que sale el reloj o la bateria)


        barajaEsp = new Baraja(); // creando una nueva baraja

        LocalPlayer player1 = new LocalPlayer("Olmos",R.drawable.ic_olmos,0,2000,Tablero.this);


        layout = findViewById(R.id.linerCartasPlayer1);
        pilaCartas = findViewById(R.id.imageViewPila);
        mePlanto = findViewById(R.id.buttonMePlanto);
        imageViewLocal = findViewById(R.id.imageViewLocalPlayer);

        imageViewLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });

        mePlanto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1.mePlanto();
            }
        });

        pilaCartas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //creamos una carta y le asiganoms la carta que saldra
                Carta c = new Carta(
                        barajaEsp.getCartas().get(barajaEsp.getPosition()).getId()
                        ,barajaEsp.getCartas().get(barajaEsp.getPosition()).getImatge()
                        ,barajaEsp.getCartas().get(barajaEsp.getPosition()).getPuntos());

                // creamos un imageView, que seria la carta que sale del monton de cartas
                ImageView imageView = new ImageView(Tablero.this);
                //asignamos una imagen al imageView
                imageView.setImageResource(c.getImatge());

                showCard(imageView, 250, 250,player1);


                player1.updatePlayerPunts(c);

                barajaEsp.setPosition(barajaEsp.getPosition()+1);
            }
        });
        Toast.makeText(this, "Comença el Joc!!", Toast.LENGTH_SHORT).show();
    }

    private void treurebarra() {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void showCard(ImageView imageView, int width, int height,Player p) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        if(p.getPunts()==0) {
            layoutParams.setMargins(-50, 0, 0, 0);

        }else{
            layoutParams.setMargins(-180, 0, 0, 0);

        }
        imageView.setLayoutParams(layoutParams);
        layout.addView(imageView);
    }
}