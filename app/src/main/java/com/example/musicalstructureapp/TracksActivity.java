package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        // New list of songs
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_one), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_two), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_three), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_four), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_five), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_six), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_seven), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_eight), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_nine), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_ten), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_eleven), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_twelve), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_thirteen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_fourteen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_fifteen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_sixteen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_seventeen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_eighteen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_nineteen), R.drawable.cover_sample));
        songs.add(new Songs(getString(R.string.NF), getString(R.string.the_search), getString(R.string.track_twenty), R.drawable.cover_sample));

        // Create an SongAdapter, whose data source is a list of Songs. The adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called activity_tracks_list_view, which is declared in the
        // activity_tracks.xml layout file.
        ListView listView = findViewById(R.id.activity_tracks_list_view);

        // Make the ListView use the SongAdapter we created above, so that the
        // ListView will display list items for each Songs in the list.
        listView.setAdapter(adapter);

        // Opens new Activity on click and passes clicked object to MusicPlayerActivity.
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent openPlayer = new Intent(TracksActivity.this, MusicPlayerActivity.class);
            openPlayer.putExtra("song", songs.get(position));
            startActivity(openPlayer);
        });

    }
}
