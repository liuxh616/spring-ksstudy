package com.fengfang.proxydemo4;

import com.fengfang.proxydemo2.IUserDao;
import com.fengfang.proxydemo2.impl.UserDaoImpl;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 15:57
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserDaoImpl userDao = new UserDaoImpl();
        //代理角色还不存在，创建生成代理类的实例
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        //设置要代理的对象
        invocationHandler.setTarget(userDao);
        //动态生成代理类
        IUserDao proxy = (IUserDao) invocationHandler.getProxy();
        proxy.delete();
    }
}
