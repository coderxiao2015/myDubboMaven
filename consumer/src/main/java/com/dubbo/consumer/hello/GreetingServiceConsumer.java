package com.dubbo.consumer.hello;


import hello.SayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GreetingServiceConsumer {

    Logger logger = LoggerFactory.getLogger(GreetingServiceConsumer.class);

    @DubboReference( version="1.0.1" , interfaceClass = SayHelloService.class,retries = 3)
    SayHelloService sayHelloService;

    public void consume(){
        System.out.println("消费者开始消费");
        sayHelloService.sayHello("测试");
        System.out.println("消费者调用结束");
    }


}
