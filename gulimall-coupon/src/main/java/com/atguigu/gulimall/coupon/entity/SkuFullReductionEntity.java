package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑¬˙ºı–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
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
	 * ¬˙∂‡…Ÿ
	 */
	private BigDecimal fullPrice;
	/**
	 * ºı∂‡…Ÿ
	 */
	private BigDecimal reducePrice;
	/**
	 *  «∑Ò≤Œ”Î∆‰À˚”≈ª›
	 */
	private Integer addOther;

}
