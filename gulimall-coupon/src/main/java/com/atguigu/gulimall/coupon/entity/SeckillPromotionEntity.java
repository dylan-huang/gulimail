package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * √Î…±ªÓ∂Ø
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ªÓ∂Ø±ÍÃ‚
	 */
	private String title;
	/**
	 * ø™ º»’∆⁄
	 */
	private Date startTime;
	/**
	 * Ω· ¯»’∆⁄
	 */
	private Date endTime;
	/**
	 * …œœ¬œﬂ◊¥Ã¨
	 */
	private Integer status;
	/**
	 * ¥¥Ω® ±º‰
	 */
	private Date createTime;
	/**
	 * ¥¥Ω®»À
	 */
	private Long userId;

}
