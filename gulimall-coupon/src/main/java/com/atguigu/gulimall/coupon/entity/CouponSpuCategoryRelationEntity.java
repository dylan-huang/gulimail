package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ”≈ª›»Ø∑÷¿‡πÿ¡™
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ”≈ª›»Øid
	 */
	private Long couponId;
	/**
	 * ≤˙∆∑∑÷¿‡id
	 */
	private Long categoryId;
	/**
	 * ≤˙∆∑∑÷¿‡√˚≥∆
	 */
	private String categoryName;

}
