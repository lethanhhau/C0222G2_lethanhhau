package com.hau.service;


import com.hau.model.account.AppUser;

import java.util.List;

public interface IAppUserService {

    List<AppUser> getAllUser();

    AppUser findAppUserByUserName(String userName);
    void updatePassword(AppUser appUser);

    void saveAppUser(AppUser appUser);
}
