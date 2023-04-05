package com.hau.repository;

import com.hau.model.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ISanPhamRepository extends JpaRepository<SanPham, Integer> {

    @Query(value = "select san_pham.* from san_pham " +
            " where san_pham.ten_san_pham like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select lo_hang.* from lo_hang " +
                    " where san_pham.ten_san_pham like :searchName ) temp_table")
    Page<SanPham> getAll(Pageable pageable, String searchName);
}
