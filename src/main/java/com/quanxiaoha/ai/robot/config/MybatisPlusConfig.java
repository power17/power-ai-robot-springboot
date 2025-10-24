package com.quanxiaoha.ai.robot.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 犬小哈
 * @Date: 2025/8/12 16:40
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Configuration
@MapperScan("com.quanxiaoha.ai.robot.domain.mapper")

public class MybatisPlusConfig {
}

