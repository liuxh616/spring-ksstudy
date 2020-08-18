package com.fengfang.test;

import com.fengfang.dao.impl.UserDaoTwo;
import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 14:54
 **/
public class SpringMybatisTwoTest {
    @Test
    public void testTwo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoTwo userDaoTwo = context.getBean("userDaoTwo", UserDaoTwo.class);
        List<User> userList = userDaoTwo.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
