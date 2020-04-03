package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu Ù–‘÷µ
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * …Ã∆∑id
	 */
	private Long spuId;
	/**
	 *  Ù–‘id
	 */
	private Long attrId;
	/**
	 *  Ù–‘√˚
	 */
	private String attrName;
	/**
	 *  Ù–‘÷µ
	 */
	private String attrValue;
	/**
	 * À≥–Ú
	 */
	private Integer attrSort;
	/**
	 * øÏÀŸ’π æ°æ «∑Ò’π æ‘⁄ΩÈ…‹…œ£ª0-∑Ò 1- «°ø
	 */
	private Integer quickShow;

}
