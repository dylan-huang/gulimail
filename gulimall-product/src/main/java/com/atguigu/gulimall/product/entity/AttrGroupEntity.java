package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *  Ù–‘∑÷◊È
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ∑÷◊Èid
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * ◊È√˚
	 */
	private String attrGroupName;
	/**
	 * ≈≈–Ú
	 */
	private Integer sort;
	/**
	 * √Ë ˆ
	 */
	private String descript;
	/**
	 * ◊ÈÕº±Í
	 */
	private String icon;
	/**
	 * À˘ Ù∑÷¿‡id
	 */
	private Long catelogId;

}
