package com.hau.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class MusicDto implements Validator {

    private Integer id;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 500)
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Name invalid")
    private String nameOfTheSong;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Singer invalid")
    private String performingArtist;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 1000)
    @Pattern(regexp = "^[a-zA-Z0-9, ]+$", message = "Genre invalid")
    private String kindOfMusic;
    private String songFilePath;

    public MusicDto() {
    }

    public MusicDto(Integer id, String nameOfTheSong, String performingArtist, String kindOfMusic, String songFilePath) {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        MusicDto musicDto = (MusicDto)target;
    }
}
