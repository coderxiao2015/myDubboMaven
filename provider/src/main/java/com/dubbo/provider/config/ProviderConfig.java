package com.dubbo.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author coderxiao
 * @date 2019/09/24
 * @descrption 服务提供方注解
 */
@Configuration
@EnableDubbo
@PropertySource("classpath:/application.properties")
public class ProviderConfig {




}
