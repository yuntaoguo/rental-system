package com.lykj.rental.portal.service;

import com.lykj.rental.portal.domain.PmsPortalProductDetail;
import com.lykj.rental.portal.domain.PmsProductCategoryNode;
import com.lykj.rental.model.PmsProduct;

import java.util.List;

/**
 * 前台商品管理Service
 *  2020/4/6.
 */
public interface PmsPortalProductService {
    /**
     * 综合搜索商品
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 以树形结构获取所有商品分类
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * 获取前台商品详情
     */
    PmsPortalProductDetail detail(Long id);
}
