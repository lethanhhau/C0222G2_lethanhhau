package com.hau.exam_module_5.service.impl;

import com.hau.exam_module_5.model.Consignment;
import com.hau.exam_module_5.repository.IConsignmentRepository;
import com.hau.exam_module_5.service.IConsignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsignmentService implements IConsignmentService {

    @Autowired
    private IConsignmentRepository iConsignmentRepository;


    @Override
    public List<Consignment> findAll() {
        return this.iConsignmentRepository.findAll();
    }

    @Override
    public void save(Consignment consignment) {
        this.iConsignmentRepository.save(consignment);
    }

    @Override
    public void delete(Integer id) {
        this.iConsignmentRepository.delete(this.iConsignmentRepository.getById(id));
    }

    @Override
    public Consignment findById(Integer id) {
        return this.iConsignmentRepository.findById(id).orElse(null);
    }
}
