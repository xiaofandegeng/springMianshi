package com.ning4256.javamian.circularDepenced.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class ServiceBB {
    private ServiceAA serviceAA;

    public ServiceBB(ServiceBB serviceBB) {
        this.serviceAA = serviceAA;
        System.out.println("serviceBB依赖了serviceAA");
    }
}
