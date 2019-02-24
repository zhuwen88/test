package com.shsxt.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloServiceTest {


    /**
     *  1 加载配置文件
     *  2 获取bean对象
     *  3 执行bean方法
     */
    @Test
    public void hello() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello("朱文");


    }
}