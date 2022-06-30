package com.dubbo.consumer.config;

import org.springframework.stereotype.Component;

/**
 * 实体类
 */
@Component
public class ConsumerAttribute {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
