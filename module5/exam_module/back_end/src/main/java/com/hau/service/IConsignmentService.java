package com.hau.service;

import com.hau.model.Consignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IConsignmentService {
    Page<Consignment> findAllConsignment(Pageable pageable, String searchProductName);

    void saveConsignment(Consignment consignment);

    void deleteConsignment(Integer id);

    Consignment findById(Integer id);
}
