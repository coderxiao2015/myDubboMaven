package test;

import com.dubbo.provider.ProviderApplication;
import com.dubbo.provider.data.ServerMetaInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={ProviderApplication.class})
public class MyTest {

    @Autowired
    ServerMetaInfo sayHelloService;

    @Test
    public void test(){
        System.out.println(sayHelloService.getNacosConfigName());
    }

}
