package com.llx.llxmall.product.service;
import com.llx.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.llxmall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-07 16:15:33
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

