package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ∂©µ•ÕÀªı…Í«Î
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * ÕÀªı…Ã∆∑id
	 */
	private Long skuId;
	/**
	 * ∂©µ•±‡∫≈
	 */
	private String orderSn;
	/**
	 * …Í«Î ±º‰
	 */
	private Date createTime;
	/**
	 * ª·‘±”√ªß√˚
	 */
	private String memberUsername;
	/**
	 * ÕÀøÓΩ∂Ó
	 */
	private BigDecimal returnAmount;
	/**
	 * ÕÀªı»À–’√˚
	 */
	private String returnName;
	/**
	 * ÕÀªı»ÀµÁª∞
	 */
	private String returnPhone;
	/**
	 * …Í«Î◊¥Ã¨[0->¥˝¥¶¿Ì£ª1->ÕÀªı÷–£ª2->“—ÕÍ≥…£ª3->“—æ‹æ¯]
	 */
	private Integer status;
	/**
	 * ¥¶¿Ì ±º‰
	 */
	private Date handleTime;
	/**
	 * …Ã∆∑Õº∆¨
	 */
	private String skuImg;
	/**
	 * …Ã∆∑√˚≥∆
	 */
	private String skuName;
	/**
	 * …Ã∆∑∆∑≈∆
	 */
	private String skuBrand;
	/**
	 * …Ã∆∑œ˙ € Ù–‘(JSON)
	 */
	private String skuAttrsVals;
	/**
	 * ÕÀªı ˝¡ø
	 */
	private Integer skuCount;
	/**
	 * …Ã∆∑µ•º€
	 */
	private BigDecimal skuPrice;
	/**
	 * …Ã∆∑ µº ÷ß∏∂µ•º€
	 */
	private BigDecimal skuRealPrice;
	/**
	 * ‘≠“Ú
	 */
	private String reason;
	/**
	 * √Ë ˆ
	 */
	private String description;
	/**
	 * ∆æ÷§Õº∆¨£¨“‘∂∫∫≈∏Ùø™
	 */
	private String descPics;
	/**
	 * ¥¶¿Ì±∏◊¢
	 */
	private String handleNote;
	/**
	 * ¥¶¿Ì»À‘±
	 */
	private String handleMan;
	/**
	 *  ’ªı»À
	 */
	private String receiveMan;
	/**
	 *  ’ªı ±º‰
	 */
	private Date receiveTime;
	/**
	 *  ’ªı±∏◊¢
	 */
	private String receiveNote;
	/**
	 *  ’ªıµÁª∞
	 */
	private String receivePhone;
	/**
	 * π´Àæ ’ªıµÿ÷∑
	 */
	private String companyAddress;

}
