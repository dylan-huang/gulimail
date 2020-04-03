package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *  Ù–‘& Ù–‘∑÷◊Èπÿ¡™
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 *  Ù–‘id
	 */
	private Long attrId;
	/**
	 *  Ù–‘∑÷◊Èid
	 */
	private Long attrGroupId;
	/**
	 *  Ù–‘◊Èƒ⁄≈≈–Ú
	 */
	private Integer attrSort;

}
