package com.walmartlabs.demo.Repository;

import com.walmartlabs.demo.Entity.LoginUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserRepository extends CrudRepository<LoginUser, Long> {

    LoginUser findByusername(String username);

    Iterable<LoginUser> save(Iterable<LoginUser> loginUsers);

}
