package com.fengfang.test;

import com.fengfang.dao.impl.UserDaoImpl;
import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 15:33
 **/
public class TransTest {
    @Test
    public void testTrans(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userdaoimpl = context.getBean("userdaoimpl", UserDaoImpl.class);
        User user = new User("刘经和", "21311");
        userdaoimpl.addUser(user);
        User user2 = new User("张开行", "236548");
        userdaoimpl.addUser(user);
        //删除失败，但插入成功了，这不符合事务执行原则
        int re = userdaoimpl.deleteUser(1);


    }

}

