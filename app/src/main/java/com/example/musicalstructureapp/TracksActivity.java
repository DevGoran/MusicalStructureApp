package com.example.musicalstructureapp;

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
        songs.add(new Songs("NF", "The Search", "The Search", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Leave Me Alone", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Change", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "My Stress", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "My Stress", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Time", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Returns", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "When I Grow Up", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Only (feat. Sasha Sloan)", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Let Me Go", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "-Interlude-", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Hate Myself", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "I Miss the Days", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "No Excuses", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Like This", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Options", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Why", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Thinking", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Trauma", R.drawable.cover_sample));
        songs.add(new Songs("NF", "The Search", "Time (edit)", R.drawable.cover_sample));

        // Create an SongAdapter, whose data source is a list of Songs. The adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called activity_tracks_list_view, which is declared in the
        // activity_tracks.xml layout file.
        ListView listView = findViewById(R.id.activity_tracks_list_view);

        // Make the ListView use the SongAdapter we created above, so that the
        // ListView will display list items for each Songs in the list.
        listView.setAdapter(adapter);

    }
}
