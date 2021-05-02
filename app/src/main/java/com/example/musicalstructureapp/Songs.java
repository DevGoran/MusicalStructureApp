package com.example.musicalstructureapp;

public class Songs {

    /**
     * Artist's name.
     */
    private String mArtist;

    /**
     * Album name.
     */
    private String mAlbum;

    /**
     * Track name.
     */
    private String mTrack;

    /**
     * Track name.
     */
    private int mCover;

    /**
     * Create a new Song object.
     *
     * @param artist is the artist's name.
     * @param album  is the name of the album.
     * @param track  is the name of the track.
     */
    public Songs(String artist, String album, String track, int cover) {
        mArtist = artist;
        mAlbum = album;
        mTrack = track;
        mCover = cover;
    }

    /**
     * Get the artist's name.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the album name.
     */
    public String getAlbum() {
        return mAlbum;
    }

    /**
     * Get the track name.
     */
    public String getTrack() {
        return mTrack;
    }

    /**
     * Get the cover of the album.
     */
    public int getCover() {
        return mCover;
    }

}
