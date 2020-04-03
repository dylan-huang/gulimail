package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ∂©µ•≈‰÷√–≈œ¢
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:15:52
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * √Î…±∂©µ•≥¨ ±πÿ±’ ±º‰(∑÷)
	 */
	private Integer flashOrderOvertime;
	/**
	 * ’˝≥£∂©µ•≥¨ ± ±º‰(∑÷)
	 */
	private Integer normalOrderOvertime;
	/**
	 * ∑¢ªı∫Û◊‘∂Ø»∑»œ ’ªı ±º‰£®ÃÏ£©
	 */
	private Integer confirmOvertime;
	/**
	 * ◊‘∂ØÕÍ≥…Ωª“◊ ±º‰£¨≤ªƒ‹…Í«ÎÕÀªı£®ÃÏ£©
	 */
	private Integer finishOvertime;
	/**
	 * ∂©µ•ÕÍ≥…∫Û◊‘∂Ø∫√∆¿ ±º‰£®ÃÏ£©
	 */
	private Integer commentOvertime;
	/**
	 * ª·‘±µ»º∂°æ0-≤ªœﬁª·‘±µ»º∂£¨»´≤øÕ®”√£ª∆‰À˚-∂‘”¶µƒ∆‰À˚ª·‘±µ»º∂°ø
	 */
	private Integer memberLevel;

}
