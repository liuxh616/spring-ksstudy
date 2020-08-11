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
//        Spring容器，就类似于婚介网站
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        这里并没有获取Student类，但是发会现Student的无参构造函数也被初始化了
        User myUser = (User) context.getBean("userAlias");
        System.out.println(myUser.toString());
    }
}
