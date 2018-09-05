package com.walmartlabs.demo.RepositoryImpl;

import com.walmartlabs.demo.Entity.LoginUser;
import com.walmartlabs.demo.Repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginUserRepositoryImpl {

    @Autowired
    private LoginUserRepository loginUserRepository;

    LoginUser findByUser_Name(String username) {
        LoginUser obj = loginUserRepository.findByusername(username);
        return obj;
    }

    public Iterable<LoginUser> save(Iterable<LoginUser> loginUsers) {
        return loginUserRepository.saveAll(loginUsers);
    }

}
