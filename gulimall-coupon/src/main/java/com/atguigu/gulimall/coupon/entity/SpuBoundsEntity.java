package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * …Ã∆∑spuª˝∑÷…Ë÷√
 * 
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-03 17:09:34
 */
@Data
@TableName("sms_spu_bounds")
public class SpuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long spuId;
	/**
	 * ≥…≥§ª˝∑÷
	 */
	private BigDecimal growBounds;
	/**
	 * π∫ŒÔª˝∑÷
	 */
	private BigDecimal buyBounds;
	/**
	 * ”≈ª›…˙–ß«Èøˆ[1111£®Àƒ∏ˆ◊¥Ã¨Œª£¨¥””“µΩ◊Û£©;0 - Œﬁ”≈ª›£¨≥…≥§ª˝∑÷ «∑Ò‘˘ÀÕ;1 - Œﬁ”≈ª›£¨π∫ŒÔª˝∑÷ «∑Ò‘˘ÀÕ;2 - ”–”≈ª›£¨≥…≥§ª˝∑÷ «∑Ò‘˘ÀÕ;3 - ”–”≈ª›£¨π∫ŒÔª˝∑÷ «∑Ò‘˘ÀÕ°æ◊¥Ã¨Œª0£∫≤ª‘˘ÀÕ£¨1£∫‘˘ÀÕ°ø]
	 */
	private Integer work;

}
