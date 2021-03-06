package com.fengfang.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 16:34
 **/
@Component
public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //相当于在bean中的一个属性定义：<properties name="name" value="aaron"></properties>
    @Value("aaron")
    private String name;


}
