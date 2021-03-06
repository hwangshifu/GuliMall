package com.hwangshifu.gulimall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.hwangshifu.gulimall.ware.feign"})
@EnableDiscoveryClient
@SpringBootApplication
public class GuliMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMallWareApplication.class, args);
    }

}
