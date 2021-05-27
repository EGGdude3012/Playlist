package com.playlistprogra;

public class MusicLibrary 
{
    int id;
    String audioFile;
    String picture;
    String songTitle;
    String artist;
    
    public MusicLibrary(int id, String audioFile, String picture, String songTitle, String artist) 
    {
        super();
        this.id = id;
        this.audioFile = audioFile;
        this.picture = picture;
        this.songTitle = songTitle;
        this.artist = artist;
    }
    
    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getAudioFile() {
        return audioFile;
    }



    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }



    public String getPicture() {
        return picture;
    }



    public void setPicture(String picture) {
        this.picture = picture;
    }



    public String getSongTitle() {
        return songTitle;
    }



    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }



    public String getArtist() {
        return artist;
    }



    public void setArtist(String artist) {
        this.artist = artist;
    }

        
}
