package dev.grupo5.autismotion;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import dev.grupo5.autismotion.Emociones.EmocionesActivity;
import dev.grupo5.autismotion.Numeros.MenuNumerosActivity;

public class MainActivity extends AppCompatActivity {

    String[] menu={"Menu Matematicas","Menu Emociones"};

    String [] activities={"MenuNumerosActivity","EmocionesMenuActivity"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        if(position!=3){
            String nombreValue=activities[position];
            try{
                Class<?> clase=Class.forName("dev.grupo5.autismotion.Numeros."+nombreValue);
                Intent inte = new Intent(this,clase);
                this.startActivity(inte);
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }

            try{
                Class<?> clase=Class.forName("dev.grupo5.autismotion.Emociones."+nombreValue);
                Intent inte = new Intent(this,clase);
                this.startActivity(inte);
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }else{
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
        Intent intent= new Intent(MainActivity.this, EmocionesActivity.class);
        startActivity(intent);

    }

}

