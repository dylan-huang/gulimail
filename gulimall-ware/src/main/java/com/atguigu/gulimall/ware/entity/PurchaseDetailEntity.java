package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:27:20
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * ≤…π∫µ•id
	 */
	private Long purchaseId;
	/**
	 * ≤…π∫…Ã∆∑id
	 */
	private Long skuId;
	/**
	 * ≤…π∫ ˝¡ø
	 */
	private Integer skuNum;
	/**
	 * ≤…π∫Ω∂Ó
	 */
	private BigDecimal skuPrice;
	/**
	 * ≤÷ø‚id
	 */
	private Long wareId;
	/**
	 * ◊¥Ã¨[0–¬Ω®£¨1“—∑÷≈‰£¨2’˝‘⁄≤…π∫£¨3“—ÕÍ≥…£¨4≤…π∫ ß∞‹]
	 */
	private Integer status;

}
