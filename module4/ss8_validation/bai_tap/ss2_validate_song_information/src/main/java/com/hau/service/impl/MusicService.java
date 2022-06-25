package com.hau.service.impl;

import com.hau.model.Music;
import com.hau.repository.IMusicRepository;
import com.hau.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService {

    @Autowired
    private IMusicRepository iMusicRepository;

    @Override
    public Page<Music> findAll(Pageable pageable, String searchValue) {
        return this.iMusicRepository.findByKeyword(pageable, "%" + searchValue + "%");
    }

    @Override
    public void remove(Integer id) {
        this.iMusicRepository.delete(this.iMusicRepository.getById(id));
    }

    @Override
    public void save(Music music) {
        this.iMusicRepository.save(music);
    }

    @Override
    public Music getById(Integer id) {
        return this.iMusicRepository.getById(id);
    }
}
