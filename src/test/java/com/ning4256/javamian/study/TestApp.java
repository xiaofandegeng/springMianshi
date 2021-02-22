package com.ning4256.javamian.study;

import com.ning4256.javamian.spring.CalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringRunner.class)
public class TestApp {
    @Resource
    private CalService calService;

    @Test
    public void TestAop4() {
        System.out.println("当前spring的版本:" + SpringVersion.getVersion() + ",当前springBoot的版本:" + SpringBootVersion.getVersion());

        calService.div(10, 0);

    }
}
