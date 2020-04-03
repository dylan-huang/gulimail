package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÷ß∏∂–≈œ¢±Ì
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ∂©µ•∫≈£®∂‘Õ‚“µŒÒ∫≈£©
	 */
	private String orderSn;
	/**
	 * ∂©µ•id
	 */
	private Long orderId;
	/**
	 * ÷ß∏∂±¶Ωª“◊¡˜ÀÆ∫≈
	 */
	private String alipayTradeNo;
	/**
	 * ÷ß∏∂◊‹Ω∂Ó
	 */
	private BigDecimal totalAmount;
	/**
	 * Ωª“◊ƒ⁄»›
	 */
	private String subject;
	/**
	 * ÷ß∏∂◊¥Ã¨
	 */
	private String paymentStatus;
	/**
	 * ¥¥Ω® ±º‰
	 */
	private Date createTime;
	/**
	 * »∑»œ ±º‰
	 */
	private Date confirmTime;
	/**
	 * ªÿµ˜ƒ⁄»›
	 */
	private String callbackContent;
	/**
	 * ªÿµ˜ ±º‰
	 */
	private Date callbackTime;

}
