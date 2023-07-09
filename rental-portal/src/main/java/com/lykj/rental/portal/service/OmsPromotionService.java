package com.lykj.rental.portal.service;

import com.lykj.rental.portal.domain.CartPromotionItem;
import com.lykj.rental.model.OmsCartItem;

import java.util.List;

/**
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
