package dev.grupo5.autismotion.Numeros;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import dev.grupo5.autismotion.R;





public class SumandoNumerosActivity extends AppCompatActivity {


    //imagenes numeros
    ImageView imageNum1Sum,imageNum2Sum;
    //botones imagenes respuesta
    ImageButton imageNum1ResulSuma,imageNum2ResulSuma,imageNum3ResulSuma;
    //resultado suma
    int resultado =0;

    //generando dos numeros aleatorios entre 0 y 4 para realizar suma
    Random aleatorio = new Random(System.currentTimeMillis());
    int num1suma=aleatorio.nextInt(5);
    int num2suma=aleatorio.nextInt(5);

    //generando posiciones para resultados  correcto de 0 a 2
    int posicion=aleatorio.nextInt(3);


    //generando numeros  para resultado incorrecto
    int resulaleat1=aleatorio.nextInt(5);
    int resulaleat2=aleatorio.nextInt(5);


    //mediaplayer
    MediaPlayer media;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumando_numeros);
        setTitle("Sumando Numeros");

        imageNum1Sum=findViewById(R.id.imageNum1Sum);
        imageNum2Sum=findViewById(R.id.imageNum2Sum);
        imageNum1ResulSuma=findViewById(R.id.imageNum1ResulSuma);
        imageNum2ResulSuma=findViewById(R.id.imageNum2ResulSuma);
        imageNum3ResulSuma=findViewById(R.id.imageNum3ResulSuma);
        //asignacion numero uno y dos para sumar con su respectiva imagen
        asignacionnum1(num1suma);
        asignacionnum2(num2suma);
        //realizando suma de aleatorios
        resultado=num1suma+num2suma;
        //asignar resultados a los botones.
        asignacionResultado(posicion,resultado,resulaleat1,resulaleat2);

        Button btnsumar = (Button) findViewById(R.id.btnDeNuevo);
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SumandoNumerosActivity.class);
                startActivityForResult(intent,0);
                finish();
            }
        });


    }


    public void resultadouno(View v){
        if(posicion==0){
            Toast.makeText(this, "Exito", Toast.LENGTH_SHORT).show();
            stopPlaying();
            media=MediaPlayer.create(getApplicationContext(),R.raw.exito);
            media.start();
        }
        else{
            Toast.makeText(this, "Fallo", Toast.LENGTH_SHORT).show();
            stopPlaying();
            media=MediaPlayer.create(getApplicationContext(),R.raw.fallo);
            media.start();
        }
    }
    public void resultadodos(View v){
        if(posicion==1){
            Toast.makeText(this, "Exito", Toast.LENGTH_SHORT).show();
            stopPlaying();
            media=MediaPlayer.create(getApplicationContext(),R.raw.exito);
            media.start();
        }
        else{
            Toast.makeText(this, "Fallo", Toast.LENGTH_SHORT).show();
            stopPlaying();
            media=MediaPlayer.create(getApplicationContext(),R.raw.fallo);
            media.start();
        }

    }  public void resultadotres(View v){
        if(posicion==2){
            Toast.makeText(this, "Exito", Toast.LENGTH_SHORT).show();
            stopPlaying();
            media=MediaPlayer.create(getApplicationContext(),R.raw.exito);
            media.start();
        }
        else{
            Toast.makeText(this, "Fallo", Toast.LENGTH_SHORT).show();
            stopPlaying();
            media=MediaPlayer.create(getApplicationContext(),R.raw.fallo);
            media.start();
        }

    }
    private void stopPlaying() {
        if (media != null) {
            media.stop();
            media.release();
            media = null;
        }
    }




    public void asignacionResultado(int posicion,int resultado,int resulaleat1,int resulaleat2){
//para no repetir
        while(resulaleat1==resultado){
            resulaleat1=aleatorio.nextInt(5);
        }
        while(resulaleat2==resultado || resulaleat2==resulaleat1){
            resulaleat2=aleatorio.nextInt(5);
        }

        switch (posicion){

            //primera posicion de resultados
            case 0:{

                switch (resultado){
                    case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                    // este es para la imagen 2 de los resultados
                    switch (resulaleat1){
                        case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                        case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                        case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                        case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                        case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                        case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                        case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                        case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                        case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                    }
                    // este es para la imagen 3 de los resultados
                    switch (resulaleat2){
                        case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                        case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                        case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                        case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                        case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                        case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                        case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                        case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                        case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                    }
                    break;}

                    case 1:{ imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 2:{ imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 3:{ imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 6:{ imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 7:{ imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 8:{ imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                }
                break;}







            //segunda posicion de resultados
            case 1:{

                switch (resultado){
                    case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 1:{ imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 2:{ imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 3:{ imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 6:{ imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 7:{ imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 8:{ imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                }
                break;}





            //tercera posicion de resultados
            case 2:{

                switch (resultado){
                    case 0:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }break;}

                    case 1:{ imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 2:{ imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 3:{ imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 4:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 5:{imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 6:{ imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 7:{ imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 8:{ imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }break;}
                }
            }break;}
     }
   



    public void asignacionnum1(int num1suma){

        switch (num1suma){
            case 0:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_0_t);break;
            }
            case 1:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_1_t);break;
            }
            case 2:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_2_t);break;
            }
            case 3:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_3_t);break;
            }
            case 4:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_4_t);break;
            }
            case 5:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_5_t);break;
            }
            case 6:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_6_t);break;
            }
            case 7:{imageNum1Sum.setBackgroundResource(R.drawable.animal_number_7_t);break;
            }
            case 8:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_8_t);break;
            }
            case 9:{ imageNum1Sum.setBackgroundResource(R.drawable.animal_number_9_t);break;
            }
        }
    }
    public void asignacionnum2(int num2suma){

        switch (num2suma){
            case 0:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_0_t);break;
            }
            case 1:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_1_t);break;
            }
            case 2:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_2_t);break;
            }
            case 3:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_3_t);break;
            }
            case 4:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_4_t);break;
            }
            case 5:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_5_t);break;
            }
            case 6:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_6_t);break;
            }
            case 7:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_7_t);break;
            }
            case 8:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_8_t);break;
            }
            case 9:{ imageNum2Sum.setBackgroundResource(R.drawable.animal_number_9_t);break;
            }
        }
    }

}


