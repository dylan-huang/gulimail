package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ≤÷ø‚–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:27:20
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ≤÷ø‚√˚
	 */
	private String name;
	/**
	 * ≤÷ø‚µÿ÷∑
	 */
	private String address;
	/**
	 * «¯”Ú±‡¬Î
	 */
	private String areacode;

}
