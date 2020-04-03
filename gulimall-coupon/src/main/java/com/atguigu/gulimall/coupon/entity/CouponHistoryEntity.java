package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ”≈ª›»Ø¡Ï»°¿˙ ∑º«¬º
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
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
	 * ª·‘±id
	 */
	private Long memberId;
	/**
	 * ª·‘±√˚◊÷
	 */
	private String memberNickName;
	/**
	 * ªÒ»°∑Ω Ω[0->∫ÛÃ®‘˘ÀÕ£ª1->÷˜∂Ø¡Ï»°]
	 */
	private Integer getType;
	/**
	 * ¥¥Ω® ±º‰
	 */
	private Date createTime;
	/**
	 *  π”√◊¥Ã¨[0->Œ¥ π”√£ª1->“— π”√£ª2->“—π˝∆⁄]
	 */
	private Integer useType;
	/**
	 *  π”√ ±º‰
	 */
	private Date useTime;
	/**
	 * ∂©µ•id
	 */
	private Long orderId;
	/**
	 * ∂©µ•∫≈
	 */
	private Long orderSn;

}
