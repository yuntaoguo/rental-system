package com.lykj.rental.dto;

import com.lykj.rental.model.SmsCoupon;
import com.lykj.rental.model.SmsCouponProductCategoryRelation;
import com.lykj.rental.model.SmsCouponProductRelation;
import com.lykj.rental.model.SmsCoupon;
import com.lykj.rental.model.SmsCouponProductCategoryRelation;
import com.lykj.rental.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 优惠券信息封装，包括绑定商品和分类
 *  2018/8/28.
 */
public class SmsCouponParam extends SmsCoupon {
    @Getter
    @Setter
    @ApiModelProperty("优惠券绑定的商品")
    private List<SmsCouponProductRelation> productRelationList;
    @Getter
    @Setter
    @ApiModelProperty("优惠券绑定的商品分类")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
