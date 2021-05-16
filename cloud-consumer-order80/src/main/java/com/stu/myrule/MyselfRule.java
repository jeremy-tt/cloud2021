package com.stu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    Ribbion负载均衡分配策略的修改
    1、添加MyRule类
    2、启动类加注解
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
}
