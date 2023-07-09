package com.lykj.rental.service.impl;

import com.lykj.rental.mapper.OmsOrderSettingMapper;
import com.lykj.rental.model.OmsOrderSetting;
import com.lykj.rental.mapper.OmsOrderSettingMapper;
import com.lykj.rental.model.OmsOrderSetting;
import com.lykj.rental.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单设置管理Service实现类
 *  2018/10/16.
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
