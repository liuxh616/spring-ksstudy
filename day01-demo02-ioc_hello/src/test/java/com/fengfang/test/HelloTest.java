package com.fengfang.test;

import com.fengfang.dao.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 15:25
 **/
public class HelloTest {
    public static void main(String[] args) {
//        获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//      我们的对象现在都在spring管理
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
