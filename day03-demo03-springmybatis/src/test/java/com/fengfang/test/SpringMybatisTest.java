package com.fengfang.test;

import com.fengfang.dao.impl.UserDaoImpl;
import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 10:58
 **/
public class SpringMybatisTest {

    @Test
    public void testSpringMybatis(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userdaoImpl = context.getBean("userdaoImpl", UserDaoImpl.class);
        List<User> userList = userdaoImpl.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
