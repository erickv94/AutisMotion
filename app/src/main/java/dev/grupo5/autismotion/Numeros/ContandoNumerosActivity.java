package dev.grupo5.autismotion.Numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import dev.grupo5.autismotion.R;

public class ContandoNumerosActivity extends AppCompatActivity {
    ImageView imagennumero;
    ImageButton derecha,izquierda,sonido;
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
