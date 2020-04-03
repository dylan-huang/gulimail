package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * skuÕº∆¨
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * Õº∆¨µÿ÷∑
	 */
	private String imgUrl;
	/**
	 * ≈≈–Ú
	 */
	private Integer imgSort;
	/**
	 * ƒ¨»œÕº[0 - ≤ª «ƒ¨»œÕº£¨1 -  «ƒ¨»œÕº]
	 */
	private Integer defaultImg;

}
