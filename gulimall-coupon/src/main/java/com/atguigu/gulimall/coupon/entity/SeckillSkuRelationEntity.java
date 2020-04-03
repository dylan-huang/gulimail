package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * √Î…±ªÓ∂Ø…Ã∆∑πÿ¡™
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ªÓ∂Øid
	 */
	private Long promotionId;
	/**
	 * ªÓ∂Ø≥°¥Œid
	 */
	private Long promotionSessionId;
	/**
	 * …Ã∆∑id
	 */
	private Long skuId;
	/**
	 * √Î…±º€∏Ò
	 */
	private BigDecimal seckillPrice;
	/**
	 * √Î…±◊‹¡ø
	 */
	private BigDecimal seckillCount;
	/**
	 * √ø»Àœﬁπ∫ ˝¡ø
	 */
	private BigDecimal seckillLimit;
	/**
	 * ≈≈–Ú
	 */
	private Integer seckillSort;

}
