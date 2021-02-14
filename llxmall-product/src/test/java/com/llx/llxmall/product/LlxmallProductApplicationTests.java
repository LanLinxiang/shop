package com.llx.llxmall.product;

import com.llx.llxmall.product.entity.BrandEntity;
import com.llx.llxmall.product.service.BrandService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest()
class LlxmallProductApplicationTests {
    @Resource
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity =new BrandEntity();
        brandEntity.setName("小米");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
