package com.lykj.rental.dao;

import com.lykj.rental.model.SmsCouponProductCategoryRelation;
import com.lykj.rental.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券和商品分类关系管理自定义Dao
 */
public interface SmsCouponProductCategoryRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list")List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
