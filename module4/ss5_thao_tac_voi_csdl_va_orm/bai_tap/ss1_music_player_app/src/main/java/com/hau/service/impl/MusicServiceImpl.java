package com.hau.service.impl;

import com.hau.model.Music;
import com.hau.repository.IMusicRepository;
import com.hau.repository.impl.MusicRepositoryImpl;
import com.hau.service.IMusicService;

import java.util.List;

public class MusicServiceImpl implements IMusicService {
    private IMusicRepository iMusicRepository = new MusicRepositoryImpl();

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public Music findById(int id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void update(Music music) {
        iMusicRepository.update(music);
    }

    @Override
    public void remove(int id) {
        iMusicRepository.remove(id);
    }
}
