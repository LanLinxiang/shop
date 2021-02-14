package com.llx.llxmall.llxmallgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
/**
 * @ClassName:  CorsConfigRation
 * @Package com.llx.llxmall.llxmallgateway.config
 * @Description:    配置不同服务器请求过滤，
 * @Author: LanLinxiang
 * @Email: linxianglan@aliyun.com
 * @Date:   2021/2/13 16:35
 * @Version V1.0
 *
 */
@Configuration
public class CorsConfigRation {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //配置跨域
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }
}
