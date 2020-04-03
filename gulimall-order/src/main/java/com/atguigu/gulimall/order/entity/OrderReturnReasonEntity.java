package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÕÀªı‘≠“Ú
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÕÀªı‘≠“Ú√˚
	 */
	private String name;
	/**
	 * ≈≈–Ú
	 */
	private Integer sort;
	/**
	 * ∆Ù”√◊¥Ã¨
	 */
	private Integer status;
	/**
	 * create_time
	 */
	private Date createTime;

}
