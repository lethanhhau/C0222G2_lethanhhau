package com.hau.exam_module_5.service.impl;

import com.hau.exam_module_5.model.LoHang;
import com.hau.exam_module_5.repository.ILoHangRepository;
import com.hau.exam_module_5.service.ILoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoHangService implements ILoHangService {

    @Autowired
    private ILoHangRepository iLoHangRepository;

    @Override
    public List<LoHang> findAll() {
        return this.iLoHangRepository.findAll();
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
