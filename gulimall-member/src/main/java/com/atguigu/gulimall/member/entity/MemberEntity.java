package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ª·‘±
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ª·‘±µ»º∂id
	 */
	private Long levelId;
	/**
	 * ”√ªß√˚
	 */
	private String username;
	/**
	 * √‹¬Î
	 */
	private String password;
	/**
	 * Í«≥∆
	 */
	private String nickname;
	/**
	 *  ÷ª˙∫≈¬Î
	 */
	private String mobile;
	/**
	 * ” œ‰
	 */
	private String email;
	/**
	 * Õ∑œÒ
	 */
	private String header;
	/**
	 * –‘±
	 */
	private Integer gender;
	/**
	 * …˙»’
	 */
	private Date birth;
	/**
	 * À˘‘⁄≥« –
	 */
	private String city;
	/**
	 * ÷∞“µ
	 */
	private String job;
	/**
	 * ∏ˆ–‘«©√˚
	 */
	private String sign;
	/**
	 * ”√ªß¿¥‘¥
	 */
	private Integer sourceType;
	/**
	 * ª˝∑÷
	 */
	private Integer integration;
	/**
	 * ≥…≥§÷µ
	 */
	private Integer growth;
	/**
	 * ∆Ù”√◊¥Ã¨
	 */
	private Integer status;
	/**
	 * ◊¢≤· ±º‰
	 */
	private Date createTime;

}
