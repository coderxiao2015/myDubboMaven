package com.dubbo.consumer.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 走默认配置
 */
@Configuration
@PropertySource("classpath:/dubbo-consumer.properties")
@ComponentScan(value = "com.dubbo.consumer")
public class ConsumerConfig {

/*

    @Value("${spring.application.timeout}")
    int timeout;

    */
/**
     *  zookeeper 注册中心地址
     *//*


    @Value("${dubbo.registry.address}")
    private String registerAddress;



    @Value("${dubbo.application.name}")
    private String serviceName;




    */
/**
     * @Bean 注解和<bean></bean>的标签作用一样，都是用来实例化一个对象
     * @return
     *//*

   @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registerAddress);
        registryConfig.setTimeout(timeout);
        return registryConfig;
    }

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config = new ApplicationConfig();
        config.setName(serviceName);
        config.setRegistry(registryConfig());
        return config;
    }
*/



}
