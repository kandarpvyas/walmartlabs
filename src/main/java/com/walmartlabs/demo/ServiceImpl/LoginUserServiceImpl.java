package com.walmartlabs.demo.ServiceImpl;

import com.walmartlabs.demo.Entity.LoginUser;
import com.walmartlabs.demo.Repository.LoginUserRepository;
import com.walmartlabs.demo.Service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceImpl implements LoginUserService {

    private LoginUserRepository loginUserRepository;

    @Autowired
    public LoginUserServiceImpl(LoginUserRepository loginUserRepository) {
        this.loginUserRepository = loginUserRepository;
    }

    public boolean validateUser(String username, String password) {
        LoginUser obj = loginUserRepository.findByusername(username);
        if (obj != null) {
            return obj.getPassword().equalsIgnoreCase(password);
        } else {
            return false;
        }

    }

    @Override
    public Iterable<LoginUser> save(Iterable<LoginUser> loginUsers) {
        return loginUserRepository.saveAll(loginUsers);
    }

}
