package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÕº∆¨
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * Õº∆¨√˚
	 */
	private String imgName;
	/**
	 * Õº∆¨µÿ÷∑
	 */
	private String imgUrl;
	/**
	 * À≥–Ú
	 */
	private Integer imgSort;
	/**
	 *  «∑Òƒ¨»œÕº
	 */
	private Integer defaultImg;

}
