package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑∆¿º€ªÿ∏¥πÿœµ
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ∆¿¬€id
	 */
	private Long commentId;
	/**
	 * ªÿ∏¥id
	 */
	private Long replyId;

}
