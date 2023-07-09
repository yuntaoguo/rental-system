package com.lykj.rental.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 *  2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.lykj.rental.mapper","com.lykj.rental.portal.dao"})
public class MyBatisConfig {
}
