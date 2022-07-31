package com.hau.exam_module_5.service;

import com.hau.exam_module_5.model.LoHang;

import java.util.List;

public interface ILoHangService {
    List<LoHang> findAll();

    void save(LoHang consignment);

    void delete(Integer id);

    LoHang findById(Integer id);
}
