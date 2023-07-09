package com.lykj.rental.dao;

import com.lykj.rental.model.OmsOrderReturnApply;
import com.lykj.rental.dto.OmsOrderReturnApplyResult;
import com.lykj.rental.dto.OmsReturnApplyQueryParam;
import com.lykj.rental.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请管理自定义Dao
 *  2018/10/18.
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
