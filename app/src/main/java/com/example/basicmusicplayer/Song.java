package com.example.basicmusicplayer;

/**
 * Created by ndaje on 12/14/2016.
 */
public class Song {
 private long id;
 private String title;
 private String artist;
 private long duration;


    public Song (long songId, String songTitle, String songArtist, long songDuration){
        id= songId;
        title = songTitle;
        artist = songArtist;
        duration = songDuration;

    }

    public long getDuration() {
        return duration;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
