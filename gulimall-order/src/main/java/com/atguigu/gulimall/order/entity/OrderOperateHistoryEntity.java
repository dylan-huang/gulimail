package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ∂©µ•≤Ÿ◊˜¿˙ ∑º«¬º
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ∂©µ•id
	 */
	private Long orderId;
	/**
	 * ≤Ÿ◊˜»À[”√ªß£ªœµÕ≥£ª∫ÛÃ®π‹¿Ì‘±]
	 */
	private String operateMan;
	/**
	 * ≤Ÿ◊˜ ±º‰
	 */
	private Date createTime;
	/**
	 * ∂©µ•◊¥Ã¨°æ0->¥˝∏∂øÓ£ª1->¥˝∑¢ªı£ª2->“—∑¢ªı£ª3->“—ÕÍ≥…£ª4->“—πÿ±’£ª5->Œﬁ–ß∂©µ•°ø
	 */
	private Integer orderStatus;
	/**
	 * ±∏◊¢
	 */
	private String note;

}
