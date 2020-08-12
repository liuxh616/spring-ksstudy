package com.fengfang.test;

import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 10:44
 **/
public class UserTest {
    @Test
    public void testPnamespace(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
        System.out.println(user==user1);
    }
}
