package com.lykj.rental.service.impl;

import cn.hutool.core.util.StrUtil;
import com.lykj.rental.dao.PmsSkuStockDao;
import com.lykj.rental.mapper.PmsSkuStockMapper;
import com.lykj.rental.model.PmsSkuStock;
import com.lykj.rental.model.PmsSkuStockExample;
import com.lykj.rental.dao.PmsSkuStockDao;
import com.lykj.rental.mapper.PmsSkuStockMapper;
import com.lykj.rental.model.PmsSkuStock;
import com.lykj.rental.model.PmsSkuStockExample;
import com.lykj.rental.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品SKU库存管理Service实现类
 *  2018/4/27.
 */
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService {
    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsSkuStockDao skuStockDao;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StrUtil.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockDao.replaceList(skuStockList);
    }
}
