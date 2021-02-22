package com.ning4256.javamian.circularDepenced;

public class B {
    private A a;

    public A getA() {
        return a;
    }

    void setA(A a) {
        this.a = a;
    }

    public B() {
        System.out.println("---B created success");
    }
}
