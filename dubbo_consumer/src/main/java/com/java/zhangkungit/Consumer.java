package com.java.zhangkungit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zk on 2017/5/20.
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();

        // get service invocation proxy
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("zk consumer");
        System.out.println(hello);
    }
}
