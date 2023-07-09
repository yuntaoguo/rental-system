package com.lykj.rental.common.api;

/**
 * API返回码接口
 *  2019/4/19.
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
