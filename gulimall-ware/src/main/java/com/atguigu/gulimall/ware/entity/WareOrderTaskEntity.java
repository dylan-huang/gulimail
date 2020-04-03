package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ø‚¥Êπ§◊˜µ•
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:27:20
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
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
	 * order_sn
	 */
	private String orderSn;
	/**
	 *  ’ªı»À
	 */
	private String consignee;
	/**
	 *  ’ªı»ÀµÁª∞
	 */
	private String consigneeTel;
	/**
	 * ≈‰ÀÕµÿ÷∑
	 */
	private String deliveryAddress;
	/**
	 * ∂©µ•±∏◊¢
	 */
	private String orderComment;
	/**
	 * ∏∂øÓ∑Ω Ω°æ 1:‘⁄œﬂ∏∂øÓ 2:ªıµΩ∏∂øÓ°ø
	 */
	private Integer paymentWay;
	/**
	 * »ŒŒÒ◊¥Ã¨
	 */
	private Integer taskStatus;
	/**
	 * ∂©µ•√Ë ˆ
	 */
	private String orderBody;
	/**
	 * ŒÔ¡˜µ•∫≈
	 */
	private String trackingNo;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ≤÷ø‚id
	 */
	private Long wareId;
	/**
	 * π§◊˜µ•±∏◊¢
	 */
	private String taskComment;

}
