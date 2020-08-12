package com.fengfang.domain;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 11:11
 **/
public class Dog {
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shout(){
        System.out.println("狗在叫㕵㕵㕵...");
    }
}
