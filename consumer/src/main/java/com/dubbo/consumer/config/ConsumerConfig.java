package com.dubbo.consumer.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/dubbo-consumer.properties")
@ComponentScan(value = "com.dubbo.consumer")
public class ConsumerConfig {


    /**
     *  zookeeper 注册中心地址
     */
    @Value("${dubbo.register.address}")
    private String registerAddress;

    @Value("${dubbo.consumer.check}")
    private Boolean isCheck;





    @Value("${dubbo.application.name}")
    private String serviceName;



    /**
     * @Bean 注解和<bean></bean>的标签作用一样，都是用来实例化一个对象
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registerAddress);
        registryConfig.setCheck(isCheck);
        return registryConfig;
    }

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config = new ApplicationConfig();
        config.setName(serviceName);
        config.setRegistry(registryConfig());
        return config;
    }

}
