package com.dubbo.consumer.config;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * 测试nacos 外化配置
 */
@Configuration
@PropertySource("classpath:/dubbo-consumer.properties")
@ComponentScan(value = "com.dubbo.consumer")
public class ConsumerNacosDynamicConfig {


    @Value("${dubbo.registry.address}")
    private String registerAddress;

    @Value("${nacos.consumer.dataId}")
    private String dataId;

    @Value("${nacos.consumer.group}")
    private String group;

    public String name;


    @Bean
    public ConsumerAttribute NacosDynamicConfig() throws NacosException {
        ConsumerAttribute arrayAttribute = new ConsumerAttribute();
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.SERVER_ADDR, registerAddress);
        ConfigService configService = NacosFactory.createConfigService(properties);
        String content = configService.getConfig(dataId, group, 5000);
        System.out.println(content);
        configService.addListener(dataId, group, new Listener() {
            @Override
            public void receiveConfigInfo(String configInfo) {
                System.out.println("recieve:" + configInfo);
                arrayAttribute.setName(configInfo);
            }

            @Override
            public Executor getExecutor() {

                return null;
            }
        });

        boolean isPublishOk = false;
        /*try {
            isPublishOk = configService.publishConfig(dataId, group, "content");

            System.out.println(isPublishOk);

            Thread.sleep(3000);
            content = configService.getConfig(dataId, group, 5000);
            System.out.println(content);

            boolean isRemoveOk = configService.removeConfig(dataId, group);
            System.out.println(isRemoveOk);
            Thread.sleep(3000);

            content = configService.getConfig(dataId, group, 5000);
            System.out.println(content);
            Thread.sleep(300000);
        } catch (NacosException | InterruptedException e) {
            e.printStackTrace();
        }*/
    return arrayAttribute;
    }




}
