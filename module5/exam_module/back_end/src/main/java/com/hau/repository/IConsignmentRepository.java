package com.hau.repository;

import com.hau.model.Consignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IConsignmentRepository extends JpaRepository<Consignment,Integer> {

    @Query(value = " select consignment.* from consignment " +
    " join product on product.id = consignment.product_id " +
    " where product.productName like :searchProductName ", nativeQuery = true,
    countQuery = " select count(*) from (select consignment.* from consignment " +
            " join product on product.id = consignment.product_id " +
            " where product.productName like :searchProductName) temp_table")

    Page<Consignment> findAllConsignment(Pageable pageable, String searchProductName);
}
