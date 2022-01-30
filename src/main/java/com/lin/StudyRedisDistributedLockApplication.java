package com.lin;

import com.lin.service.DistributedLockService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudyRedisDistributedLockApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StudyRedisDistributedLockApplication.class, args);
        DistributedLockService bean = run.getBean(DistributedLockService.class);
        bean.test();
    }

}
