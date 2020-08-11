package com.fengfang;

import com.fengfang.dao.impl.UserDaoMysqlImpl;
import com.fengfang.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 14:36
 **/
public class IocTest {
    public static void main(String[] args) {
//        原始使用方法

    /*    UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        //用户调用业务层，不会直接调用dao层
        userService.findAll();*/
//    使用spring来管理容器后的写法是以下这样：
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.findAll();
    }
}
