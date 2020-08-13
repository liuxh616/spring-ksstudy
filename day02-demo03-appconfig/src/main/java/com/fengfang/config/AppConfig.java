package com.fengfang.config;

import com.fengfang.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.jws.soap.SOAPBinding;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/13 15:34
 * @Configuration 这个也会由Spring容器托管，注册到容器中，因为他本来就是一个@Component,
 * @Configuration代表这是一个配置类，跟我们之前看到的Spring的配置文件是一样的
 **/
@Configuration
@ComponentScan("com.fengfang.domain")
@Import(AppConfigTwo.class)
public class AppConfig {
    /**
     * @Bean，表示注册一个bean,就相当于我们之前的一个bean标签
     * 这个方法的名称，相当于我们之前bean标签中的Id
     * 这个方法的返回值，就相当于bean标签中的返回值类型
     * @return
     */
    @Bean
    public User getUser(){
        return new User();
    }
}
