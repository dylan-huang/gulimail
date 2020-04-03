package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 *  ◊“≥◊®Ã‚±Ì°æjd ◊“≥œ¬√Ê∫‹∂‡◊®Ã‚£¨√ø∏ˆ◊®Ã‚¡¥Ω”–¬µƒ“≥√Ê£¨’π æ◊®Ã‚…Ã∆∑–≈œ¢°ø
 *
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

