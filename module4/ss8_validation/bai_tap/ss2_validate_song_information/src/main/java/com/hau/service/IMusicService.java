package com.hau.service;

import com.hau.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMusicService {

    Page<Music> findAll(Pageable pageable, String searchValue);

    void remove(Integer id);

    void save(Music music);

    Music getById(Integer id);
}
