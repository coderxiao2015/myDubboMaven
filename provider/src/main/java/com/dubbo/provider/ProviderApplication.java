package com.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication(scanBasePackages = "com.dubbo.provider")
@PropertySource("classpath:/application.properties")
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyProviderConfig.class);
        context.start();
    }

    /**
     * ②默认读取xml 配置文件
     */
   /* public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }*/
}
