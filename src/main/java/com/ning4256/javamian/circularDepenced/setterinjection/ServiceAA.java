package com.ning4256.javamian.circularDepenced.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class ServiceAA {
    private ServiceBB serviceBB;

    public ServiceAA(ServiceBB serviceBB) {
        this.serviceBB = serviceBB;
        System.out.println("serviceAA依赖了serviceBB");
    }
}
