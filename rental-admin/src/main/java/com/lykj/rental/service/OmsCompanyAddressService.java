package com.lykj.rental.service;

import com.lykj.rental.model.OmsCompanyAddress;
import com.lykj.rental.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管理Service
 *  2018/10/18.
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
