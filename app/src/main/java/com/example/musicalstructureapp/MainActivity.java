package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tracksList = findViewById(R.id.all_your_tracks_text_view);
        tracksList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the tracks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TracksActivity}
                Intent allTracksIntent = new Intent(MainActivity.this, TracksActivity.class);

                // Start the new activity
                startActivity(allTracksIntent);
            }
        });
    }
}