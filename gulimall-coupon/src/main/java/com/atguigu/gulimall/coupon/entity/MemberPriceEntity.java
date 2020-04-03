package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑ª·‘±º€∏Ò
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_member_price")
public class MemberPriceEntity implements Serializable {
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
	 * ª·‘±µ»º∂id
	 */
	private Long memberLevelId;
	/**
	 * ª·‘±µ»º∂√˚
	 */
	private String memberLevelName;
	/**
	 * ª·‘±∂‘”¶º€∏Ò
	 */
	private BigDecimal memberPrice;
	/**
	 * ø…∑Òµ˛º”∆‰À˚”≈ª›[0-≤ªø…µ˛º””≈ª›£¨1-ø…µ˛º”]
	 */
	private Integer addOther;

}
