package com.hau.service;

import com.hau.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    Page<User> findAll(Pageable pageable, String searchValue);

    void remove(Integer id);

    void save(User user);

    User getById(Integer id);

}
