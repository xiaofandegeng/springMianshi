package com.ning4256.javamian.circularDepenced;

public class A {
    private B b;

    public B getB() {
        return b;
    }

    void setB(B b) {
        this.b = b;
    }

    public A() {
        System.out.println("---A created success");
    }
}
