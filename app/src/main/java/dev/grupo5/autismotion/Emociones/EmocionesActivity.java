package dev.grupo5.autismotion.Emociones;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import dev.grupo5.autismotion.R;

public class EmocionesActivity extends AppCompatActivity {

    private TextView contadorLabel;
    private ImageView imagenPregunta;
    private ImageView Btn1;
    private ImageView Btn2;
    private ImageView Btn3;

    private String respuestaCorrecta;
    private int contadorRespuestasCorrectas = 0;
    private int contadorPregunta = 1;

    ArrayList<ArrayList<String>> preguntasArray = new ArrayList<>();

    String Datos[][] = {
            {"boyhappy", "Feliz"},
            {"womanangry", "Enojado"},
            {"mansad", "Triste"},
            {"oldmanhappy", "Feliz"},
            {"oldmanangry", "Enojado"},
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emociones);
        contadorLabel = findViewById(R.id.countLabel);
        imagenPregunta = findViewById(R.id.questionImage);
        Btn1 = findViewById(R.id.btn1);
        Btn2 = findViewById(R.id.btn2);
        Btn3 = findViewById(R.id.btn3);

        for (int i = 0; i < Datos.length; i++) {

            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(Datos[i][0]); // Imagen
            tmpArray.add(Datos[i][1]); // respuesta correcta


            preguntasArray.add(tmpArray);
        }

        mostrarSiguiente();

    }

    public void mostrarSiguiente() {


        contadorLabel.setText("Pregunta: " + contadorPregunta);

        Random random = new Random();
        int randomNum = random.nextInt(preguntasArray.size());


        ArrayList<String> pregunta = preguntasArray.get(randomNum);


        imagenPregunta.setImageResource(
                getResources().getIdentifier(pregunta.get(0), "drawable", getPackageName()));
        respuestaCorrecta = pregunta.get(1);

        pregunta.remove(0);
        Collections.shuffle(pregunta);


        preguntasArray.remove(randomNum);

    }

    public void chequearEmocion(View v){

        ImageView btn = findViewById(v.getId());
        String txt=v.getTag().toString();

        String alertTitle;

        if (txt.equals(respuestaCorrecta)) {
            alertTitle = "Correcto!";
            contadorRespuestasCorrectas++;

        } else {
            alertTitle = "Incorrecto...";
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Respuesta : " + respuestaCorrecta);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (preguntasArray.size() < 1) {
                    //cuando se termina el array
                    showResult();

                } else {
                    contadorPregunta++;
                    mostrarSiguiente();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();
    }


    public void showResult() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Resultado");
        builder.setMessage(contadorRespuestasCorrectas + " / 5");
        builder.setPositiveButton("Intentar de nuevo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                recreate();
            }
        });
        builder.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.show();
    }

}
