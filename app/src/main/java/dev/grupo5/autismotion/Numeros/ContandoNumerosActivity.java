package dev.grupo5.autismotion.Numeros;


import android.content.Intent;
import android.media.MediaPlayer;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Locale;

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

    public void tryspeech(View v){
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, Locale.getDefault());
        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivityForResult(intent,10);

        }else{
            Toast.makeText(this,"Tu dispositivo no soparta Speech",Toast.LENGTH_SHORT).show();
        }

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        switch (requestCode){
            case 10:{
                if(resultCode == RESULT_OK && data != null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    switch(contador){
                        case 0:{
                            if(result.get(0).equals("0") || result.get(0).equals("cero")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 1:{
                            if(result.get(0).equals("1")|| result.get(0).equals("uno")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 2:{
                            if(result.get(0).equals("2")|| result.get(0).equals("dos")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 3:{
                            if(result.get(0).equals("3")|| result.get(0).equals("tres")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 4:{
                            if(result.get(0).equals("4")|| result.get(0).equals("cuatro")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 5:{
                            if(result.get(0).equals("5")|| result.get(0).equals("cinco")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 6:{
                            if(result.get(0).equals("6")|| result.get(0).equals("seis")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 7:{
                            if(result.get(0).equals("7")|| result.get(0).equals("siete")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 8:{
                            if(result.get(0).equals("8")|| result.get(0).equals("ocho")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }
                        case 9:{
                            if(result.get(0).equals("9")|| result.get(0).equals("nueve")){
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.exito);
                                media.start();
                            }else{
                                stopPlaying();
                                media = MediaPlayer.create(getApplicationContext(), R.raw.fallo);
                                media.start();
                            }
                            break;
                        }

                    }
                }
                break;
            }
        }
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
