package com.hau.service.impl;

import com.hau.model.SanPham;
import com.hau.repository.ISanPhamRepository;
import com.hau.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService implements ISanPhamService {

    @Autowired
    private ISanPhamRepository iSanPhamRepository;

    @Override
    public Page<SanPham> getAllSanPham(Pageable pageable, String searchName) {
        return this.iSanPhamRepository.getAll(pageable,  "%" + searchName + "%" );
    }

    @Override
    public SanPham findById(Integer id) {
        return this.iSanPhamRepository.getById(id);
    }

    @Override
    public void remove(Integer id) {
        this.iSanPhamRepository.delete(this.iSanPhamRepository.getById(id));
    }

    @Override
    public void save(SanPham sanPham) {
        this.iSanPhamRepository.save(sanPham);
    }
}
