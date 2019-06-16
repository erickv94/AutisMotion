package dev.grupo5.autismotion.Numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

import dev.grupo5.autismotion.R;





public class SumandoNumerosActivity extends AppCompatActivity {

    //generando numero aleatorios entre 0 y 9
    Random aleatorio = new Random(System.currentTimeMillis());
    int num1suma=aleatorio.nextInt(10);
    int num2suma=aleatorio.nextInt(10);

    //posiciones para resultados
    int posicion=aleatorio.nextInt(3);


    int resultado =0;
    ImageView imageNum1Sum,imageNum2Sum;
    ImageButton imageNum1ResulSuma,imageNum2ResulSuma,imageNum3ResulSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumando_numeros);
        setTitle("Sumando Numeros");
        imageNum1Sum=findViewById(R.id.imageNum1Sum);
        imageNum2Sum=findViewById(R.id.imageNum2Sum);
        imageNum1ResulSuma=findViewById(R.id.imageNum1ResulSuma);
        imageNum2ResulSuma=findViewById(R.id.imageNum2ResulSuma);
        imageNum3ResulSuma=findViewById(R.id.imageNum1ResulSuma);
        asignacionnum1(num1suma);
        asignacionnum2(num2suma);



    }

    public int sumando(int  num1suma, int num2suma){
        resultado = num1suma+num2suma;
        return resultado;
    }

    public void asignacionresultado(int posicion){
        switch (posicion){
            case 0:{
                imageNum1ResulSuma=findViewById(R.id.imageNum1ResulSuma);

                break;
            }
            case 1:{
                imageNum2ResulSuma=findViewById(R.id.imageNum2ResulSuma);


                break;
            }
            case 2:{

                imageNum3ResulSuma=findViewById(R.id.imageNum3ResulSuma);

                break;
            }

        }
    }



    public void asignacionnum1(int num1suma){

        switch (num1suma){
            case 0:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_0_t);
                break;
            }
            case 1:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_1_t);
                break;
            }
            case 2:{
                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_2_t);
                break;
            }
            case 3:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_3_t);
                break;
            }
            case 4:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_4_t);
                break;
            }
            case 5:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_5_t);
                break;
            }
            case 6:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_6_t);
                break;
            }
            case 7:{
                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_7_t);
                break;
            }
            case 8:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_8_t);
                break;
            }
            case 9:{

                imageNum1Sum.setBackgroundResource(R.drawable.animal_number_9_t);
                break;
            }
        }
    }
    public void asignacionnum2(int num2suma){

        switch (num2suma){
            case 0:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_0_t);
                break;
            }
            case 1:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_1_t);
                break;
            }
            case 2:{
                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_2_t);
                break;
            }
            case 3:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_3_t);
                break;
            }
            case 4:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_4_t);
                break;
            }
            case 5:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_5_t);
                break;
            }
            case 6:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_6_t);
                break;
            }
            case 7:{
                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_7_t);
                break;
            }
            case 8:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_8_t);
                break;
            }
            case 9:{

                imageNum2Sum.setBackgroundResource(R.drawable.animal_number_9_t);
                break;
            }
        }
    }

}


