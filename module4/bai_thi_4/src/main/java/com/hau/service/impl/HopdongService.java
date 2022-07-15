package com.hau.service.impl;

import com.hau.model.HopDong;
import com.hau.repository.IHopDongRepository;
import com.hau.service.IHopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HopdongService implements IHopDongService {
    @Autowired
    private IHopDongRepository iHopDongRepository;

    @Override
    public Optional<HopDong> findById(Integer id) {
        return this.iHopDongRepository.findById(id);
    }

    @Override
    public HopDong save(HopDong hopDong) {
        return this.iHopDongRepository.save(hopDong);
    }

    @Override
    public void remove(Integer id) {
        this.iHopDongRepository.delete(this.iHopDongRepository.getById(id));
    }

    @Override
    public List<HopDong> findAll() {
        return this.iHopDongRepository.findAll();
    }
}
