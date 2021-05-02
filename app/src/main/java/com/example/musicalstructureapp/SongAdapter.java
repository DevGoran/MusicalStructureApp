package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {
    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of {@link Songs}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tracks_layout, parent, false);
        }

        // Get the {@link Songs} object located at this position in the list
        Songs currentSong = getItem(position);

        // Find the TextView in the tracks_layout.xml layout with the ID track_name_track_overview.
        TextView trackName = (TextView) listItemView.findViewById(R.id.track_name_track_overview);
        // Get the track name from the currentSong object and set it.
        trackName.setText(currentSong.getTrack());

        // Find the TextView in the tracks_layout.xml layout with the ID artist_name_track_overview.
        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name_track_overview);
        // Get the artist name from the currentSong object and set it.
        artistName.setText(currentSong.getArtist());

        // Find the TextView in the tracks_layout.xml layout with the ID album_name_track_overview.
        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name_track_overview);
        // Get the album name from the currentSong object and set it.
        albumName.setText(currentSong.getAlbum());

        // Find the TextView in the tracks_layout.xml layout with the ID cover_track_overview.
        ImageView cover = (ImageView) listItemView.findViewById(R.id.cover_track_overview);
        // Get the cover from the currentSong object and set it.
        cover.setImageResource(currentSong.getCover());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
