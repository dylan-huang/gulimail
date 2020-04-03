package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ∂©µ•
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_order")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * ∂©µ•∫≈
	 */
	private String orderSn;
	/**
	 *  π”√µƒ”≈ª›»Ø
	 */
	private Long couponId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ”√ªß√˚
	 */
	private String memberUsername;
	/**
	 * ∂©µ•◊‹∂Ó
	 */
	private BigDecimal totalAmount;
	/**
	 * ”¶∏∂◊‹∂Ó
	 */
	private BigDecimal payAmount;
	/**
	 * ‘À∑—Ω∂Ó
	 */
	private BigDecimal freightAmount;
	/**
	 * ¥Ÿœ˙”≈ªØΩ∂Ó£®¥Ÿœ˙º€°¢¬˙ºı°¢Ω◊Ã›º€£©
	 */
	private BigDecimal promotionAmount;
	/**
	 * ª˝∑÷µ÷ø€Ω∂Ó
	 */
	private BigDecimal integrationAmount;
	/**
	 * ”≈ª›»Øµ÷ø€Ω∂Ó
	 */
	private BigDecimal couponAmount;
	/**
	 * ∫ÛÃ®µ˜’˚∂©µ• π”√µƒ’€ø€Ω∂Ó
	 */
	private BigDecimal discountAmount;
	/**
	 * ÷ß∏∂∑Ω Ω°æ1->÷ß∏∂±¶£ª2->Œ¢–≈£ª3->“¯¡™£ª 4->ªıµΩ∏∂øÓ£ª°ø
	 */
	private Integer payType;
	/**
	 * ∂©µ•¿¥‘¥[0->PC∂©µ•£ª1->app∂©µ•]
	 */
	private Integer sourceType;
	/**
	 * ∂©µ•◊¥Ã¨°æ0->¥˝∏∂øÓ£ª1->¥˝∑¢ªı£ª2->“—∑¢ªı£ª3->“—ÕÍ≥…£ª4->“—πÿ±’£ª5->Œﬁ–ß∂©µ•°ø
	 */
	private Integer status;
	/**
	 * ŒÔ¡˜π´Àæ(≈‰ÀÕ∑Ω Ω)
	 */
	private String deliveryCompany;
	/**
	 * ŒÔ¡˜µ•∫≈
	 */
	private String deliverySn;
	/**
	 * ◊‘∂Ø»∑»œ ±º‰£®ÃÏ£©
	 */
	private Integer autoConfirmDay;
	/**
	 * ø…“‘ªÒµ√µƒª˝∑÷
	 */
	private Integer integration;
	/**
	 * ø…“‘ªÒµ√µƒ≥…≥§÷µ
	 */
	private Integer growth;
	/**
	 * ∑¢∆±¿‡–Õ[0->≤ªø™∑¢∆±£ª1->µÁ◊”∑¢∆±£ª2->÷Ω÷ ∑¢∆±]
	 */
	private Integer billType;
	/**
	 * ∑¢∆±ÃßÕ∑
	 */
	private String billHeader;
	/**
	 * ∑¢∆±ƒ⁄»›
	 */
	private String billContent;
	/**
	 *  ’∆±»ÀµÁª∞
	 */
	private String billReceiverPhone;
	/**
	 *  ’∆±»À” œ‰
	 */
	private String billReceiverEmail;
	/**
	 *  ’ªı»À–’√˚
	 */
	private String receiverName;
	/**
	 *  ’ªı»ÀµÁª∞
	 */
	private String receiverPhone;
	/**
	 *  ’ªı»À” ±‡
	 */
	private String receiverPostCode;
	/**
	 *  °∑›/÷±œΩ –
	 */
	private String receiverProvince;
	/**
	 * ≥« –
	 */
	private String receiverCity;
	/**
	 * «¯
	 */
	private String receiverRegion;
	/**
	 * œÍœ∏µÿ÷∑
	 */
	private String receiverDetailAddress;
	/**
	 * ∂©µ•±∏◊¢
	 */
	private String note;
	/**
	 * »∑»œ ’ªı◊¥Ã¨[0->Œ¥»∑»œ£ª1->“—»∑»œ]
	 */
	private Integer confirmStatus;
	/**
	 * …æ≥˝◊¥Ã¨°æ0->Œ¥…æ≥˝£ª1->“—…æ≥˝°ø
	 */
	private Integer deleteStatus;
	/**
	 * œ¬µ• ± π”√µƒª˝∑÷
	 */
	private Integer useIntegration;
	/**
	 * ÷ß∏∂ ±º‰
	 */
	private Date paymentTime;
	/**
	 * ∑¢ªı ±º‰
	 */
	private Date deliveryTime;
	/**
	 * »∑»œ ’ªı ±º‰
	 */
	private Date receiveTime;
	/**
	 * ∆¿º€ ±º‰
	 */
	private Date commentTime;
	/**
	 * –ﬁ∏ƒ ±º‰
	 */
	private Date modifyTime;

}
