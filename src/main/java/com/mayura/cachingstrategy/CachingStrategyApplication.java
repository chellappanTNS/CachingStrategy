package com.mayura.cachingstrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachingStrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachingStrategyApplication.class, args);
    }
}