package com.lykj.rental.portal.domain;

import com.lykj.rental.model.PmsProduct;
import com.lykj.rental.model.PmsProductFullReduction;
import com.lykj.rental.model.PmsProductLadder;
import com.lykj.rental.model.PmsSkuStock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 促销商品信息，包括sku、打折优惠、满减优惠
 *  2018/8/27.
 */
@Getter
@Setter
public class PromotionProduct extends PmsProduct {
    //商品库存信息
    private List<PmsSkuStock> skuStockList;
    //商品打折信息
    private List<PmsProductLadder> productLadderList;
    //商品满减信息
    private List<PmsProductFullReduction> productFullReductionList;
}
