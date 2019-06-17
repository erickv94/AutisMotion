package dev.grupo5.autismotion.Numeros;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import dev.grupo5.autismotion.R;

public class ContandoNumerosActivity extends AppCompatActivity  {
    ImageView imagennumero;
    ImageButton derecha,izquierda,sonido;
    MediaPlayer media;

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contando_numeros);
        setTitle("Contando Numeros");
        imagennumero = findViewById(R.id.numerocontar);
        derecha = findViewById(R.id.btnderecha);
        izquierda = findViewById(R.id.btnizquierda);
        sonido = findViewById(R.id.botonsonido);
        contador =0;
        imagennumero.setBackgroundResource(R.drawable.animal_number_0_t);
    }
    public void sonidito(View v){
        switch (contador){
            case 0:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_0);
                media.start();
                break;
            }
            case 1:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_1);
                media.start();
                break;
            }
            case 2:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_2);
                media.start();
                break;
            }
            case 3:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_3);
                media.start();
                break;
            }
            case 4:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_4);
                media.start();
                break;
            }
            case 5:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_5);
                media.start();
                break;
            }
            case 6:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_6);
                media.start();
                break;
            }
            case 7:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_7);
                media.start();
                break;
            }
            case 8:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_8);
                media.start();
                break;
            }
            case 9:{
                stopPlaying();
                media = MediaPlayer.create(getApplicationContext(), R.raw.numero_9);
                media.start();
                break;
            }
        }
    }
    private void stopPlaying() {
        if (media != null) {
            media.stop();
            media.release();
            media = null;
        }
    }
    public void moverderecha(View v){
        switch (contador){
            case 0:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_1_t);
                break;
            }
            case 1:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_2_t);
                break;
            }
            case 2:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_3_t);
                break;
            }
            case 3:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_4_t);
                break;
            }
            case 4:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_5_t);
                break;
            }
            case 5:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_6_t);
                break;
            }
            case 6:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_7_t);
                break;
            }
            case 7:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_8_t);
                break;
            }
            case 8:{
                contador++;
                imagennumero.setBackgroundResource(R.drawable.animal_number_9_t);
                break;
            }
            case 9:{
                contador=0;
                imagennumero.setBackgroundResource(R.drawable.animal_number_0_t);
                break;
            }
        }
    }
    public void moverIzquierda(View v){
        switch (contador){
            case 0:{
                contador=9;
                imagennumero.setBackgroundResource(R.drawable.animal_number_9_t);
                break;
            }
            case 1:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_0_t);
                break;
            }
            case 2:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_1_t);
                break;
            }
            case 3:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_2_t);
                break;
            }
            case 4:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_3_t);
                break;
            }
            case 5:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_4_t);
                break;
            }
            case 6:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_5_t);
                break;
            }
            case 7:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_6_t);
                break;
            }
            case 8:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_7_t);
                break;
            }
            case 9:{
                contador--;
                imagennumero.setBackgroundResource(R.drawable.animal_number_8_t);
                break;
            }
        }
    }

}
