package com.ning4256.javamian.circularDepenced.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class ServiceBB {
    private ServiceAA serviceAA;

    public void setServiceAA(ServiceAA serviceAA) {
        this.serviceAA = serviceAA;
        System.out.println("serviceBB设置了serviceAA");
    }
}
