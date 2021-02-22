package com.ning4256.javamian.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(public int com.ning4256.javamian.spring.CalServiceImpl.*(..))")
    public void beforeNotify() {
        System.out.println("****** @Before 我是前置通知MyAspect");
    }

    @After("execution(public int com.ning4256.javamian.spring.CalServiceImpl.*(..))")
    public void afterNotify() {
        System.out.println("****** @After 我是后置通知MyAspect");
    }

    @AfterReturning("execution(public int com.ning4256.javamian.spring.CalServiceImpl.*(..))")
    public void afterReturingNotify() {
        System.out.println("****** @AfterReturning 我是返回后通知MyAspect");
    }

    @AfterThrowing("execution(public int com.ning4256.javamian.spring.CalServiceImpl.*(..))")
    public void afterThrowingNotify() {
        System.out.println("****** @AfterThrowing 我是异常消息通知MyAspect");
    }

    @Around("execution(public int com.ning4256.javamian.spring.CalServiceImpl.*(..))")
    public Object aroundNotify(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object res = null;
        System.out.println("我是环绕通知之前AAA");
        res = proceedingJoinPoint.proceed();
        System.out.println("我是环绕通知之前BBB");
        return res;
    }
}
