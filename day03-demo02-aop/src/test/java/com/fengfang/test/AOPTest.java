package com.fengfang.test;

import com.fengfang.dao.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/17 10:42
 **/
public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        动态代理代理的是接口
        IUserDao userDao = (IUserDao) context.getBean("userservice");
        userDao.add();
    }
}
