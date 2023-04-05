package com.hau.service;

import com.hau.model.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISanPhamService {

    Page<SanPham> getAllSanPham(Pageable pageable, String searchName);

    SanPham findById(Integer id);

    void remove(Integer id);

    void save(SanPham sanPham);
}
