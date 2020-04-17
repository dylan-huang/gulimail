package com.atguigu.gulimall.product.entity;

import com.atguigu.common.valid.ListValue;
import com.atguigu.common.valid.AddGroup;
import com.atguigu.common.valid.UpdateGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 *
 * 分组校验（多场景复杂校验）：
 * 添加分组校验功能，使用后，只有标注的属性才会校验
 * 默认没有指定分组的校验注解，在分组情况下默认不生效，只会在不分组的情况下生效
 *
 * 自定义校验：
 * 编写自定义校验注解
 * 编写自定义校验器
 * 关联自定义校验器和自定义校验注解
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ∆∑≈∆id
	 */
	@TableId
	@NotNull(message = "修改不能为空",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定id",groups = {AddGroup.class})
	private Long brandId;
	/**
	 * ∆∑≈∆√˚
	 */
	@NotNull(message = "商品名称不能为空",groups = {AddGroup.class,UpdateGroup.class})
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
	@ListValue(vals = {0,1},message = "error value")
	private Integer showStatus;
	/**
	 * ºÏÀ˜ ◊◊÷ƒ∏
	 */
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]$",message = "必须是一个字母")
	private String firstLetter;
	/**
	 * ≈≈–Ú
	 */
	@NotNull
	@Min(value = 0,message = "值必须大于0")
	private Integer sort;

}
