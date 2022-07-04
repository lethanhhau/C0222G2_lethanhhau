package com.hau.repository;

import com.hau.model.customer.CustomerType;
import com.hau.model.employee.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPositionRepository extends JpaRepository<Position, Integer> {
    @Query(value = " select * from position where position_name like :searchValue", nativeQuery = true)
    Page<Position> findByNamePosition(Pageable pageable, @Param("searchValue") String searchValue);
}
