package com.hau.service.impl;

import com.hau.model.Consignment;
import com.hau.repository.IConsignmentRepository;
import com.hau.service.IConsignmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ConsignmentService implements IConsignmentService {

    private IConsignmentRepository iConsignmentRepository;

    @Override
    public Page<Consignment> findAllConsignment(Pageable pageable, String searchProductName) {
        return this.iConsignmentRepository.findAllConsignment(pageable, "%" + searchProductName + "%");
    }

    @Override
    public void saveConsignment(Consignment consignment) {
        this.iConsignmentRepository.save(consignment);
    }

    @Override
    public void deleteConsignment(Integer id) {
        this.iConsignmentRepository.delete(this.iConsignmentRepository.getById(id));
    }

    @Override
    public Consignment findById(Integer id) {
        return this.iConsignmentRepository.findById(id).orElse(null);
    }
}
