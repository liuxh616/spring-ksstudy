package com.fengfang.config;

import com.fengfang.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jws.soap.SOAPBinding;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/13 15:46
 **/
@Configuration
public class AppConfigTwo {
    @Bean
    public User user(){
        return new User();
    }
}
