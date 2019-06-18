package dev.grupo5.autismotion.Videos;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import dev.grupo5.autismotion.R;

public class ListaVideosActivity extends ListActivity {
    String [] menu = {"aprende a contar hasta 9","Animales de la granja","La liebre y la tortuga","El leon y el raton"};
    String [] videoID = {"4ecWaNBuMew","PveUz107GMs","js1lKmt-Mag","k27Gt4Whlto"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        listView.setBackgroundResource(R.drawable.fondomenu);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        String Value=videoID[position];
        l.getChildAt(position).setBackgroundColor(Color.rgb(128, 128, 255));
        try{
            Class<?> clase=Class.forName("dev.grupo5.autismotion.Videos.videosActivity");
            Intent intent = new Intent(v.getContext(),videosActivity.class);
            intent.putExtra("id",Value);
            this.startActivity(intent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
