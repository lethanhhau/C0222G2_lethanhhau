package com.hau.repository;

import com.hau.dto.IProductDTO;
import com.hau.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select product.* from product join category on category.id = product.category_id where  " +
            " product.name like :searchByName and product.manufacturer like :searchByOrigin and product.price " +
            " like :searchByPrice and product.is_deleted = 0 order by product.date_in desc " +
            "",countQuery = "select count(*) from (select product.* from product  " +
            " join category on category.id = product.category_id where  product.name like :searchByName and  " +
            " product.manufacturer like :searchByOrigin and product.price like :searchByPrice and product.is_deleted = 0 " +
            "  order by product.date_in desc) temp_table",nativeQuery = true)
    Page<IProductDTO> getAllProduct(Pageable pageable, String searchByName, String searchByOrigin, String searchByPrice);


    @Transactional
    @Modifying
    @Query(value = "update product set product.is_deleted = 1 where product.id = :id ", nativeQuery = true)
    void deleteProduct(Integer id);



    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 1 and product.is_deleted = 0",nativeQuery = true)
    List<Product> getSmartPhone();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 2 and product.is_deleted = 0",nativeQuery = true)
    List<Product> getLaptop();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 3 and product.is_deleted = 0",nativeQuery = true)
    List<Product> getCamera();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 4 and product.is_deleted = 0",nativeQuery = true)
    List<Product> getDevice();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 5 and product.is_deleted = 0",nativeQuery = true)
    List<Product> getTivi();
}