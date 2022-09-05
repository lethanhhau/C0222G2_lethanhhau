package com.hau.service.account.impl;

import com.hau.model.account.AppUser;
import com.hau.repository.IAppUserRepository;
import com.hau.service.account.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements IAppUserService {

    @Autowired
    private com.hau.repository.IAppUserRepository IAppUserRepository;

    @Override
    public AppUser findAppUserByUsername(String username) {
        return this.IAppUserRepository.findAppUserByUserName(username);
    }

    @Override
    public void updatePassword(AppUser appUser) {
        this.IAppUserRepository.updatePassword(appUser);
    }
}
