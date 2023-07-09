package com.lykj.rental.service.impl;

import com.lykj.rental.mapper.OmsCompanyAddressMapper;
import com.lykj.rental.model.OmsCompanyAddress;
import com.lykj.rental.model.OmsCompanyAddressExample;
import com.lykj.rental.mapper.OmsCompanyAddressMapper;
import com.lykj.rental.model.OmsCompanyAddress;
import com.lykj.rental.model.OmsCompanyAddressExample;
import com.lykj.rental.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 *  2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
