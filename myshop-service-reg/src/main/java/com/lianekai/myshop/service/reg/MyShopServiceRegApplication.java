package com.lianekai.myshop.service.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lianekai
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.lianekai.myshop.commons.mapper")
public class MyShopServiceRegApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceRegApplication.class,args);

    }
}