package com.fengfang.proxydemo3;

import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description 会用这个类来动态生成代理类
 * @Author liuxh
 * @Date 2020/8/14 15:38
 **/

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);

    }

    /**
     * 处理代理实例，并返回结果
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        seeHourse();
        Object result= method.invoke(rent,args);
        fare();
        return result;
    }

    public void seeHourse(){
        System.out.println("带租客去看房子！");
    }

    public void fare(){
        System.out.println("收取中介费！");
    }
}
