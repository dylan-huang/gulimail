package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ◊®Ã‚…Ã∆∑
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:33
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ◊®Ã‚√˚◊÷
	 */
	private String name;
	/**
	 * ◊®Ã‚id
	 */
	private Long subjectId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ≈≈–Ú
	 */
	private Integer sort;

}
