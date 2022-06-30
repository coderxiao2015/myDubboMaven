# 服务提供者
    
## 描述
    此模块是服务提供者模块，主要功能是提供服务，将服务注册到注册中心，发布服务,此模块的dubbo服务配置
    采用注解的形式
    
## 搭建流程
    1.配置pom.xml 文件，让其继承父模块
    
    2.采用注解的形式将注册中心，服务名称，端口号等配置信息加载到服务中com.dubbo.provider.config.ProviderConfig.java
    
    3.编写服务提供接口com.dubbo.provider.hello.SayHelloServiceImpl
    


