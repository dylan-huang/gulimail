package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.service.CategoryService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;


/**
 * 商品三级分类
 *
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 10:31:51
 */
@RestController
@RequestMapping("product/category" )
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类和自分类，树状展示
     */
    @RequestMapping("product/list" )
     //@RequiresPermissions("product:category:list")
    public R list(@RequestParam Map<String, Object> params) {
       List<CategoryEntity> list = categoryService.listWithTree();

        return R.ok().put("data", list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}" )
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId" ) Long catId) {
            CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save" )
     //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
            categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update" )
// @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category) {
            categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete" )
    // @RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds) {
            //删除之前要先检查是否被引用，如果被引用无法删除

        categoryService.removeMenusByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
