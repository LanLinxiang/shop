package com.llx.llxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.llxmall.product.entity.SpuCommentEntity;

import java.util.Map;
import com.llx.common.utils.PageUtils;
/**
 * 商品评价
 *
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-07 16:15:33
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

