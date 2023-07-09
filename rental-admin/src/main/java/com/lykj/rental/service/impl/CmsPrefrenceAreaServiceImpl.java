package com.lykj.rental.service.impl;

import com.lykj.rental.mapper.CmsPrefrenceAreaMapper;
import com.lykj.rental.model.CmsPrefrenceArea;
import com.lykj.rental.model.CmsPrefrenceAreaExample;
import com.lykj.rental.mapper.CmsPrefrenceAreaMapper;
import com.lykj.rental.model.CmsPrefrenceArea;
import com.lykj.rental.model.CmsPrefrenceAreaExample;
import com.lykj.rental.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选管理Service实现类
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
