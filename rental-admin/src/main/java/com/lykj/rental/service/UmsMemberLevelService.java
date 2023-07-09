package com.lykj.rental.service;

import com.lykj.rental.model.UmsMemberLevel;
import com.lykj.rental.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理Service
 *
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员等级
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
