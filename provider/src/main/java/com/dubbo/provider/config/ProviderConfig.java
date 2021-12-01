package com.dubbo.provider.config;


import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author coderxiao
 * @date 2019/09/24
 * @descrption 服务提供方注解
 */
@Configuration
/**
 * @EnableDubbo 扫描包下dubbo注解的文件
 */
@PropertySource("classpath:/dubbo-provider.properties")
public class ProviderConfig {

    @Value("${spring.application.timeout}")
    int timeout;

    /**
     *  zookeeper 注册中心地址
     */
    @Value("${dubbo.register.address}")
    private String registerAddress;

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


}
