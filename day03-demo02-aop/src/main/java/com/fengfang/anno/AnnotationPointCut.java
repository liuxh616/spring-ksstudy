package com.fengfang.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import javax.annotation.processing.ProcessingEnvironment;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/17 15:30
 **/
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.fengfang.dao.impl.UserDaoImplAOP.*(..))")
    public void before(){
        System.out.println("===========这是在方法前执行的操作--注解方式===========");
    }

    @After("execution(* com.fengfang.dao.impl.UserDaoImplAOP.*(..))")
    public void after(){
        System.out.println("===========这是在方法后执行的操作--注解方式===========");
    }

    @Around("execution(* com.fengfang.dao.impl.UserDaoImplAOP.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前执行通知");
        Signature signature = jp.getSignature();
        System.out.println("签名：--"+signature);
        Object process = jp.proceed();

        System.out.println("环绕后执行通知");
    }
}
