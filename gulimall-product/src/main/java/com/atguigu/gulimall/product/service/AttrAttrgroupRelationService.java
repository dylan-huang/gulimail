package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 *  Ù–‘& Ù–‘∑÷◊Èπÿ¡™
 *
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

