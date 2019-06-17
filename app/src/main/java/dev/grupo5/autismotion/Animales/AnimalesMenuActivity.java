package dev.grupo5.autismotion.Animales;

import android.app.Service;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import dev.grupo5.autismotion.R;

public class AnimalesMenuActivity extends AppCompatActivity {

    MediaPlayer reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_menu);
        reproductor=MediaPlayer.create(getApplicationContext(), R.raw.sonidofondoanimales);
        reproductor.start();

        //Solo permite la orientacion vertical en la pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button btnanimales = (Button) findViewById(R.id.animales);
        btnanimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AnimalesActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button btnvideo = (Button) findViewById(R.id.cuento);
        btnvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),CuentoActivity.class);
                startActivityForResult(intent,0);
            }
        });
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
