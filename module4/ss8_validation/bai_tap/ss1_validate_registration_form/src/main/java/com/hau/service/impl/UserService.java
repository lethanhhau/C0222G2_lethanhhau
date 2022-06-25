package com.hau.service.impl;

import com.hau.model.User;
import com.hau.repository.IUserRepository;
import com.hau.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public Page<User> findAll(Pageable pageable, String searchValue) {
        return this.iUserRepository.findByKeyword(pageable, "%" + searchValue + "%");
    }

    @Override
    public void remove(Integer id) {
        this.iUserRepository.delete(this.iUserRepository.getById(id));
    }

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }

    @Override
    public User getById(Integer id) {
        return this.iUserRepository.getById(id);
    }
}
