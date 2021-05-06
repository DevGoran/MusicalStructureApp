package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlayerActivity extends TracksActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        // Get the passed intent extra.
        Intent passedIntent = getIntent();
        Songs song = (Songs) passedIntent.getParcelableExtra("song");

        // Look for views to set the values of the currently playing song.
        TextView currentArtist = findViewById(R.id.currentArtistName_text_view);
        TextView currentTrack = findViewById(R.id.currentTrackName_text_view);
        TextView currentAlbum = findViewById(R.id.currentAlbumName_text_view);
        ImageView currentCover = findViewById(R.id.currentAlbumCover_image_view);

        // Set the cover, album, artist and track name of the currently playing song.
        currentArtist.setText(song.getArtist());
        currentTrack.setText(song.getTrack());
        currentAlbum.setText(song.getAlbum());
        currentCover.setImageResource(song.getCover());

    }
}
