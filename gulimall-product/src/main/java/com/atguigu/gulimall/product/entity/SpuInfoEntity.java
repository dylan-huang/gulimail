package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * …Ã∆∑id
	 */
	@TableId
	private Long id;
	/**
	 * …Ã∆∑√˚≥∆
	 */
	private String spuName;
	/**
	 * …Ã∆∑√Ë ˆ
	 */
	private String spuDescription;
	/**
	 * À˘ Ù∑÷¿‡id
	 */
	private Long catalogId;
	/**
	 * ∆∑≈∆id
	 */
	private Long brandId;
	/**
	 * 
	 */
	private BigDecimal weight;
	/**
	 * …œº‹◊¥Ã¨[0 - œ¬º‹£¨1 - …œº‹]
	 */
	private Integer publishStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
