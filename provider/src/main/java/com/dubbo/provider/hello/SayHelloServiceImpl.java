package com.dubbo.provider.hello;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * 使用dubbo的@service 暴露这个接口. 服务提供者提供服务
 */
@Service(version = "1.0.0",interfaceName = "sayHelloService")
public class SayHelloServiceImpl implements SayHelloService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name){
        System.out.println(name+"调用服务"+" "+serviceName+"提供服务");
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

}
