package com.wangjc.activiti.design;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WangjcActivitiDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WangjcActivitiDesignApplication.class, args);
    }

}
