package com.pluralsight;

public class Song {

    //    Add Data Fields
    private String title;
    private String artist;
    private String genre;
    private long streamCount;

    //    Generate Constructor
    public Song(String title, String artist, String genre, long streamCount) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.streamCount = streamCount;
    }

    //    Generate Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public long getStreamCount() {
        return streamCount;
    }
}
