package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ª·‘± ’ªıµÿ÷∑
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:12:54
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
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
	 *  ’ªı»À–’√˚
	 */
	private String name;
	/**
	 * µÁª∞
	 */
	private String phone;
	/**
	 * ” ’˛±‡¬Î
	 */
	private String postCode;
	/**
	 *  °∑›/÷±œΩ –
	 */
	private String province;
	/**
	 * ≥« –
	 */
	private String city;
	/**
	 * «¯
	 */
	private String region;
	/**
	 * œÍœ∏µÿ÷∑(Ω÷µ¿)
	 */
	private String detailAddress;
	/**
	 *  ° –«¯¥˙¬Î
	 */
	private String areacode;
	/**
	 *  «∑Òƒ¨»œ
	 */
	private Integer defaultStatus;

}
