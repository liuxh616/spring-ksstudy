package com.fengfang.test;

import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 16:38
 **/
public class AnnoTest {
    @Test
    public void testComponent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.getName());
    }
}
