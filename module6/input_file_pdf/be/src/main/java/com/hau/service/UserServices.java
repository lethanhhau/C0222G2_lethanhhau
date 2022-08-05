package com.hau.service;

import com.hau.model.User;
import com.hau.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServices implements IUserService{
    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return repo.findAll(Sort.by("email").ascending());
    }
}
