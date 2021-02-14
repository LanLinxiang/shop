package com.llx.llxmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName:  LlxmallMemberApplication
 * @Package com.llx.llxmallmember
 * @Description:    会员服务
 * @Author: LanLinxiang
 * @Email: linxianglan@aliyun.com
 * @Date:   2021/2/6 18:28
 * @Version V1.0
 *
 */
@EnableFeignClients(basePackages = "com.llx.llxmall.member.feign")
@MapperScan("com.llx.llxmall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class LlxmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LlxmallMemberApplication.class, args);
    }

}
