package com.walmartlabs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.walmartlabs.demo")
public class SpringBootFirstWebApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(SpringBootFirstWebApplication.class, args);
    }

}
