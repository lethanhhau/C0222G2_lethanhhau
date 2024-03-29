package com.hau.repository;

import com.hau.dto.IProductDTO;
import com.hau.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select product.* from product join category on category.id = product.category_id where " +
            " product.name like :searchName and product.is_deleted = 0" +
            "", countQuery = "select count(*) from (select product.* from product  " +
            " join category on category.id = product.category_id where product.name like :searchName " +
            " and product.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getAllProduct(Pageable pageable, @Param("searchName") String searchName);

    @Query(value = " SELECT * FROM product where is_deleted = 0 order by date_in desc limit 30 ", nativeQuery = true)
    List<Product> getNewProducts();

    @Query(value = " SELECT * FROM product where is_deleted = 0 ", nativeQuery = true)
    List<Product> findAll();

    @Transactional
    @Modifying
    @Query(value = " update product set is_deleted = 1 where id = :id ", nativeQuery = true)
    void deleteProduct(@Param("id") String id);


    @Query(value = "select p.* from product p join category c on c.id = p.category_id " +
            " where p.category_id = 1 and p.is_deleted = 0",
            countQuery = "select count(*) from (select p.* from product p join category c on c.id = p.category_id" +
                    "          where p.category_id = 1 and p.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getPhone(Pageable pageable);

    @Query(value = "select p.* from product p join category c on c.id = p.category_id " +
            " where p.category_id = 2 and p.is_deleted = 0",
            countQuery = "select count(*) from (select p.* from product p join category c on c.id = p.category_id" +
                    "          where p.category_id = 2 and p.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getLaptop(Pageable pageable);

    @Query(value = "select p.* from product p join category c on c.id = p.category_id " +
            " where p.category_id = 3 and p.is_deleted = 0",
            countQuery = "select count(*) from (select p.* from product p join category c on c.id = p.category_id" +
                    "          where p.category_id = 3 and p.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getCamera(Pageable pageable);

    @Query(value = "select p.* from product p join category c on c.id = p.category_id " +
            " where p.category_id = 4 and p.is_deleted = 0",
            countQuery = "select count(*) from (select p.* from product p join category c on c.id = p.category_id" +
                    "          where p.category_id = 4 and p.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getDevice(Pageable pageable);

    @Query(value = "select p.* from product p join category c on c.id = p.category_id " +
            " where p.category_id = 5 and p.is_deleted = 0",
            countQuery = "select count(*) from (select p.* from product p join category c on c.id = p.category_id" +
                    "          where p.category_id = 5 and p.is_deleted = 0 ) temp_table", nativeQuery = true)
    Page<Product> getTivi(Pageable pageable);

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 6 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getWashingMachine();

    @Query(value = "select * from product join category on category.id = product.category_id " +
            " where product.category_id = 7 and product.is_deleted = 0", nativeQuery = true)
    List<Product> getFridge();

    @Modifying
    @Transactional
    @Query(value = " UPDATE `product` SET `quantity` = (`quantity` - :quantity) WHERE (`id` = :id) ", nativeQuery = true)
    void updateQuantity(@Param("quantity") Integer quantity, @Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = " UPDATE `product` SET `is_deleted` = 1 WHERE (`id` = :id) ", nativeQuery = true)
    void updateIsDeleted(@Param("id") Integer id);
}