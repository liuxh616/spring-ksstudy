package com.fengfang.extent;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 16:35
 **/
public class AfterLogger implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+ "的"+method.getName()+" 增加后置通知！"+"返回结果："+returnValue);
    }
}
