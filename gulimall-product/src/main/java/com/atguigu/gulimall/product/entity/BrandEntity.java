package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
	@NotNull(message = "商品名称不能为空")
	private String name;
	/**
	 * ∆∑≈∆logoµÿ÷∑
	 */
	@NotNull
	@URL(message = "logo必须是合法的url")
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
	@NotNull
	@Pattern(regexp = "/^[a-zA-Z]$/",message = "必须是一个字母")
	private String firstLetter;
	/**
	 * ≈≈–Ú
	 */
	@NotNull
	@Min(value = 0,message = "值必须大于0")
	private Integer sort;

}
