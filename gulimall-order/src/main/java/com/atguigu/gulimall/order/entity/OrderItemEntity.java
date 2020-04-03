package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ∂©µ•œÓ–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_order_item")
public class OrderItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * order_sn
	 */
	private String orderSn;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * spu_name
	 */
	private String spuName;
	/**
	 * spu_pic
	 */
	private String spuPic;
	/**
	 * ∆∑≈∆
	 */
	private String spuBrand;
	/**
	 * …Ã∆∑∑÷¿‡id
	 */
	private Long categoryId;
	/**
	 * …Ã∆∑sku±‡∫≈
	 */
	private Long skuId;
	/**
	 * …Ã∆∑sku√˚◊÷
	 */
	private String skuName;
	/**
	 * …Ã∆∑skuÕº∆¨
	 */
	private String skuPic;
	/**
	 * …Ã∆∑skuº€∏Ò
	 */
	private BigDecimal skuPrice;
	/**
	 * …Ã∆∑π∫¬Úµƒ ˝¡ø
	 */
	private Integer skuQuantity;
	/**
	 * …Ã∆∑œ˙ € Ù–‘◊È∫œ£®JSON£©
	 */
	private String skuAttrsVals;
	/**
	 * …Ã∆∑¥Ÿœ˙∑÷Ω‚Ω∂Ó
	 */
	private BigDecimal promotionAmount;
	/**
	 * ”≈ª›»Ø”≈ª›∑÷Ω‚Ω∂Ó
	 */
	private BigDecimal couponAmount;
	/**
	 * ª˝∑÷”≈ª›∑÷Ω‚Ω∂Ó
	 */
	private BigDecimal integrationAmount;
	/**
	 * ∏√…Ã∆∑æ≠π˝”≈ª›∫Ûµƒ∑÷Ω‚Ω∂Ó
	 */
	private BigDecimal realAmount;
	/**
	 * ‘˘ÀÕª˝∑÷
	 */
	private Integer giftIntegration;
	/**
	 * ‘˘ÀÕ≥…≥§÷µ
	 */
	private Integer giftGrowth;

}
