package dev.grupo5.autismotion.Animales;

import android.app.Activity;
import android.arch.core.executor.TaskExecutor;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import dev.grupo5.autismotion.R;

public class AnimalesActivity extends Activity {
    String[] nombresAnimales={"mono","tucan","tortuga","jirafa","elefante","caballo","cerdo","mariposa"};
    String[] siluetasAnimales={"s_mono","s_tucan","s_tortuga","s_jirafa","s_elefante","s_caballo","s_cerdo","s_mariposa"};
    Integer intentos=3;
    Button btnAceptar;
    TextView lblIntentos;
    TextView lblConteo;
    EditText editNombre;
    private int numeroGenerado=0;
    ImageView imagen;
    MediaPlayer reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);

        reproductor=MediaPlayer.create(getApplicationContext(), R.raw.sonidofondoanimales);
        reproductor.start();

        //Solo permite la orientacion vertical en la pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btnAceptar=findViewById(R.id.btnAceptar);
        lblIntentos=findViewById(R.id.lblIntentos);
        lblConteo=findViewById(R.id.lblConteo);
        editNombre=findViewById(R.id.editNombre);
        imagen=findViewById(R.id.imageView);
        numeroGenerado=generarAleatorio();
        establecerSilueta(numeroGenerado);
        lblIntentos.setText("Tiene "+ intentos +" intentos");

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre=editNombre.getText().toString().toLowerCase();

                if (nombre.equals(nombresAnimales[numeroGenerado])){
                   establecerAnimal(numeroGenerado);
                   esperar();
                }else {
                    Toast.makeText(getApplicationContext(),"No es el animal correcto",Toast.LENGTH_SHORT).show();
                    intentos=intentos-1;
                    lblIntentos.setText("Tiene "+ intentos +" intentos");
                }
                if (intentos==0){
                    finish();
                    Toast.makeText(getApplicationContext(),"Vuelve a intentarlo",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    protected void establecerSilueta(int numero){
        int resId=getResources().getIdentifier(siluetasAnimales[numero],"drawable",getPackageName());
        imagen.setImageResource(resId);
    }
    protected void establecerAnimal(int numero){
        int resId=getResources().getIdentifier(nombresAnimales[numero],"drawable",getPackageName());
        imagen.setImageResource(resId);
    }

    protected int generarAleatorio(){
        return (int)(Math.random()*nombresAnimales.length);
    }

    public void esperar(){
        new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                lblConteo.setText("Generando nuevo animal en: "+(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                numeroGenerado=generarAleatorio();
                establecerSilueta(numeroGenerado);
                lblConteo.setText("");
                editNombre.setText("");

            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (reproductor.isPlaying()) {
            reproductor.stop();
            reproductor.release();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        reproductor.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        reproductor.pause();
    }


}