package com.ning4256.javamian.circularDepenced.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class ServiceAA {
    private ServiceBB serviceBB;

    public void setServiceBB(ServiceBB serviceBB) {
        this.serviceBB = serviceBB;
        System.out.println("serviceAA设置了serviceBB");
    }
}
