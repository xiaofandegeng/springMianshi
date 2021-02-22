package com.ning4256.javamian.spring;

import org.springframework.stereotype.Service;

@Service
public class CalServiceImpl implements CalService{
    @Override
    public int div(int x, int y) {
        int result = x / y;
        System.out.println("    =======> CalServiceImpl被调用了，我们的计算结果：" + result);
        return result;
    }
}
