package dev.grupo5.autismotion;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import dev.grupo5.autismotion.Animales.AnimalesActivity;
import dev.grupo5.autismotion.Emociones.EmocionesActivity;
import dev.grupo5.autismotion.Numeros.MenuNumerosActivity;

public class MainActivity extends AppCompatActivity {

    String[] menu={"Menu Matematicas","Menu Animales"};

    String [] activities={"MenuNumerosActivity","AnimalesMenuActivity"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void matematicaOption(View view){
        Intent intent= new Intent(MainActivity.this, MenuNumerosActivity.class);
        startActivity(intent);

    }

    public void emocionesOption(View view){
        Intent intent= new Intent(MainActivity.this, EmocionesActivity.class);
        startActivity(intent);

    }

    public void animalesOption(View view){
        //cambiar activitygit
        Intent intent= new Intent(MainActivity.this, AnimalesActivity.class);
        startActivity(intent);

    }

}

