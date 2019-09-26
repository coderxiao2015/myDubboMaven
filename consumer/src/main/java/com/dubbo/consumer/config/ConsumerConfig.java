package com.dubbo.consumer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/dubbo_consumer.properties")
@EnableDubbo(scanBasePackages = "com.dubbo.consumer")
@ComponentScan(value = "com.dubbo.consumer")
public class ConsumerConfig {



}
