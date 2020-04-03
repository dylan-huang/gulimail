package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÕÀøÓ–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÕÀøÓµƒ∂©µ•
	 */
	private Long orderReturnId;
	/**
	 * ÕÀøÓΩ∂Ó
	 */
	private BigDecimal refund;
	/**
	 * ÕÀøÓΩª“◊¡˜ÀÆ∫≈
	 */
	private String refundSn;
	/**
	 * ÕÀøÓ◊¥Ã¨
	 */
	private Integer refundStatus;
	/**
	 * ÕÀøÓ«˛µ¿[1-÷ß∏∂±¶£¨2-Œ¢–≈£¨3-“¯¡™£¨4-ª„øÓ]
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

}
