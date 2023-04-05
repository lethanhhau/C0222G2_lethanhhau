package com.hau.service.impl;

import com.hau.model.Bill;
import com.hau.repository.IBillRepository;
import com.hau.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BillService implements IBillService {

    @Autowired
    public IBillRepository iBillRepository;

    @Override
    public Page<Bill> getAll(Pageable pageable, String searchCode, String searchDate) {
        return this.iBillRepository.getAllBill(pageable, "%" + searchCode + "%", "%" + searchDate + "%");
    }

    @Override
    public Bill findById(Integer id) {
        return this.iBillRepository.getByIdBill(id);
    }


}
