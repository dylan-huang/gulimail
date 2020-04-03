package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ª·‘±Õ≥º∆–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ª·‘±id
	 */
	private Long memberId;
	/**
	 * ¿€º∆œ˚∑—Ω∂Ó
	 */
	private BigDecimal consumeAmount;
	/**
	 * ¿€º∆”≈ª›Ω∂Ó
	 */
	private BigDecimal couponAmount;
	/**
	 * ∂©µ• ˝¡ø
	 */
	private Integer orderCount;
	/**
	 * ”≈ª›»Ø ˝¡ø
	 */
	private Integer couponCount;
	/**
	 * ∆¿º€ ˝
	 */
	private Integer commentCount;
	/**
	 * ÕÀªı ˝¡ø
	 */
	private Integer returnOrderCount;
	/**
	 * µ«¬º¥Œ ˝
	 */
	private Integer loginCount;
	/**
	 * πÿ◊¢ ˝¡ø
	 */
	private Integer attendCount;
	/**
	 * ∑€Àø ˝¡ø
	 */
	private Integer fansCount;
	/**
	 *  ’≤ÿµƒ…Ã∆∑ ˝¡ø
	 */
	private Integer collectProductCount;
	/**
	 *  ’≤ÿµƒ◊®Ã‚ªÓ∂Ø ˝¡ø
	 */
	private Integer collectSubjectCount;
	/**
	 *  ’≤ÿµƒ∆¿¬€ ˝¡ø
	 */
	private Integer collectCommentCount;
	/**
	 * —˚«Îµƒ≈Û”— ˝¡ø
	 */
	private Integer inviteFriendCount;

}
