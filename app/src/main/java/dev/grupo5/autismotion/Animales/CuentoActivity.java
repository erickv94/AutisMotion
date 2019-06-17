package dev.grupo5.autismotion.Animales;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


import java.io.File;

import dev.grupo5.autismotion.R;

public class CuentoActivity extends AppCompatActivity {
    VideoView video;
    MediaController mediacontrol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuento);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        video=(VideoView) findViewById(R.id.video);
        String videopath="android.resource://"+getPackageName()+"/"+R.raw.cuento03;
        Uri uri=Uri.parse(videopath);
        video.setVideoURI(uri);
        mediacontrol=new MediaController(this);
        video.setMediaController(mediacontrol);
        mediacontrol.setAnchorView(video);


}

}
