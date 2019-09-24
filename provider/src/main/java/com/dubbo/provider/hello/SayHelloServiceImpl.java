package com.dubbo.provider.hello;

import org.apache.dubbo.config.annotation.Service;

/**
 * 使用dubbo的@service 暴露这个接口. 服务提供者提供服务
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {

    public String sayHello(String name){
        System.out.println(name+"调用服务");
        return "hello "+name;
    }

}
