package com.lykj.rental.dto;

import com.lykj.rental.model.OmsCompanyAddress;
import com.lykj.rental.model.OmsOrderReturnApply;
import com.lykj.rental.model.OmsCompanyAddress;
import com.lykj.rental.model.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 *  2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
