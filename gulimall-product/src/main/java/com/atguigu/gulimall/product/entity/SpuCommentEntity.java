package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑∆¿º€
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
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
	 * spu_id
	 */
	private Long spuId;
	/**
	 * …Ã∆∑√˚◊÷
	 */
	private String spuName;
	/**
	 * ª·‘±Í«≥∆
	 */
	private String memberNickName;
	/**
	 * –«º∂
	 */
	private Integer star;
	/**
	 * ª·‘±ip
	 */
	private String memberIp;
	/**
	 * ¥¥Ω® ±º‰
	 */
	private Date createTime;
	/**
	 * œ‘ æ◊¥Ã¨[0-≤ªœ‘ æ£¨1-œ‘ æ]
	 */
	private Integer showStatus;
	/**
	 * π∫¬Ú ± Ù–‘◊È∫œ
	 */
	private String spuAttributes;
	/**
	 * µ„‘ﬁ ˝
	 */
	private Integer likesCount;
	/**
	 * ªÿ∏¥ ˝
	 */
	private Integer replyCount;
	/**
	 * ∆¿¬€Õº∆¨/ ”∆µ[json ˝æ›£ª[{type:Œƒº˛¿‡–Õ,url:◊ ‘¥¬∑æ∂}]]
	 */
	private String resources;
	/**
	 * ƒ⁄»›
	 */
	private String content;
	/**
	 * ”√ªßÕ∑œÒ
	 */
	private String memberIcon;
	/**
	 * ∆¿¬€¿‡–Õ[0 - ∂‘…Ã∆∑µƒ÷±Ω”∆¿¬€£¨1 - ∂‘∆¿¬€µƒªÿ∏¥]
	 */
	private Integer commentType;

}
