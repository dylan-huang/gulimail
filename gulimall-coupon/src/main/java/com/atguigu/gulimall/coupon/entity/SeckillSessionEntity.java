package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * √Î…±ªÓ∂Ø≥°¥Œ
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ≥°¥Œ√˚≥∆
	 */
	private String name;
	/**
	 * √ø»’ø™ º ±º‰
	 */
	private Date startTime;
	/**
	 * √ø»’Ω· ¯ ±º‰
	 */
	private Date endTime;
	/**
	 * ∆Ù”√◊¥Ã¨
	 */
	private Integer status;
	/**
	 * ¥¥Ω® ±º‰
	 */
	private Date createTime;

}
