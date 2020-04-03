package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	private Long skuId;
	/**
	 * spuId
	 */
	private Long spuId;
	/**
	 * sku√˚≥∆
	 */
	private String skuName;
	/**
	 * skuΩÈ…‹√Ë ˆ
	 */
	private String skuDesc;
	/**
	 * À˘ Ù∑÷¿‡id
	 */
	private Long catalogId;
	/**
	 * ∆∑≈∆id
	 */
	private Long brandId;
	/**
	 * ƒ¨»œÕº∆¨
	 */
	private String skuDefaultImg;
	/**
	 * ±ÍÃ‚
	 */
	private String skuTitle;
	/**
	 * ∏±±ÍÃ‚
	 */
	private String skuSubtitle;
	/**
	 * º€∏Ò
	 */
	private BigDecimal price;
	/**
	 * œ˙¡ø
	 */
	private Long saleCount;

}
