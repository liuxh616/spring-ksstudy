package com.fengfang.proxydemo3;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 15:35
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的代理类
        invocationHandler.setRent(host);
        //这里的proxy是动态生成的，我们并没有生成代理类
        Rent proxy = (Rent) invocationHandler.getProxy();
        //调用代理方法
        proxy.rent();
    }
}
