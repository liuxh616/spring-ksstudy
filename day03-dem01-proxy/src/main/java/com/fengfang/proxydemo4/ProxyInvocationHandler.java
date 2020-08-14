package com.fengfang.proxydemo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 15:53
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    //要代理的类
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理理
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     * 处理代理类，执行代理方法并返回结果
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        extendMethod(method.getName());
        Object result= method.invoke(target,args);
        return result;
    }

    /**
     * 后续扩展方法
     * @param msg
     */
    public void extendMethod(String msg){
        System.out.println("在方法："+msg+" 中执行了扩展方法");
    }
}
