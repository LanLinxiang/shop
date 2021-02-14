package com.llx.llxmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:  LlxmallProductApplication
 * @Package com.llx.llxmallproduct
 * @Description:    商城服务
 * @Author: LanLinxiang
 * @Email: linxianglan@aliyun.com
 * @Date:   2021/2/6 18:29
 * @Version V1.0
 *
 */

@MapperScan("com.llx.llxmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class LlxmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LlxmallProductApplication.class, args);
    }

}
