package dev.grupo5.autismotion.Videos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import dev.grupo5.autismotion.R;

public class videosActivity extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        final String videoId = getIntent().getStringExtra("id");
        Button buttonPlay = findViewById(R.id.buttonPlay);
        final YouTubePlayerView youtubePlayerView = findViewById(R.id.youtubePlayerView);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                playVideo(videoId, youtubePlayerView);
            }
        });
    }
    public void playVideo(final String videoId, YouTubePlayerView youTubePlayerView) {
        //initialize youtube player view
        youTubePlayerView.initialize("AIzaSyCrH1UsQtuqmfPmf-aW66abeMklAPnxTc0",
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.cueVideo(videoId);
                    }
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,YouTubeInitializationResult youTubeInitializationResult) {
                    }
                });
    }
}
