package com.hau.repository;

import com.hau.model.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrafficRepository extends JpaRepository<Traffic, Integer> {
}
