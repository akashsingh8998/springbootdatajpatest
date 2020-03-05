package com.sapient.springbootdatajpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.sapient")
@EnableJpaRepositories("com.sapient.repository")
//@ComponentScan
@EntityScan("com.sapient.model")
public class SpringBootDataJpaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataJpaTestApplication.class, args);
    }
}