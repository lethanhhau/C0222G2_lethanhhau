package com.hau.service.impl;

import com.hau.model.LoHang;
import com.hau.repository.ILoHangRepository;
import com.hau.service.ILoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoHangService implements ILoHangService {

    @Autowired
    private ILoHangRepository iLoHangRepository;


    @Override
    public Page<LoHang> findAll(Pageable pageable, String searchName) {
        return this.iLoHangRepository.findAllLoHang(pageable, "%" + searchName + "%");
    }

    @Override
    public void save(LoHang consignment) {
        this.iLoHangRepository.save(consignment);
    }

    @Override
    public void delete(Integer id) {
        this.iLoHangRepository.delete(this.iLoHangRepository.getById(id));
    }

    @Override
    public LoHang findById(Integer id) {
        return this.iLoHangRepository.findById(id).orElse(null);
    }
}
