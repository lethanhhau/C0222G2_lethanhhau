package com.hau.service.account;

import com.hau.model.account.AppUser;

public interface IAppUserService {
    AppUser findAppUserByUsername(String username);

    void updatePassword(AppUser appUser);
}
