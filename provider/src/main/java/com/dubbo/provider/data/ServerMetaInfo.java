package com.dubbo.provider.data;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 服务信息
 */
@Component
@RefreshScope
public class ServerMetaInfo {

    @Value(value = "${nacos}")
    private String nacosConfigName;




    public String getNacosConfigName() {
        return nacosConfigName;
    }
}
