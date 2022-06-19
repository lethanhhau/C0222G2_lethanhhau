package com.hau.model;

public class UploadMusic {
    private String name;
    private  String performingArtist;
    private String kindOfMusic;
    private String link;

    public UploadMusic() {
    }

    public UploadMusic(String name, String performingArtist, String kindOfMusic, String link) {
        this.name = name;
        this.performingArtist = performingArtist;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformingArtist() {
        return performingArtist;
    }

    public void setPerformingArtist(String performingArtist) {
        this.performingArtist = performingArtist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
