package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ∆∑≈∆
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ∆∑≈∆id
	 */
	@TableId
	private Long brandId;
	/**
	 * ∆∑≈∆√˚
	 */
	private String name;
	/**
	 * ∆∑≈∆logoµÿ÷∑
	 */
	private String logo;
	/**
	 * ΩÈ…‹
	 */
	private String descript;
	/**
	 * œ‘ æ◊¥Ã¨[0-≤ªœ‘ æ£ª1-œ‘ æ]
	 */
	private Integer showStatus;
	/**
	 * ºÏÀ˜ ◊◊÷ƒ∏
	 */
	private String firstLetter;
	/**
	 * ≈≈–Ú
	 */
	private Integer sort;

}
