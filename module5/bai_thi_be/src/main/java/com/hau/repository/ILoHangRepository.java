package com.hau.repository;

import com.hau.model.LoHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ILoHangRepository extends JpaRepository<LoHang, Integer> {

    @Query(value = "select lo_hang.* from lo_hang " +
            " join san_pham on san_pham.id = lo_hang.san_pham_id " +
            " where san_pham.ten_san_pham like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select lo_hang.* from lo_hang " +
                                " join san_pham on san_pham.id = lo_hang.san_pham_id " +
                    " where san_pham.ten_san_pham like :searchName ) temp_table")
    Page<LoHang> findAllLoHang(Pageable pageable, @Param("searchName") String searchName);
}
