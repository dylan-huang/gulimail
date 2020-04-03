package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ª·‘±µ»º∂
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * µ»º∂√˚≥∆
	 */
	private String name;
	/**
	 * µ»º∂–Ë“™µƒ≥…≥§÷µ
	 */
	private Integer growthPoint;
	/**
	 *  «∑ÒŒ™ƒ¨»œµ»º∂[0->≤ª «£ª1-> «]
	 */
	private Integer defaultStatus;
	/**
	 * √‚‘À∑—±Í◊º
	 */
	private BigDecimal freeFreightPoint;
	/**
	 * √ø¥Œ∆¿º€ªÒ»°µƒ≥…≥§÷µ
	 */
	private Integer commentGrowthPoint;
	/**
	 *  «∑Ò”–√‚” Ãÿ»®
	 */
	private Integer priviledgeFreeFreight;
	/**
	 *  «∑Ò”–ª·‘±º€∏ÒÃÿ»®
	 */
	private Integer priviledgeMemberPrice;
	/**
	 *  «∑Ò”–…˙»’Ãÿ»®
	 */
	private Integer priviledgeBirthday;
	/**
	 * ±∏◊¢
	 */
	private String note;

}
