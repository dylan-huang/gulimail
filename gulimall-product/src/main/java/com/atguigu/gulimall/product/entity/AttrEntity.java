package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑ Ù–‘
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *  Ù–‘id
	 */
	@TableId
	private Long attrId;
	/**
	 *  Ù–‘√˚
	 */
	private String attrName;
	/**
	 *  «∑Ò–Ë“™ºÏÀ˜[0-≤ª–Ë“™£¨1-–Ë“™]
	 */
	private Integer searchType;
	/**
	 *  Ù–‘Õº±Í
	 */
	private String icon;
	/**
	 * ø…—°÷µ¡–±Ì[”√∂∫∫≈∑÷∏Ù]
	 */
	private String valueSelect;
	/**
	 *  Ù–‘¿‡–Õ[0-œ˙ € Ù–‘£¨1-ª˘±æ Ù–‘£¨2-º» «œ˙ € Ù–‘”÷ «ª˘±æ Ù–‘]
	 */
	private Integer attrType;
	/**
	 * ∆Ù”√◊¥Ã¨[0 - Ω˚”√£¨1 - ∆Ù”√]
	 */
	private Long enable;
	/**
	 * À˘ Ù∑÷¿‡
	 */
	private Long catelogId;
	/**
	 * øÏÀŸ’π æ°æ «∑Ò’π æ‘⁄ΩÈ…‹…œ£ª0-∑Ò 1- «°ø£¨‘⁄sku÷–»‘»ªø…“‘µ˜’˚
	 */
	private Integer showDesc;

}
