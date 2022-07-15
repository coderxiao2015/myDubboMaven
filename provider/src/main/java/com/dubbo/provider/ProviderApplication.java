package com.dubbo.provider;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.dubbo.provider.data.ServerMetaInfo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;



@SpringBootApplication(scanBasePackages = "com.dubbo.provider")
@PropertySource("classpath:/application.properties")
@NacosPropertySource(dataId = "myDubboProvider.yaml", autoRefreshed = true)
@EnableDubbo
public class ProviderApplication {

    /**
     *①
     * 将dubbo 的配置文件在项目启动的时候加载进入项目
     * 使用场景： If Spring MVC is present, an AnnotationConfigServletWebServerApplicationContext is used
     *          [如果使用springmvc,则AnnotationConfigServletWebServerApplicationContext 可以用来指定以注解的形式加载配置文件]
     * AnnotationConfigApplicationContext 名称解释：将注解的实例注册到上下文中
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ProviderApplication.class);

        String userAge = applicationContext.getEnvironment().getProperty("nacos");
        System.err.println("=================age: "+userAge);

        ServerMetaInfo bean = applicationContext.getBean(ServerMetaInfo.class);
        System.err.println("=================bean-nacos: "+bean.getNacosConfigName());




    }

}
