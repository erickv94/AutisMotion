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





public class RestandoNumerosActivity extends AppCompatActivity {


    //imagenes numeros
    ImageView imageNum1Res,imageNum2Res;
    //botones imagenes respuesta
    ImageButton imageNum1ResulResta,imageNum2ResulResta,imageNum3ResulResta;
    //resultado suma
    int resultado =0;

    //generando dos numeros aleatorios entre 0 y 4 para realizar suma
    Random aleatorio = new Random(System.currentTimeMillis());
    int num1resta=aleatorio.nextInt(5);
    int num2resta=aleatorio.nextInt(5);

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
        setContentView(R.layout.activity_restando_numeros);
        setTitle("Restando Numeros");

        imageNum1Res=findViewById(R.id.imageNum1Res);
        imageNum2Res=findViewById(R.id.imageNum2Res);
        imageNum1ResulResta=findViewById(R.id.imageNum1ResulResta);
        imageNum2ResulResta=findViewById(R.id.imageNum2ResulResta);
        imageNum3ResulResta=findViewById(R.id.imageNum3ResulResta);

        //asignacion numero uno y dos para sumar con su respectiva imagen

        //realizando resta de aleatorios
        while(num1resta<num2resta){
            num2resta = aleatorio.nextInt(5);
        }
        asignacionnum1(num1resta);
        asignacionnum2(num2resta);
        resultado = num1resta - num2resta;

        //asignar resultados a los botones.
        asignacionResultado(posicion,resultado,resulaleat1,resulaleat2);

        Button btrestar = (Button) findViewById(R.id.btnDeNuevo2);
        btrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RestandoNumerosActivity.class);
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
                    case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 1:{ imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 2:{ imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 3:{ imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 6:{ imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 7:{ imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 8:{ imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                }
                break;}







            //segunda posicion de resultados
            case 1:{

                switch (resultado){
                    case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 1:{ imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 2:{ imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 3:{ imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 6:{ imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 7:{ imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 8:{ imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                }
                break;}





            //tercera posicion de resultados
            case 2:{

                switch (resultado){
                    case 0:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }break;}

                    case 1:{ imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 2:{ imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 3:{ imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}

                    case 4:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 5:{imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 6:{ imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){
                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 7:{ imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        break;}
                    case 8:{ imageNum3ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);
                        // este es para la imagen 2 de los resultados
                        switch (resulaleat1){
                            case 0:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum1ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }
                        // este es para la imagen 3 de los resultados
                        switch (resulaleat2){

                            case 0:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_0_t);break;}
                            case 1:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_1_t);break;}
                            case 2:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_2_t);break;}
                            case 3:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_3_t);break;}
                            case 4:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_4_t);break;}
                            case 5:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_5_t);break;}
                            case 6:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_6_t);break;}
                            case 7:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_7_t);break;}
                            case 8:{imageNum2ResulResta.setBackgroundResource(R.drawable.animal_number_8_t);break;}
                        }break;}
                }
            }break;}
    }




    public void asignacionnum1(int num1resta){


        switch (num1resta){
            case 0:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_0_t);break;
            }
            case 1:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_1_t);break;
            }
            case 2:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_2_t);break;
            }
            case 3:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_3_t);break;
            }
            case 4:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_4_t);break;
            }
            case 5:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_5_t);break;
            }
            case 6:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_6_t);break;
            }
            case 7:{imageNum1Res.setBackgroundResource(R.drawable.animal_number_7_t);break;
            }
            case 8:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_8_t);break;
            }
            case 9:{ imageNum1Res.setBackgroundResource(R.drawable.animal_number_9_t);break;
            }
        }
    }
    public void asignacionnum2(int num2resta){


        switch (num2resta){
            case 0:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_0_t);break;
            }
            case 1:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_1_t);break;
            }
            case 2:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_2_t);break;
            }
            case 3:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_3_t);break;
            }
            case 4:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_4_t);break;
            }
            case 5:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_5_t);break;
            }
            case 6:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_6_t);break;
            }
            case 7:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_7_t);break;
            }
            case 8:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_8_t);break;
            }
            case 9:{ imageNum2Res.setBackgroundResource(R.drawable.animal_number_9_t);break;
            }
        }
    }

}
