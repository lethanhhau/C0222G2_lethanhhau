package com.hau.exam_module_5.service;

import com.hau.exam_module_5.model.Consignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface IConsignmentService {
    List<Consignment> findAll();

    void save(Consignment consignment);

    void delete(Integer id);

    Consignment findById(Integer id);
}
