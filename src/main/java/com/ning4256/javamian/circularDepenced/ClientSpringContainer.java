package com.ning4256.javamian.circularDepenced;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientSpringContainer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("a", A.class);
        context.getBean("b", B.class);
    }
}
