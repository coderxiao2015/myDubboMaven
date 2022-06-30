package hello;

public interface SayHelloService {

    public String sayHello(String name);


    /**
     * 获取动态化配置
     * @return
     */
     String getConfigName();
}
