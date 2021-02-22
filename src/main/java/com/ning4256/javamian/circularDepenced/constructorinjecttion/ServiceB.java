package com.ning4256.javamian.circularDepenced.constructorinjecttion;

import com.ning4256.javamian.circularDepenced.constructorinjecttion.ServiceA;
import org.springframework.stereotype.Component;

@Component
public class ServiceB {
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
