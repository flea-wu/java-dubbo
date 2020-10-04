//package com.nbjike.config;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * 描述:
// *
// * <p>
// *
// * @author tiaozao
// * @date 2020-09-22 22:43
// */
//@Configuration
//public class ProviderConfig {
//
//    /**
//     * 当前应用配置
//     */
//    @Bean("dubbo-annotation-provider")
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("provider-dubbo-server");
//        return applicationConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置
//     */
//    @Bean("my-registry")
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("redis://127.0.0.1:11328");
//        registryConfig.setUsername("root");
//        registryConfig.setPassword("wawaji");
//        return registryConfig;
//    }
//
//}
