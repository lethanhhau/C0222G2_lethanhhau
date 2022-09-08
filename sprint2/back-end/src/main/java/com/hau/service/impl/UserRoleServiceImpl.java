package com.hau.service.impl;

import com.hau.model.account.UserRole;
import com.hau.repository.account.IUserRoleRepository;
import com.hau.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements IUserRoleService {
    @Autowired
    private IUserRoleRepository iUserRoleRepository;

    @Override
    public void save(UserRole userRole) {
        iUserRoleRepository.save(userRole);
    }
}