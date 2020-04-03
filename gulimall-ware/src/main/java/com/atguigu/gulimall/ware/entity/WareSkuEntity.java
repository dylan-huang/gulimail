package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑ø‚¥Ê
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:27:20
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ≤÷ø‚id
	 */
	private Long wareId;
	/**
	 * ø‚¥Ê ˝
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * À¯∂®ø‚¥Ê
	 */
	private Integer stockLocked;

}
