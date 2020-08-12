package com.fengfang.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 14:48
 **/
public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    private Cat cat;
    @Autowired()
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }
}
