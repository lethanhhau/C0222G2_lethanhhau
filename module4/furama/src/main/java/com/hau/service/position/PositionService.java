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
    public Page<Position> findAll(Pageable pageable, String searchValue) {
        return this.iPositionRepository.findByNamePosition(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<Position> findById(Integer id) {
        return this.iPositionRepository.findById(id);
    }

    @Override
    public void save(Position position) {
        this.iPositionRepository.save(position);
    }

    @Override
    public void remove(Integer id) {
        this.iPositionRepository.delete(this.iPositionRepository.getById(id));
    }

    @Override
    public List<Position> findAllPosition() {
        return this.iPositionRepository.findAll();
    }
}
