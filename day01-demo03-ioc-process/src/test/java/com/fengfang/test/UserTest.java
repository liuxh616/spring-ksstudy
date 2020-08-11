package com.fengfang.test;

import com.fengfang.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 17:07
 **/
public class UserTest {
    public static void main(String[] args) {
//        User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User myUser = (User) context.getBean("user");
        System.out.println(myUser.toString());
    }
}
