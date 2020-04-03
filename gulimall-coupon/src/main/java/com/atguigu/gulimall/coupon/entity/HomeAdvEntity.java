package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *  ◊“≥¬÷≤•π„∏Ê
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_home_adv")
public class HomeAdvEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * √˚◊÷
	 */
	private String name;
	/**
	 * Õº∆¨µÿ÷∑
	 */
	private String pic;
	/**
	 * ø™ º ±º‰
	 */
	private Date startTime;
	/**
	 * Ω· ¯ ±º‰
	 */
	private Date endTime;
	/**
	 * ◊¥Ã¨
	 */
	private Integer status;
	/**
	 * µ„ª˜ ˝
	 */
	private Integer clickCount;
	/**
	 * π„∏ÊœÍ«È¡¨Ω”µÿ÷∑
	 */
	private String url;
	/**
	 * ±∏◊¢
	 */
	private String note;
	/**
	 * ≈≈–Ú
	 */
	private Integer sort;
	/**
	 * ∑¢≤º’ﬂ
	 */
	private Long publisherId;
	/**
	 * …Û∫À’ﬂ
	 */
	private Long authId;

}
