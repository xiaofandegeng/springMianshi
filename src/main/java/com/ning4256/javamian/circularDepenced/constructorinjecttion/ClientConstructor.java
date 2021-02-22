package com.ning4256.javamian.circularDepenced.constructorinjecttion;


import com.ning4256.javamian.circularDepenced.ServiceA;
import com.ning4256.javamian.circularDepenced.ServiceB;

public class ClientConstructor {
    public static void main(String[] args) {
        new ServiceA(new ServiceB());
    }
}
