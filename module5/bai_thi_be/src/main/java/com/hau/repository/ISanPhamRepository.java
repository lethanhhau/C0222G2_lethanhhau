package com.hau.repository;

import com.hau.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISanPhamRepository extends JpaRepository<SanPham,Integer> {
}
