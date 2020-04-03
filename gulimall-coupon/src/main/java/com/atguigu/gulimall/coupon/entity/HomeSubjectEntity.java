package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *  ◊“≥◊®Ã‚±Ì°æjd ◊“≥œ¬√Ê∫‹∂‡◊®Ã‚£¨√ø∏ˆ◊®Ã‚¡¥Ω”–¬µƒ“≥√Ê£¨’π æ◊®Ã‚…Ã∆∑–≈œ¢°ø
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ◊®Ã‚√˚◊÷
	 */
	private String name;
	/**
	 * ◊®Ã‚±ÍÃ‚
	 */
	private String title;
	/**
	 * ◊®Ã‚∏±±ÍÃ‚
	 */
	private String subTitle;
	/**
	 * œ‘ æ◊¥Ã¨
	 */
	private Integer status;
	/**
	 * œÍ«È¡¨Ω”
	 */
	private String url;
	/**
	 * ≈≈–Ú
	 */
	private Integer sort;
	/**
	 * ◊®Ã‚Õº∆¨µÿ÷∑
	 */
	private String img;

}
