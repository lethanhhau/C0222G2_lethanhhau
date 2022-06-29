package com.hau.repository;

import com.hau.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRepository extends JpaRepository<User, Integer> {

        @Query(value = " select * from user where first_name like :searchValue", nativeQuery = true)
        Page<User> findByKeyword(Pageable pageable,@Param("searchValue") String searchValue);
    }
