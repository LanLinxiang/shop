package com.llx.llxmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:  LlxmallWareApplication
 * @Package com.llx.llxmallware
 * @Description:    仓储服务
 * @Author: LanLinxiang
 * @Email: linxianglan@aliyun.com
 * @Date:   2021/2/6 18:30
 * @Version V1.0
 *
 */
@MapperScan("com.llx.llxmall.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class LlxmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(LlxmallWareApplication.class, args);
    }

}
