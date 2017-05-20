package com.java.zhangkungit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zk on 2017/5/20.
 */
public class DubboProviderDemo {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        context.start();

        System.in.read();
    }
}
