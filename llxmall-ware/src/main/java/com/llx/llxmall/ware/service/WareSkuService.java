package com.llx.llxmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.llxmall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-07 19:30:05
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

