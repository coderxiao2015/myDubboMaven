package com.dubbo.provider.hello;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import hello.SayHelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * 使用dubbo的@service 暴露这个接口. 服务提供者提供服务
 */
@DubboService(version = "1.0.1",interfaceName = "sayHelloService")
public class SayHelloServiceImpl implements SayHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;




    @Override
    public String sayHello(String name){
        System.out.println(name+"调用服务"+" "+serviceName+"提供服务");
        System.out.println(System.currentTimeMillis());
        return String.format("[%s] : Hello, %s", serviceName, name);
    }



}
