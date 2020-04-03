package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑Ω◊Ã›º€∏Ò
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * ¬˙º∏º˛
	 */
	private Integer fullCount;
	/**
	 * ¥Úº∏’€
	 */
	private BigDecimal discount;
	/**
	 * ’€∫Ûº€
	 */
	private BigDecimal price;
	/**
	 *  «∑Òµ˛º”∆‰À˚”≈ª›[0-≤ªø…µ˛º”£¨1-ø…µ˛º”]
	 */
	private Integer addOther;

}
