package com.llx.llxmall.llxmallgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LlxmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LlxmallGatewayApplication.class, args);
    }

}
