package com.llx.llxmall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.llx.llxmall.product.entity.CategoryEntity;
import com.llx.llxmall.product.service.CategoryService;
import com.llx.common.utils.PageUtils;
import com.llx.common.utils.R;

/**
 * 商品三级分类
 *
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-12 16:15:32
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;



    /**
     * @param: 查出所有分类以及子分类，以树形结构组装
     * @return: 
     * @auther: LanLinxiang
     * @date: 2021/2/14 21:39
     */

    @RequestMapping("/list/tree")
    public R list(){

        List<CategoryEntity> entities= categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));
		//TODO 检查当前菜单是否被引用
        categoryService.removeMenueByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
