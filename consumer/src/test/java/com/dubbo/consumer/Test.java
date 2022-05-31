package com.dubbo.consumer;

import com.dubbo.consumer.hello.GreetingServiceConsumer;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    GreetingServiceConsumer GreetingServiceConsumer;

   @org.junit.Test
    public void test1(){
        GreetingServiceConsumer.consume();
    }

}
