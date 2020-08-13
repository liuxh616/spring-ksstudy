package com.fengfang.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/13 15:33
 * @Component表示这个类会被Spring容器接管，并注册为一个bean
 * @Value 表示对属性注入
 **/
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("aaronTe")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
