package com.llx.llxmall.order.dao;

import com.llx.llxmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-07 19:25:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
