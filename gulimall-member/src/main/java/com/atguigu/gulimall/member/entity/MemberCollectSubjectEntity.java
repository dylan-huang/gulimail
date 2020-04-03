package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ª·‘± ’≤ÿµƒ◊®Ã‚ªÓ∂Ø
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * subject_id
	 */
	private Long subjectId;
	/**
	 * subject_name
	 */
	private String subjectName;
	/**
	 * subject_img
	 */
	private String subjectImg;
	/**
	 * ªÓ∂Øurl
	 */
	private String subjectUrll;

}
