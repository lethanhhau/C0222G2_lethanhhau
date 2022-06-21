package com.hau.model;

import javax.persistence.*;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_of_the_song")
    private String nameOfTheSong;
    @Column(name = "performing_artist")
    private String performingArtist;
    @Column(name = "kind_of_music")
    private String kindOfMusic;
    @Column(name = "song_file_path")
    private String songFilePath;

    public Music() {
    }

    public Music(Integer id, String nameOfTheSong, String performingArtist, String kindOfMusic, String songFilePath) {
        this.id = id;
        this.nameOfTheSong = nameOfTheSong;
        this.performingArtist = performingArtist;
        this.kindOfMusic = kindOfMusic;
        this.songFilePath = songFilePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfTheSong() {
        return nameOfTheSong;
    }

    public void setNameOfTheSong(String nameOfTheSong) {
        this.nameOfTheSong = nameOfTheSong;
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

    public String getSongFilePath() {
        return songFilePath;
    }

    public void setSongFilePath(String songFilePath) {
        this.songFilePath = songFilePath;
    }
}
