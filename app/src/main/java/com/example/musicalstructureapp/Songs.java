package com.example.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Songs implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Write object's data to the passed-in Parcel.
     */
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mArtist);
        parcel.writeString(mAlbum);
        parcel.writeString(mTrack);
        parcel.writeInt(mCover);
    }

    /**
     * This is used to regenerate the object.
     */
    public static final Parcelable.Creator<Songs> CREATOR = new Parcelable.Creator<Songs>() {
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        public Songs[] newArray(int size) {
            return new Songs[size];
        }
    };

    private Songs(Parcel in) {
        mArtist = in.readString();
        mAlbum = in.readString();
        mTrack = in.readString();
        mCover = in.readInt();
    }
}
