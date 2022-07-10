package com.hau.service.position;

import com.hau.model.employee.Position;
import com.hau.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService implements IPositionService{

    @Autowired
    private IPositionRepository iPositionRepository;


    @Override
    public List<Position> findAllPosition() {
        return this.iPositionRepository.findAll();
    }
}
