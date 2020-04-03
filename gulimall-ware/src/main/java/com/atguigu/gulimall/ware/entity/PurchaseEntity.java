package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ≤…π∫–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:27:20
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ≤…π∫µ•id
	 */
	@TableId
	private Long id;
	/**
	 * ≤…π∫»Àid
	 */
	private Long assigneeId;
	/**
	 * ≤…π∫»À√˚
	 */
	private String assigneeName;
	/**
	 * ¡™œµ∑Ω Ω
	 */
	private String phone;
	/**
	 * ”≈œ»º∂
	 */
	private Integer priority;
	/**
	 * ◊¥Ã¨
	 */
	private Integer status;
	/**
	 * ≤÷ø‚id
	 */
	private Long wareId;
	/**
	 * ◊‹Ω∂Ó
	 */
	private BigDecimal amount;
	/**
	 * ¥¥Ω®»’∆⁄
	 */
	private Date createTime;
	/**
	 * ∏¸–¬»’∆⁄
	 */
	private Date updateTime;

}
