package com.hau.service.impl;

import com.hau.model.SanPham;
import com.hau.repository.ISanPhamRepository;
import com.hau.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService implements ISanPhamService {
    @Autowired
    private ISanPhamRepository iSanPhamRepository;
    @Override
    public List<SanPham> findAll() {
        return iSanPhamRepository.findAll();
    }
}
