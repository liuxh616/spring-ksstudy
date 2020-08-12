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
    @Value("aaron")
    private String name;


}
