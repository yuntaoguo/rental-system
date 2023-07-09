package com.lykj.rental.service;

import com.lykj.rental.dto.OssCallbackResult;
import com.lykj.rental.dto.OssPolicyResult;
import com.lykj.rental.dto.OssCallbackResult;
import com.lykj.rental.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss对象存储管理Service
 *  2018/5/17.
 */
public interface OssService {
    /**
     * Oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * Oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
