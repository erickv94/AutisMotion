package dev.grupo5.autismotion.Animales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import dev.grupo5.autismotion.R;

public class AnimalesMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_menu);



        Button btnanimales = (Button) findViewById(R.id.animales);
        btnanimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AnimalesActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
