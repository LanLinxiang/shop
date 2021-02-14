package com.llx.llxmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:  LlxmallOrderApplication
 * @Package com.llx.llxmallorder
 * @Description:    订单服务
 * @Author: LanLinxiang
 * @Email: linxianglan@aliyun.com
 * @Date:   2021/2/6 18:29
 * @Version V1.0
 *
 */
@MapperScan("com.llx.llxmall.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class LlxmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LlxmallOrderApplication.class, args);
    }

}
