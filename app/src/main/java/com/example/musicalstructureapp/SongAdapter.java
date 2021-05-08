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

    /**
     * ViewHolder class.
     */
    static class ViewHolder {
        private TextView trackName;
        private TextView artistName;
        private TextView albumName;
        private ImageView cover;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        // Check if an existing view is being reused, otherwise inflate the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tracks_layout, parent, false);
            holder = new ViewHolder();
            holder.trackName = convertView.findViewById(R.id.track_name_track_overview);
            holder.artistName = convertView.findViewById(R.id.artist_name_track_overview);
            holder.albumName = convertView.findViewById(R.id.album_name_track_overview);
            holder.cover = convertView.findViewById(R.id.cover_track_overview);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the Songs object located at this position in the list
        Songs currentSong = getItem(position);

        // Get the track name from the currentSong object and set it.
        holder.trackName.setText(currentSong.getTrack());

        // Get the artist name from the currentSong object and set it.
        holder.artistName.setText(currentSong.getArtist());

        // Get the album name from the currentSong object and set it.
        holder.albumName.setText(currentSong.getAlbum());

        // Get the cover from the currentSong object and set it.
        holder.cover.setImageResource(currentSong.getCover());

        // Return the whole layout (containing 3 TextViews and 1 ImageView) so that it can be shown in the ListView.
        return convertView;
    }
}
