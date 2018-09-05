package com.walmartlabs.demo;

import com.walmartlabs.demo.Entity.LoginUser;
import com.walmartlabs.demo.Entity.Tasks;
import com.walmartlabs.demo.Service.LoginUserService;
import com.walmartlabs.demo.Service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Component
public class DatabaseInitializer {

    private LoginUserService loginUserService;

    private TasksService tasksService;

    @Autowired
    public DatabaseInitializer(LoginUserService loginUserService, TasksService tasksService) {
        this.loginUserService = loginUserService;
        this.tasksService = tasksService;
    }

    @PostConstruct
    public void populateDatabase() {

        LoginUser obj1 = new LoginUser("admin", "admin");

        LoginUser obj2 = new LoginUser("employee", "employee");

        loginUserService.save(Arrays.asList(obj1, obj2));

        Tasks tobj1 = new Tasks(new Date(118, 7, 31), new Date(118, 11, 31), 1, 0, 0);

        Tasks tobj2 = new Tasks(new Date(118, 8, 14), new Date(118, 10, 5), 1, 0, 0);

        Tasks tobj3 = new Tasks(new Date(118, 8, 01), new Date(118, 11, 25), 1, 0, 2);

        Tasks tobj4 = new Tasks(new Date(119, 0, 01), new Date(119, 4, 25), 1, 0, 2);

        tasksService.save(Arrays.asList(tobj1, tobj2, tobj3, tobj4));

    }
}
