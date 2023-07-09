package com.lykj.rental.service;

import com.lykj.rental.model.CmsPrefrenceArea;
import com.lykj.rental.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 商品优选管理Service
 *  2018/6/1.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
