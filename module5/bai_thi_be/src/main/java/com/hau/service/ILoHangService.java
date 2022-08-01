package com.hau.service;

import com.hau.model.LoHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ILoHangService {
    Page<LoHang> findAll(Pageable pageable, String searchName);

    void save(LoHang consignment);

    void delete(Integer id);

    LoHang findById(Integer id);
}
