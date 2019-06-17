package dev.grupo5.autismotion.Numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

import dev.grupo5.autismotion.R;





public class SumandoNumerosActivity extends AppCompatActivity {

    //generando numero aleatorios entre 0 y 9
    Random aleatorio = new Random(System.currentTimeMillis());
    //int num1suma=aleatorio.nextInt(10);
    //int num2suma=aleatorio.nextInt(10);
    int num1suma=aleatorio.nextInt(5);
    int num2suma=aleatorio.nextInt(5);

    //posiciones para resultados de 0 a 2
    //int posicion=aleatorio.nextInt(3);
    int posicion=0;
    int resulaleat1=aleatorio.nextInt(5);
    int resulaleat2=aleatorio.nextInt(5);



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
        imageNum3ResulSuma=findViewById(R.id.imageNum3ResulSuma);
        asignacionnum1(num1suma);
        asignacionnum2(num2suma);
        resultado=num1suma+num2suma;
        asignacionResultado(0,resultado,resulaleat1,resulaleat2);

    }
   

    public void asignacionResultado(int posicion,int resulado,int resulaleat1, int resulaleat2){
//para no repetir
        while(resulaleat1==resulado){
            resulaleat1=aleatorio.nextInt(5);
        }
        while(resulaleat2==resulado || resulaleat2==resulaleat1){
            resulaleat2=aleatorio.nextInt(5);
        }


        switch (posicion){
            case 0:{
                switch (resulado){
                    case 0:{
                        imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);


                        switch (resulaleat1){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        switch (resulaleat2){
                            case 0:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        break;
                    }

                    case 1:{
                        imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                        switch (resulaleat1){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        switch (resulaleat2){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                        switch (resulaleat1){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        switch (resulaleat2){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                        switch (resulaleat1){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        switch (resulaleat2){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        break;
                    }
                    case 4:{
                        imageNum1ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                        switch (resulaleat1){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        switch (resulaleat2){
                            case 0:{
                                imageNum2ResulSuma.setBackgroundResource(R.drawable.animal_number_0_t);
                                break;
                            }
                            case 1:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_1_t);
                                break;
                            }
                            case 2:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_2_t);
                                break;
                            }
                            case 3:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_3_t);
                                break;
                            }
                            case 4:{
                                imageNum3ResulSuma.setBackgroundResource(R.drawable.animal_number_4_t);
                                break;
                            }
                        }
                        break;
                    }

                }

                break;
            }


            case 1:{
                break;
            }
            case 2:{
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


