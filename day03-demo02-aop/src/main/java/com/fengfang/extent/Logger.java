package com.fengfang.extent;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 16:33
 **/
public class Logger implements MethodBeforeAdvice {
    /**
     *
     * @param method 要执行的方法
     * @param objects 参数对象
     * @param o   目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+ "的"+method.getName()+" 增加前置通知！");
    }
}
