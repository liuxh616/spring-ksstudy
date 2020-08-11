package com.fengfang.domain;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 17:05
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

//    public User() {
//        System.out.println("user的无参构造函数！");
//
//    }
//
    public User(String name){
        this.name = name;
    }
}
