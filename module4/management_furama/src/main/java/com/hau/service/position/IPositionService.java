package com.hau.service.position;

import com.hau.model.employee.Position;
import com.hau.service.IGeneralService;

import java.util.List;

public interface IPositionService extends IGeneralService<Position> {
    List<Position> findAllPosition();
}
