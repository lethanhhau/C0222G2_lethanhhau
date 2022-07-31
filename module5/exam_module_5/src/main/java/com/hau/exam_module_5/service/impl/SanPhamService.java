package com.hau.exam_module_5.service.impl;

import com.hau.exam_module_5.model.SanPham;
import com.hau.exam_module_5.repository.ISanPhamRepository;
import com.hau.exam_module_5.service.ISanPhamService;
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
