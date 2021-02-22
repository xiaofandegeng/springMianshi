package com.ning4256.javamian.circularDepenced.setterinjection;

public class ClientSetter {
    public static void main(String[] args) {
        ServiceAA aa = new ServiceAA();
        ServiceBB bb = new ServiceBB();

        aa.setServiceBB(bb);
        bb.setServiceAA(aa);

    }
}
