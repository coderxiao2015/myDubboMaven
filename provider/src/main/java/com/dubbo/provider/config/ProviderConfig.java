package com.dubbo.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
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
@EnableDubbo(scanBasePackages = "com.dubbo.provider")
@PropertySource("classpath:/dubbo_provider.properties")
public class ProviderConfig {

    int timeout;

    /**
     * @Bean 注解和<bean></bean>的标签作用一样，都是用来实例化一个对象
     * @return
     */
    @Bean
    public ProviderConfig providerConfig(){
        ProviderConfig providerConfig=new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
