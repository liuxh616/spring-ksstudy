package com.fengfang.test;

import com.fengfang.dao.IUserDao;
import com.fengfang.dao.impl.UserDaoImpl;
import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 15:19
 **/
public class MybatisTest {
    @Test
    public void testFindAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userdaoimpl = context.getBean("userdaoimpl", IUserDao.class);
        List<User> userList = userdaoimpl.findall();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
