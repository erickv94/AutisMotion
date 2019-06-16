package dev.grupo5.autismotion.Numeros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dev.grupo5.autismotion.R;

public class MenuNumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_numeros);

        Button btnsumar = (Button) findViewById(R.id.sumando);
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SumandoNumerosActivity.class);
                startActivityForResult(intent,0);
            }
        });


        Button btnrestar = (Button) findViewById(R.id.restando);
        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RestandoNumerosActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button btnnumeros = (Button) findViewById(R.id.Numeros);
        btnnumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ContandoNumerosActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }


}
