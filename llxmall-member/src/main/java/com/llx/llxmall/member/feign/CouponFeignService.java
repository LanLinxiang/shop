package com.llx.llxmall.member.feign;

import com.llx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("llxmall-coupon")
public interface CouponFeignService {


    /**
     * @param: 测试通过openfeign 远程调用member 优惠券服务
     * @return: 返回 用户以及用户优惠券信息
     * @auther: LanLinxiang
     * @date: 2021/2/8 15:50
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
