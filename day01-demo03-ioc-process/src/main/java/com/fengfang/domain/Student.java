package com.fengfang.domain;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 17:28
 **/
public class Student {
    private String name;
    public Student(){
        System.out.println("这是Student无参构造函数！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
