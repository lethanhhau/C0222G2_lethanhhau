package com.hau.service;

import com.hau.model.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBillService {
    Page<Bill> getAll(Pageable pageable, String searchCode, String searchDate);

    Bill findById(Integer id);

}
