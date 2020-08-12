package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Test170GitApplication.class)
public class StringTest {
    @Test
    public void test()throws Exception{
        String s = "abc";
        //StringBuilder builder = new StringBuilder(s);
        //StringBuilder reverse = builder.reverse();
        String a = s.replace("a", "12");
        System.out.println(a);
        System.out.println("我是你的热");
    }
}
