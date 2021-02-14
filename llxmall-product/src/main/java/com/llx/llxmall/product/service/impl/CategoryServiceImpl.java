package com.llx.llxmall.product.service.impl;

import com.llx.common.utils.PageUtils;
import com.llx.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.llx.llxmall.product.dao.CategoryDao;
import com.llx.llxmall.product.entity.CategoryEntity;
import com.llx.llxmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }
    /**
     * @param: 查出所有分类以及子分类，以树形结构组装
     * @return:
     * @auther: LanLinxiang
     * @date: 2021/2/15 0:02
     */

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> entities =baseMapper.selectList(null);
        //组装成父子树形结构
        //一级菜单
        List<CategoryEntity> levelOneMenus=
            entities.stream().filter(
                //提取所有ParentCid 为0的 标签 主菜单
                categoryEntity -> categoryEntity.getParentCid() == 0
                ).map(//映射表中元素，在主菜单中的位置
                        (menu)->{menu.setChildren(getChliderns(menu,entities));
                        return menu;}
                      ).sorted(//对每一个菜单进行排序
                    (menu1,menu2)->{return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());}
                                    ).collect(Collectors.toList());


        return levelOneMenus;
    }
    /**
     * @param: 通过ID删除菜单
     * @return: TODO 检查当前菜单是否被引用
     * @auther: LanLinxiang
     * @date: 2021/2/14 21:41
     */
    @Override
    public void removeMenueByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
        
    }


    /**
     * @param: 递归查找每个菜单中的子菜单
     * @return: 
     * @auther: LanLinxiang
     * @date: 2021/2/14 21:42
     */
    private List<CategoryEntity> getChliderns(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> childern =
        all.stream().filter(//递归所有ParentCid等于CatID的集合
                categoryEntity -> categoryEntity.getParentCid() == root.getCatId()
        ).map(//设置子子节点的值
                (menu)->{menu.setChildren(getChliderns(menu,all));
                    return menu;}
        ).sorted(//对每一个子菜单进行排序
                (menu1,menu2)->{return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());}
        ).collect(Collectors.toList());
        return childern;
    }

}