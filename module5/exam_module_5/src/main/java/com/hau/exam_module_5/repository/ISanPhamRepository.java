package com.hau.exam_module_5.repository;

import com.hau.exam_module_5.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISanPhamRepository extends JpaRepository<SanPham,Integer> {
}
