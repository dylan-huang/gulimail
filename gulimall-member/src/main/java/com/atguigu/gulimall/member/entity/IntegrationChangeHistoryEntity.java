package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ª˝∑÷±‰ªØ¿˙ ∑º«¬º
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
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
	 * ±‰ªØµƒ÷µ
	 */
	private Integer changeCount;
	/**
	 * ±∏◊¢
	 */
	private String note;
	/**
	 * ¿¥‘¥[0->π∫ŒÔ£ª1->π‹¿Ì‘±–ﬁ∏ƒ;2->ªÓ∂Ø]
	 */
	private Integer sourceTyoe;

}
