package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.activity_tracks_list_view);

        listView.setAdapter(adapter);

    }
    // TODO: Create an ArrayList of Songs objects and add it to R.id.activity_tracks_list_view ListView in activity_tracks.

}
