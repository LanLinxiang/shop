package com.llx.llxmall.order.dao;

import com.llx.llxmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-07 19:25:11
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
