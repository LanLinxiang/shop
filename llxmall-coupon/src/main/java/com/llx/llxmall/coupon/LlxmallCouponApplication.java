package com.llx.llxmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName:  LlxmallCouponApplication
 * @Package com.llx.llxmallcoupon
 * @Description:    优惠券
 * @Author: LanLinxiang
 * @Email: linxianglan@aliyun.com
 * @Date:   2021/2/6 18:27
 * @Version V1.0
 *
 */


@MapperScan("com.llx.llxmall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class LlxmallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(LlxmallCouponApplication.class, args);
    }

}
