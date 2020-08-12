package com.fengfang.domain;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 16:15
 **/
public class Teacher {
    private String name;
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public void setName(String name) {
        this.name = name;
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
