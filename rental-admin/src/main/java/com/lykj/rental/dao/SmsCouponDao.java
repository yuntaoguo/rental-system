package com.lykj.rental.dao;

import com.lykj.rental.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 优惠券管理自定义Dao
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
