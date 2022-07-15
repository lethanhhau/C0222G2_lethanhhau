package com.hau.service.impl;

import com.hau.model.PhongTro;
import com.hau.repository.IPhongTroRepository;
import com.hau.service.IPhongTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongTroService implements IPhongTroService {
    @Autowired
    private IPhongTroRepository iPhongTroRepository;

    @Override
    public List<PhongTro> findAll() {
        return this.iPhongTroRepository.findAll();
    }
}
