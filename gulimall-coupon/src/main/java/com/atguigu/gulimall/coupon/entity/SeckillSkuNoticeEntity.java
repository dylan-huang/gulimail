package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * √Î…±…Ã∆∑Õ®÷™∂©‘ƒ
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ªÓ∂Ø≥°¥Œid
	 */
	private Long sessionId;
	/**
	 * ∂©‘ƒ ±º‰
	 */
	private Date subcribeTime;
	/**
	 * ∑¢ÀÕ ±º‰
	 */
	private Date sendTime;
	/**
	 * Õ®÷™∑Ω Ω[0-∂Ã–≈£¨1-” º˛]
	 */
	private Integer noticeType;

}
