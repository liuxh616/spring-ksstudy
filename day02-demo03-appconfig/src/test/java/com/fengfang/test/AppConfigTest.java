package com.fengfang.test;

import com.fengfang.config.AppConfig;
import com.fengfang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/13 15:36
 **/
public class AppConfigTest {
    /**
     * 如果我们完全使用了配置类方式来开发，我们就只能通过AnnotationConfig的上下文来获取容器，通过配置类的Class对象加载
     */
    @Test
    public void testAppConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
