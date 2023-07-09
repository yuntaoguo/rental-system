package com.lykj.rental.dto;

import com.lykj.rental.model.PmsProduct;
import com.lykj.rental.model.SmsFlashPromotionProductRelation;
import com.lykj.rental.model.PmsProduct;
import com.lykj.rental.model.SmsFlashPromotionProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购商品信息封装
 *  2018/11/16.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    @ApiModelProperty("关联商品")
    private PmsProduct product;
}
