package com.fengfang.proxydemo2;

import com.fengfang.proxydemo2.impl.UserDaoImpl;
import com.fengfang.proxydemo2.impl.UserDaoProxy;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 9:48
 **/
public class Client {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
       /*
       //原有实现方式，需更新原有的方法代码
       userDao.add();
       */
       //使用代理的实现方式
        UserDaoProxy proxy = new UserDaoProxy();
        proxy.setUserDao(userDao);
        proxy.add();
    }
}
