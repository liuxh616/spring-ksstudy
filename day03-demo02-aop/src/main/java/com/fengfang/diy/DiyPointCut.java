package com.fengfang.diy;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/17 15:22
 **/
public class DiyPointCut {
    public void before(){
        System.out.println("...........方法前执行内容---自定义切面类方式.......");
    }
    public void after(){
        System.out.println("...........方法后执行内容---自定义切面类方式.......");
    }
}
