package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ≥…≥§÷µ±‰ªØ¿˙ ∑º«¬º
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
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
	 * create_time
	 */
	private Date createTime;
	/**
	 * ∏ƒ±‰µƒ÷µ£®’˝∏∫º∆ ˝£©
	 */
	private Integer changeCount;
	/**
	 * ±∏◊¢
	 */
	private String note;
	/**
	 * ª˝∑÷¿¥‘¥[0-π∫ŒÔ£¨1-π‹¿Ì‘±–ﬁ∏ƒ]
	 */
	private Integer sourceType;

}
