package com.hau.service;

import com.hau.model.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IHopDongService {

    Optional<HopDong> findById(Integer id);

    HopDong save(HopDong hopDong);

    void remove(Integer id);

    List<HopDong> findAll();
}
