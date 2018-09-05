package com.walmartlabs.demo.Service;

import com.walmartlabs.demo.Entity.LoginUser;

public interface LoginUserService {

    Iterable<LoginUser> save(Iterable<LoginUser> loginUsers);

    boolean validateUser(String username, String password);
}