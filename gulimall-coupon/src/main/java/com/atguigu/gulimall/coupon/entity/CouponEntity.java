package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ”≈ª›»Ø–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ”≈ª›æÌ¿‡–Õ[0->»´≥°‘˘»Ø£ª1->ª·‘±‘˘»Ø£ª2->π∫ŒÔ‘˘»Ø£ª3->◊¢≤·‘˘»Ø]
	 */
	private Integer couponType;
	/**
	 * ”≈ª›»ØÕº∆¨
	 */
	private String couponImg;
	/**
	 * ”≈ª›æÌ√˚◊÷
	 */
	private String couponName;
	/**
	 *  ˝¡ø
	 */
	private Integer num;
	/**
	 * Ω∂Ó
	 */
	private BigDecimal amount;
	/**
	 * √ø»Àœﬁ¡Ï’≈ ˝
	 */
	private Integer perLimit;
	/**
	 *  π”√√≈º˜
	 */
	private BigDecimal minPoint;
	/**
	 * ø™ º ±º‰
	 */
	private Date startTime;
	/**
	 * Ω· ¯ ±º‰
	 */
	private Date endTime;
	/**
	 *  π”√¿‡–Õ[0->»´≥°Õ®”√£ª1->÷∏∂®∑÷¿‡£ª2->÷∏∂®…Ã∆∑]
	 */
	private Integer useType;
	/**
	 * ±∏◊¢
	 */
	private String note;
	/**
	 * ∑¢–– ˝¡ø
	 */
	private Integer publishCount;
	/**
	 * “— π”√ ˝¡ø
	 */
	private Integer useCount;
	/**
	 * ¡Ï»° ˝¡ø
	 */
	private Integer receiveCount;
	/**
	 * ø…“‘¡Ï»°µƒø™ º»’∆⁄
	 */
	private Date enableStartTime;
	/**
	 * ø…“‘¡Ï»°µƒΩ· ¯»’∆⁄
	 */
	private Date enableEndTime;
	/**
	 * ”≈ª›¬Î
	 */
	private String code;
	/**
	 * ø…“‘¡Ï»°µƒª·‘±µ»º∂[0->≤ªœﬁµ»º∂£¨∆‰À˚-∂‘”¶µ»º∂]
	 */
	private Integer memberLevel;
	/**
	 * ∑¢≤º◊¥Ã¨[0-Œ¥∑¢≤º£¨1-“—∑¢≤º]
	 */
	private Integer publish;

}
