package com.dubbo.consumer;

import com.dubbo.consumer.hello.GreetingServiceConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

    @Autowired
    GreetingServiceConsumer consumer;

    @Test
    public void contextLoads() {
        for(int i=0;i<100;i++){
            new Thread(new Runnable() {
                public void run() {
                    try {
                        consumer.consume();
                    }catch(Exception e){
                       // e.printStackTrace();
                        System.out.println("异常:"+e.getMessage());
                    }
                }
            }).start();
        }
    }

}
